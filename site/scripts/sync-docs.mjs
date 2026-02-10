/**
 * Syncs generated markdown from output/docs/ into the Starlight content directory.
 *
 * - Copies all .md files preserving directory structure
 * - Patches root index.md with Starlight splash template + hero
 * - Skips non-markdown files (meta.json, progress.json)
 * - Runs as part of `npm run build` and `npm run dev`
 */

import { existsSync, mkdirSync, cpSync, readFileSync, writeFileSync, rmSync } from "node:fs";
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

function patchLandingPage(content) {
  // Add template: splash and a hero section to the root index.md
  // so Starlight renders it as a proper landing page
  if (!content.includes("template:")) {
    // Insert template: splash after the title line in frontmatter
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
for (const relPath of files) {
  const src = join(SOURCE_DIR, relPath);
  const dest = join(TARGET_DIR, relPath);

  mkdirSync(dirname(dest), { recursive: true });

  let content = readFileSync(src, "utf-8");

  // Patch root landing page for Starlight splash template
  if (relPath === "index.md") {
    content = patchLandingPage(content);
  }

  writeFileSync(dest, content);
  synced++;
}

console.log(`Synced ${synced} files.`);
