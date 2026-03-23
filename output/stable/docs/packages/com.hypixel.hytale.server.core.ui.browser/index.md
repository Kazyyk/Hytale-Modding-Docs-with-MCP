---
title: "com.hypixel.hytale.server.core.ui.browser"
kind: "package"
package: "com.hypixel.hytale.server.core.ui.browser"
fqcn: "com.hypixel.hytale.server.core.ui.browser"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "core"
  - "ui"
  - "browser"
---

**Package:** `com.hypixel.hytale.server.core.ui.browser`

Server-side file browser UI framework. Provides configuration, event data handling, file listing providers, and the main browser controller for navigating filesystem and asset pack directories through the custom UI system.

## Types

| Type | Kind | Description |
|---|---|---|
| [FileBrowserConfig](FileBrowserConfig.md) | record | Immutable configuration for the file browser |
| [FileBrowserConfig.Builder](FileBrowserConfig.Builder.md) | class | Fluent builder for FileBrowserConfig |
| [FileBrowserConfig.RootEntry](FileBrowserConfig.RootEntry.md) | record | Root directory entry with display name and path |
| [FileBrowserEventData](FileBrowserEventData.md) | class | Codec event data for browser interactions |
| [FileListProvider](FileListProvider.md) | interface | Functional interface for custom file listings |
| [FileListProvider.FileEntry](FileListProvider.FileEntry.md) | record | File/directory entry in browser listings |
| [ServerFileBrowser](ServerFileBrowser.md) | class | Main server-side file browser controller |
