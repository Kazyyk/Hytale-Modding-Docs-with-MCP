---
title: "NEntityBufferView"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.views"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.views.NEntityBufferView"
api_surface: false
extends: ~
implements: ["EntityContainer"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "newsystem"
  - "views"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.views`

```java
public class NEntityBufferView implements EntityContainer
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `NBufferBundle.Access.View` | `access` |
| `@Nonnull private final` | `Bounds3i` | `bounds_voxelGrid` |
| `@Nonnull private final` | `Bounds3i` | `bounds_bufferGrid` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `NEntityBufferView(@Nonnull NBufferBundle.Access.View bufferAccess)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `forEach(@Nonnull Consumer<EntityPlacementData> consumer)` |
| `@Nonnull private` | `NEntityBuffer` | `getBuffer_fromBufferGrid(@Nonnull Vector3i position_bufferGrid)` |
| `public` | `void` | `copyFrom(@Nonnull NEntityBufferView source)` |
| `@Override public` | `void` | `addEntity(@Nonnull EntityPlacementData entityPlacementData)` |
| `@Override public` | `boolean` | `isInsideBuffer(int x, int y, int z)` |
