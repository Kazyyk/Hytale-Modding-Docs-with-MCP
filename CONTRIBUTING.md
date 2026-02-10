# Contributing

Thanks for your interest in contributing to Hytale Modding Docs!

## Legal Notice

This project generates documentation from Hytale's server software, which is
the intellectual property of Hypixel Studios. By contributing, you agree that:

- Your contributions to the **tooling and infrastructure** are licensed under
  the MIT License (see [LICENSE](LICENSE)).
- You will not submit content that violates Hypixel Studios' intellectual
  property rights or terms of service.
- You will not include proprietary game assets, textures, sounds, or other
  copyrighted material from Hytale.

## What You Can Contribute

### Pipeline Improvements

- Bug fixes in the decompile, classify, map, or generate phases
- Better heuristics for API surface classification
- New system mappers (e.g., additional registry types, networking, etc.)
- Improved prose generation templates

### Site Improvements

- UI/UX improvements to the Starlight documentation site
- Better navigation, search, or cross-referencing
- Accessibility fixes
- Custom components for displaying API data

### MCP Server

- Additional MCP tools (e.g., filtered search by system type, lookup by
  fully qualified class name)
- Performance improvements
- Better error handling

### Documentation

- README improvements
- Guides for running the pipeline against new JAR versions
- Tutorials for using the MCP server with different clients

## How to Contribute

1. **Open an issue first** for anything non-trivial. Describe what you want
   to change and why. This saves everyone time if the approach needs
   discussion.

2. **Fork the repo** and create a feature branch from `main`.

3. **Keep changes focused.** One PR per logical change. Don't bundle
   unrelated fixes.

4. **Test your changes:**
   - Pipeline changes: verify output against the current JAR
   - Site changes: `cd site && npm run build` must succeed
   - MCP changes: `cd mcp && npx tsc --noEmit` must pass

5. **Open a pull request** with a clear description of what changed and why.

## What to Avoid

- **Do not commit decompiled source code.** The `artifacts/decompiled/`
  directory is gitignored for a reason.
- **Do not commit the HytaleServer.jar.** The `input/` directory should
  only ever contain the JAR locally.
- **Do not fabricate API documentation.** Every documented type, method,
  and field must be traceable to the decompiled source. If something can't
  be determined from the code, say so explicitly rather than guessing.
- **Do not submit AI-generated PRs without review.** LLMs are tools, not
  authors. You are responsible for the correctness of your contribution.

## Development Setup

```bash
# Clone the repo
git clone https://github.com/Kazyyk/Hytale-Modding-Docs-with-MCP.git
cd Hytale-Modding-Docs-with-MCP

# Site development
cd site
npm install
npm run dev

# MCP server development
cd mcp
npm install
npx wrangler types
npx wrangler dev
```

## Questions?

Open an issue or reach out at kaz@kobo.dev.
