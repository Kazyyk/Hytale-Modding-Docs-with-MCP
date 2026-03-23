---
title: "NEntityBuffer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers.NEntityBuffer"
api_surface: false
extends: "NBuffer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "newsystem"
  - "bufferbundle"
  - "buffers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers`

```java
public class NEntityBuffer extends NBuffer
```

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private` | `List<EntityPlacementData>` | `entities` |
| `private` | `boolean` | `isReference` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public void` | `forEach(@Nonnull Consumer<EntityPlacementData> consumer)` |
| `` | `public void` | `addEntity(@Nonnull EntityPlacementData entityPlacementData)` |
| `@Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `` | `public void` | `copyFrom(@Nonnull NEntityBuffer sourceBuffer)` |
