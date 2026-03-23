---
title: "FileBrowserConfig.Builder"
kind: "class"
package: "com.hypixel.hytale.server.core.ui.browser"
fqcn: "com.hypixel.hytale.server.core.ui.browser.FileBrowserConfig.Builder"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "ui"
  - "browser"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.core.ui.browser`

```java
public static class Builder
```

Fluent builder for [FileBrowserConfig](FileBrowserConfig.md). Provides setter methods for all configuration options with sensible defaults (e.g., `maxResults = 50`, `enableSearch = true`, `enableDirectoryNav = true`).

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `FileBrowserConfig.Builder` | `listElementId(@Nonnull String listElementId)` |
| `public` | `FileBrowserConfig.Builder` | `rootSelectorId(@Nullable String rootSelectorId)` |
| `public` | `FileBrowserConfig.Builder` | `searchInputId(@Nullable String searchInputId)` |
| `public` | `FileBrowserConfig.Builder` | `currentPathId(@Nullable String currentPathId)` |
| `public` | `FileBrowserConfig.Builder` | `roots(@Nonnull List<FileBrowserConfig.RootEntry> roots)` |
| `public` | `FileBrowserConfig.Builder` | `allowedExtensions(@Nonnull String... extensions)` |
| `public` | `FileBrowserConfig.Builder` | `allowedExtensions(@Nonnull Set<String> extensions)` |
| `public` | `FileBrowserConfig.Builder` | `enableRootSelector(boolean enable)` |
| `public` | `FileBrowserConfig.Builder` | `enableSearch(boolean enable)` |
| `public` | `FileBrowserConfig.Builder` | `enableDirectoryNav(boolean enable)` |
| `public` | `FileBrowserConfig.Builder` | `enableMultiSelect(boolean enable)` |
| `public` | `FileBrowserConfig.Builder` | `maxResults(int maxResults)` |
| `public` | `FileBrowserConfig.Builder` | `customProvider(@Nullable FileListProvider provider)` |
| `public` | `FileBrowserConfig.Builder` | `assetPackMode(boolean enable, @Nullable String subPath)` |
| `public` | `FileBrowserConfig.Builder` | `terminalDirectoryPredicate(@Nullable Predicate<Path> predicate)` |
| `public` | `FileBrowserConfig` | `build()` |
