/**
 * Syncs generated markdown from output/docs/ into the Starlight content directory.
 *
 * - Copies all .md files preserving directory structure
 * - Rewrites internal .md links to Starlight-compatible clean URLs
 * - Patches root index.md with Starlight splash template + hero
 * - Skips non-markdown files (meta.json, progress.json)
 * - Runs as part of `npm run build` and `npm run dev`
 */

import { existsSync, mkdirSync, readFileSync, writeFileSync, rmSync } from "node:fs";
import { resolve, dirname, relative, join } from "node:path";
import { readdirSync, statSync } from "node:fs";

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
 *
 * Transforms:
 *   [Events](events/index.md)         → [Events](events/)
 *   [Events](api/events/index.md)     → [Events](api/events/)
 *   [Schemas](../schemas/index.md)    → [Schemas](../schemas/)
 *   [Command](AbstractCommand.md)     → [Command](abstractcommand/)
 *   [Ref](Store.md#ref-section)       → [Ref](store/#ref-section)
 *
 * Starlight lowercases all slugs and serves each page as a directory
 * (e.g., Store.md → /api/classes/store/), so this function:
 *   1. Strips .md extensions
 *   2. Strips /index suffixes
 *   3. Lowercases path segments (preserving ../ navigation)
 *   4. Ensures trailing slash on non-anchor, non-dot paths
 *
 * Leaves external links (http://, https://) and anchor-only links (#foo)
 * untouched.
 */
function rewriteLinks(content) {
  // Match markdown links: [text](url) and [text](url#anchor)
  // Only process links whose URL portion contains .md
  return content.replace(
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

      // Strip .md extension
      path = path.replace(/\.md$/, "");

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

      return `[${text}](${path}${anchor})`;
    }
  );
}

function patchLandingPage(content) {
  // Add template: splash and a hero section to the root index.md
  // so Starlight renders it as a proper landing page
  if (!content.includes("template:")) {
    content = content.replace(
      /^(---\n(?:.*\n)*?title:\s*.*\n)/m,
      "$1template: splash\nhero:\n  tagline: Auto-generated API reference from the Hytale server JAR\n  actions:\n    - text: API Reference\n      link: /api/\n      icon: right-arrow\n    - text: View on GitHub\n      link: https://github.com/Kazyyk/Hytale-Modding-Docs-with-MCP\n      icon: external\n      variant: minimal\n"
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
console.log(`Syncing ${files.length} markdown files from output/docs/ → site/src/content/docs/`);

let synced = 0;
let linksRewritten = 0;

for (const relPath of files) {
  const src = join(SOURCE_DIR, relPath);
  const dest = join(TARGET_DIR, relPath);

  mkdirSync(dirname(dest), { recursive: true });

  let content = readFileSync(src, "utf-8");

  // Count .md links before rewriting (for logging)
  const mdLinkCount = (content.match(/\]\([^)]*\.md/g) || []).length;
  linksRewritten += mdLinkCount;

  // Rewrite .md links to clean URLs
  content = rewriteLinks(content);

  // Patch root landing page for Starlight splash template
  if (relPath === "index.md") {
    content = patchLandingPage(content);
  }

  writeFileSync(dest, content);
  synced++;
}

console.log(`Synced ${synced} files, rewrote ${linksRewritten} internal links.`);