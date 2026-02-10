# Hytale Server API Index — Starlight Site

Astro Starlight documentation site for the auto-generated Hytale server API reference.

## How It Works

The generated markdown in `output/docs/` is the source of truth. At build time, a sync script copies those files into Starlight's `src/content/docs/` directory and patches the landing page with Starlight's splash template.

```
output/docs/  →  scripts/sync-docs.mjs  →  src/content/docs/  →  astro build  →  dist/
```

## Local Development

```bash
cd site
npm install
npm run dev      # Syncs docs + starts dev server at localhost:4321
```

## Production Build

```bash
cd site
npm run build    # Syncs docs + builds static site to dist/
npm run preview  # Preview the built site locally
```

## Cloudflare Pages Deployment

1. Connect this repo to Cloudflare Pages
2. Set **Root directory** to `site`
3. Set **Build command** to `npm run build`
4. Set **Build output directory** to `dist`
5. Set **Node.js version** to `22` (environment variable: `NODE_VERSION=22`)

Pages will automatically rebuild when the repo is pushed to.

## Project Structure

```
site/
├── astro.config.mjs          # Starlight config (sidebar, theme, metadata)
├── src/
│   ├── content.config.ts     # Extended frontmatter schema for Hytale docs
│   ├── content/docs/         # Synced from output/docs/ (gitignored)
│   └── styles/custom.css     # Hytale-themed color overrides
├── scripts/
│   └── sync-docs.mjs         # Copies + patches docs at build time
├── public/                   # Static assets (favicon, etc.)
└── package.json
```

## Custom Frontmatter

The generated docs include custom frontmatter fields beyond Starlight's defaults. These are declared in `src/content.config.ts`:

- `kind` — Type classification (class, interface, event, schema, overview, etc.)
- `fqcn` — Fully qualified class name
- `package` — Java package
- `api_surface` — Whether the type is `public` (plugin API) or `internal`
- `cancellable` — For events: whether the event can be cancelled
- `related` — Cross-references to other documented types
- `tags` — Free-form tags for search and filtering
