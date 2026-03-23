---
title: "EntityBufferView"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.views"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.views.EntityBufferView"
api_surface: false
extends: null
implements: ["EntityFunnel"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "views"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.views`

```java
public class EntityBufferView implements EntityFunnel
```

Provides a voxel-space view over entity buffers within a `BufferBundle.Access.View`. Implements `EntityFunnel` to receive entity placement data, converting voxel-grid positions to buffer-grid positions and adding entities to the appropriate `EntityBuffer`. Also supports iteration over all contained entities via `forEach` and bulk copying from another EntityBufferView.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `BufferBundle.Access.View` | `access` |
| `@Nonnull private final` | `Bounds3i` | `bounds_voxelGrid` |
| `@Nonnull private final` | `Bounds3i` | `bounds_bufferGrid` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `EntityBufferView(@Nonnull BufferBundle.Access.View bufferAccess)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `forEach(@Nonnull Consumer<EntityPlacementData> consumer)` |
| `@Nonnull private` | `EntityBuffer` | `getBuffer_fromBufferGrid(@Nonnull Vector3i position_bufferGrid)` |
| `public` | `void` | `copyFrom(@Nonnull EntityBufferView source)` |
| `@Override public` | `void` | `addEntity(@Nonnull EntityPlacementData entityPlacementData)` |
| `@Override public` | `Bounds3i` | `getBounds()` |
