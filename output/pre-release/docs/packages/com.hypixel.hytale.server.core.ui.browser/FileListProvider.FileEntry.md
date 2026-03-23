---
title: "FileListProvider.FileEntry"
kind: "record"
package: "com.hypixel.hytale.server.core.ui.browser"
fqcn: "com.hypixel.hytale.server.core.ui.browser.FileListProvider.FileEntry"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "ui"
  - "browser"
  - "entry"
---

**Package:** `com.hypixel.hytale.server.core.ui.browser`

```java
public record FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal, int matchScore)
```

Represents a file or directory entry in the file browser listing. The `isTerminal` flag indicates directories that should not be navigated into (treated as selectable items). The `matchScore` is used for ranking search results.

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `FileEntry(@Nonnull String name, boolean isDirectory)` |
| `public` | `FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory)` |
| `public` | `FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal)` |
| `public` | `FileEntry(@Nonnull String name, @Nonnull String displayName, boolean isDirectory, boolean isTerminal, int matchScore)` |
