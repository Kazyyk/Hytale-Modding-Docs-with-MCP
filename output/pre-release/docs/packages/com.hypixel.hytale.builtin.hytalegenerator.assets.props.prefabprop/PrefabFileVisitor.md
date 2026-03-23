---
title: "PrefabFileVisitor"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.PrefabFileVisitor"
api_surface: false
extends: "SimpleFileVisitor<Path>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "props"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop`

```java
public class PrefabFileVisitor extends SimpleFileVisitor<Path>
```

Extends `SimpleFileVisitor` to provide PrefabFileVisitor functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `List<PrefabBuffer>` | `prefabBuffers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `PrefabFileVisitor(@Nonnull List<PrefabBuffer> prefabBuffers)` |
| `@Nonnull public` | `FileVisitResult` | `visitFile(@Nonnull Path file, @Nonnull BasicFileAttributes attrs)` |
