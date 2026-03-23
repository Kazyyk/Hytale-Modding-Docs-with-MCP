---
title: "FileIOSystem"
kind: "interface"
package: "com.hypixel.hytale.procedurallib.file"
fqcn: "com.hypixel.hytale.procedurallib.file.FileIOSystem"
api_surface: false
extends: "AutoCloseable"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "procedurallib"
  - "file"
  - "interface"
---

**Package:** `com.hypixel.hytale.procedurallib.file`

```java
public interface FileIOSystem extends AutoCloseable
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull` | `Path` | `baseRoot()` |
| `@Nonnull` | `FileIOSystem.PathArray` | `roots()` |
| `@Nonnull default` | `AssetPath` | `resolve(@Nonnull Path path)` |
| `@Nonnull default` | `<T> T` | `load(@Nonnull AssetPath path, @Nonnull AssetLoader<T> loader)` |
| `@Override default` | `void` | `close()` |

## Inner Types

- `FileIOSystem.PathArray`
- `FileIOSystem.Provider`
