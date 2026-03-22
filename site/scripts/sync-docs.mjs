/**
 * Syncs generated markdown from output/docs/ into the Starlight content directory.
 *
 * - Copies all .md files preserving directory structure
 * - Rewrites internal .md links to Starlight-compatible clean URLs
 * - Detects dangling links (targets that don't exist) and strips them to code text
 * - Patches root index.md with Starlight splash template + hero
 * - Skips non-markdown files (meta.json, progress.json)
 * - Runs as part of `npm run build` and `npm run dev`
 *
 * Flags:
 *   --strict  Fail with exit code 1 if any dangling links are detected.
 *             Use in CI/deployment builds to enforce zero broken references.
 */

import { existsSync, mkdirSync, readFileSync, writeFileSync, rmSync } from "node:fs";
import { resolve, dirname, relative, join } from "node:path";
import { readdirSync, statSync } from "node:fs";

const STRICT = process.argv.includes("--strict");

const PROJECT_ROOT = resolve(dirname(new URL(import.meta.url).pathname), "../..");
const SOURCE_DIR = join(PROJECT_ROOT, "output/docs");
const TARGET_DIR = join(PROJECT_ROOT, "site/src/content/docs");

function walkFiles(dir, base = dir) {
  const results = [];
  for (const entry of readdirSync(dir)) {
    const full = join(dir, entry);
    const stat = statSync(full);
    if (stat.isDirectory()) {
      results.push(...walkFiles(full, base));
    } else if (entry.endsWith(".md")) {
      results.push(relative(base, full));
    }
  }
  return results;
}

/**
 * Rewrites internal markdown links from .md paths to Starlight clean URLs.
 * Converts dangling links (targets that don't exist) to inline code text.
 *
 * Transforms:
 *   [Events](events/index.md)         → [Events](events/)
 *   [Events](api/events/index.md)     → [Events](api/events/)
 *   [Schemas](../schemas/index.md)    → [Schemas](../schemas/)
 *   [Command](AbstractCommand.md)     → [Command](../abstractcommand/)  (from non-index)
 *   [Command](AbstractCommand.md)     → [Command](abstractcommand/)     (from index)
 *   [Ref](Store.md#ref-section)       → [Ref](../store/#ref-section)    (from non-index)
 *   [Missing](Missing.md)             → `Missing` (dangling link)
 *
 * Starlight lowercases all slugs and serves each page as a directory
 * (e.g., Store.md → /api/classes/store/), so this function:
 *   1. Checks if target file exists; if not, converts to code text
 *   2. Strips .md extensions
 *   3. Strips /index suffixes
 *   4. Lowercases path segments (preserving ../ navigation)
 *   5. Ensures trailing slash on non-anchor, non-dot paths
 *   6. For non-index pages, prepends ../ to escape the page's virtual directory
 *
 * Leaves external links (http://, https://) and anchor-only links (#foo)
 * untouched.
 *
 * @param {string} content - Markdown file content
 * @param {string} fileDir - Directory of the current file (relative to docs root)
 * @param {Set<string>} fileSet - Set of all .md file paths (relative to docs root)
 * @param {boolean} isIndex - Whether the source file is an index.md page
 * @returns {{ content: string, danglingCount: number }}
 */
function rewriteLinks(content, fileDir, fileSet, isIndex = false) {
  let danglingCount = 0;
  const danglingFound = [];

  const rewritten = content.replace(
    /\[([^\]]*)\]\(([^)]*\.md(?:#[^)]*)?)\)/g,
    (_match, text, href) => {
      // Split off anchor if present
      const anchorIdx = href.indexOf("#");
      let path, anchor;
      if (anchorIdx !== -1) {
        path = href.slice(0, anchorIdx);
        anchor = href.slice(anchorIdx);
      } else {
        path = href;
        anchor = "";
      }

      // Skip external links (shouldn't have .md but just in case)
      if (path.startsWith("http://") || path.startsWith("https://")) {
        return `[${text}](${href})`;
      }

      // Check if the target file exists by resolving relative to fileDir
      const resolved = join(fileDir, path).replace(/\\/g, "/");
      // Normalize away any leading "./" and resolve ".." segments
      const normalized = resolve("/", resolved).slice(1); // Use resolve trick to normalize
      // Also check with hyphens converted back to dots (index.md has pre-hyphenated paths)
      const normalizedDotted = normalized.replace(/packages\/([^/]+)/, (_, pkg) => "packages/" + pkg.replace(/-/g, "."));
      if (!fileSet.has(normalized) && !fileSet.has(normalizedDotted)) {
        danglingCount++;
        danglingFound.push({ target: normalized, text });
        // Convert to inline code text instead of a broken link
        return `\`${text}\``;
      }

      // Strip .md extension FIRST (before dot-to-hyphen conversion)
      path = path.replace(/\.md$/, "");

      // Convert dotted package dir names to hyphens (matching rewritePackagePath)
      // Only convert directory segments, not the final filename segment
      const pathParts = path.split("/");
      for (let i = 0; i < pathParts.length - 1; i++) {
        if (pathParts[i] !== ".." && pathParts[i] !== "." && pathParts[i].includes(".")) {
          pathParts[i] = pathParts[i].replace(/\./g, "-");
        }
      }
      path = pathParts.join("/");

      // Strip trailing /index (Starlight serves index.md as the directory root)
      path = path.replace(/\/index$/, "/");

      // Handle bare "index" (e.g., a link to index.md from the same directory)
      if (path === "index") {
        path = ".";
      }

      // Lowercase path segments (Starlight lowercases all slugs)
      // Preserve ../ and ./ navigation prefixes
      path = path.split("/").map(segment =>
        segment === ".." || segment === "." ? segment : segment.toLowerCase()
      ).join("/");

      // Ensure trailing slash for Starlight directory-style URLs
      // Skip for "." paths and paths that already end with "/"
      if (path !== "." && !path.endsWith("/")) {
        path += "/";
      }

      // Starlight serves non-index pages as directories:
      //   CommandContext.md → /api/classes/commandcontext/
      // This shifts the browser's base URL one level deeper than the
      // filesystem directory, so relative links need an extra ../ to
      // escape the page's virtual directory. Index pages are unaffected
      // because their URL directory matches the filesystem directory.
      if (!isIndex) {
        if (path === ".") {
          path = "../";
        } else {
          path = "../" + path;
        }
      }

      return `[${text}](${path}${anchor})`;
    }
  );

  return { content: rewritten, danglingCount, danglingTargets: danglingFound };
}

function patchLandingPage(content) {
  // Add template: splash and a hero section to the root index.md
  // so Starlight renders it as a proper landing page
  if (!content.includes("template:")) {
    content = content.replace(
      /^(---\n(?:.*\n)*?title:\s*.*\n)/m,
      "$1template: splash\nhero:\n  tagline: Comprehensive Hytale source documentation — every type, every method, every system\n  actions:\n    - text: Browse Packages\n      link: /packages/com-hypixel-hytale-server-core-plugin/\n      icon: right-arrow\n"
    );
  }
  return content;
}

// Clean target directory
if (existsSync(TARGET_DIR)) {
  rmSync(TARGET_DIR, { recursive: true });
}

if (!existsSync(SOURCE_DIR)) {
  console.error(`ERROR: Source directory not found: ${SOURCE_DIR}`);
  console.error("Run the documentation generator first (Phases 1-4).");
  process.exit(1);
}

const files = walkFiles(SOURCE_DIR);
const fileSet = new Set(files);
// Also build a rewritten file set for dangling link detection against the dest paths
const rewrittenFileSet = new Set(files.map(f => rewritePackagePath(f)));
console.log(`Syncing ${files.length} markdown files from output/docs/ → site/src/content/docs/`);

let synced = 0;
let linksRewritten = 0;
let danglingTotal = 0;
const danglingTargets = new Set();
const danglingDetails = new Map();

/**
 * Converts dotted Java package directory names to hyphenated equivalents.
 * Starlight strips dots from slugs, so we use hyphens to preserve readability.
 * Only affects directory segments under packages/ — file names are untouched.
 *
 *   packages/com.hypixel.hytale.plugin/JavaPlugin.md
 *   → packages/com-hypixel-hytale-plugin/JavaPlugin.md
 */
function rewritePackagePath(relPath) {
  if (!relPath.startsWith("packages/")) return relPath;
  const parts = relPath.split("/");
  // parts[0] = "packages", parts[1] = dotted package name, rest = file path
  if (parts.length >= 2) {
    parts[1] = parts[1].replace(/\./g, "-");
  }
  return parts.join("/");
}

for (const relPath of files) {
  const src = join(SOURCE_DIR, relPath);
  const destRelPath = rewritePackagePath(relPath);
  const dest = join(TARGET_DIR, destRelPath);

  mkdirSync(dirname(dest), { recursive: true });

  let content = readFileSync(src, "utf-8");

  // Count .md links before rewriting (for logging)
  const mdLinkCount = (content.match(/\]\([^)]*\.md/g) || []).length;
  linksRewritten += mdLinkCount;

  // Rewrite .md links to clean URLs (dangling links become code text)
  const fileDir = dirname(relPath);
  const isIndex = relPath === "index.md" || relPath.endsWith("/index.md");
  const result = rewriteLinks(content, fileDir, fileSet, isIndex);
  content = result.content;
  danglingTotal += result.danglingCount;
  for (const d of result.danglingTargets) {
    danglingTargets.add(d.target);
    if (!danglingDetails.has(d.target)) danglingDetails.set(d.target, []);
    danglingDetails.get(d.target).push({ source: relPath, text: d.text });
  }

  // Patch root landing page for Starlight splash template
  if (relPath === "index.md") {
    content = patchLandingPage(content);
  }

  writeFileSync(dest, content);
  synced++;
}

console.log(`Synced ${synced} files, rewrote ${linksRewritten} internal links, stripped ${danglingTotal} dangling links.`);

if (danglingTargets.size > 0) {
  console.log(`\n=== DANGLING LINKS: ${danglingTargets.size} missing targets ===`);
  for (const [target, refs] of [...danglingDetails.entries()].sort()) {
    console.log(`  MISSING: ${target} (${refs.length} link${refs.length > 1 ? "s" : ""})`);
    for (const r of refs) {
      console.log(`    ← ${r.source}  [${r.text}]`);
    }
  }
  console.log("=== END DANGLING LINKS ===\n");

  if (STRICT) {
    console.error(`ERROR: --strict mode: ${danglingTotal} dangling links found across ${danglingTargets.size} missing targets. Build aborted.`);
    process.exit(1);
  }
}
