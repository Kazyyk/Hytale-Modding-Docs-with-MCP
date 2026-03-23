---
title: "FileBrowserConfig"
kind: "record"
package: "com.hypixel.hytale.server.core.ui.browser"
fqcn: "com.hypixel.hytale.server.core.ui.browser.FileBrowserConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "ui"
  - "browser"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.ui.browser`

```java
public record FileBrowserConfig(
    @Nonnull String listElementId,
    @Nullable String rootSelectorId,
    @Nullable String searchInputId,
    @Nullable String currentPathId,
    @Nonnull List<FileBrowserConfig.RootEntry> roots,
    @Nonnull Set<String> allowedExtensions,
    boolean enableRootSelector,
    boolean enableSearch,
    boolean enableDirectoryNav,
    boolean enableMultiSelect,
    int maxResults,
    @Nullable FileListProvider customProvider,
    boolean assetPackMode,
    @Nullable String assetPackSubPath,
    @Nullable Predicate<Path> terminalDirectoryPredicate
)
```

Immutable configuration record for the server file browser UI. Controls which UI elements are present (root selector, search input, path display), file filtering by extension, navigation behavior, multi-select support, maximum search results, asset pack browsing mode, and terminal directory detection.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `FileBrowserConfig.Builder` | `builder()` |

## Inner Types

- [FileBrowserConfig.Builder](FileBrowserConfig.Builder.md) -- fluent builder for constructing config instances
- [FileBrowserConfig.RootEntry](FileBrowserConfig.RootEntry.md) -- root directory entry with display name and path
