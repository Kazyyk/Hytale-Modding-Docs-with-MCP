---
title: "BufferBundle.Access"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.BufferBundle.Access"
api_surface: false
extends: null
implements: ["MemInstrument"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "bufferbundle"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle`

```java
public static class BufferBundle.Access implements MemInstrument
```

Provides bounded read access into a [BufferBundle.Grid](BufferBundle.Grid.md). Maintains an array of tracked buffers within specified 3D bounds (buffer grid coordinates). The Y range is always clamped to [0, 40). Once closed, all buffer references are cleared and further access is prohibited.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [BufferBundle.Access.View](BufferBundle.Access.View.md) | class | Read-only sub-view into an Access's buffer range |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `BufferBundle.Grid` | `grid` |
| `@Nonnull private final` | `Bounds3i` | `bounds_bufferGrid` |
| `@Nonnull private final` | `BufferBundle.Grid.TrackedBuffer[]` | `buffers` |
| `private` | `boolean` | `isClosed` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `Access(@Nonnull BufferBundle.Grid grid, @Nonnull Bounds3i bounds_bufferGrid)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BufferBundle.Access.View` | `createView(@Nonnull Bounds3i viewBounds_bufferGrid)` |
| `@Nonnull public` | `BufferBundle.Access.View` | `createView()` |
| `@Nonnull public` | `BufferBundle.Grid.TrackedBuffer` | `getBuffer(int x_bufferGrid, int y_bufferGrid, int z_bufferGrid)` |
| `@Nonnull public` | `BufferBundle.Grid.TrackedBuffer` | `getBuffer(@Nonnull Vector3i position_bufferGrid)` |
| `@Nonnull public` | `Bounds3i` | `getBounds_bufferGrid()` |
| `public` | `void` | `close()` |
| `@Nonnull @Override public` | `MemInstrument.Report` | `getMemoryUsage()` |
| `private` | `void` | `loadGrid()` |
