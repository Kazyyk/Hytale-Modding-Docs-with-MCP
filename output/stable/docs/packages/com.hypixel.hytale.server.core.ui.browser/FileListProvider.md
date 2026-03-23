---
title: "FileListProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.ui.browser"
fqcn: "com.hypixel.hytale.server.core.ui.browser.FileListProvider"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "ui"
  - "browser"
  - "provider"
---

**Package:** `com.hypixel.hytale.server.core.ui.browser`

```java
@FunctionalInterface
public interface FileListProvider
```

Functional interface for providing custom file listings to the server file browser. Implementations return a list of file entries for a given directory path and search query.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `List<FileListProvider.FileEntry>` | `getFiles(@Nonnull Path var1, @Nonnull String var2)` |

## Inner Types

- [FileListProvider.FileEntry](FileListProvider.FileEntry.md) -- record describing a file or directory entry
