---
title: "BufferBundle.Access.View"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.BufferBundle.Access.View"
api_surface: false
extends: null
implements: []
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
public static class BufferBundle.Access.View
```

A read-only sub-view into a [BufferBundle.Access](BufferBundle.Access.md) bounded by a subset of the parent access's buffer grid coordinates. Delegates buffer lookups to the parent access while enforcing its own tighter bounds.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `BufferBundle.Access` | `access` |
| `@Nonnull private final` | `Bounds3i` | `bounds_bufferGrid` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `View(@Nonnull BufferBundle.Access access, @Nonnull Bounds3i bounds_bufferGrid)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BufferBundle.Grid.TrackedBuffer` | `getBuffer(int x_bufferGrid, int y_bufferGrid, int z_bufferGrid)` |
| `@Nonnull public` | `BufferBundle.Grid.TrackedBuffer` | `getBuffer(@Nonnull Vector3i position_bufferGrid)` |
| `@Nonnull public` | `Bounds3i` | `getBounds_bufferGrid()` |
