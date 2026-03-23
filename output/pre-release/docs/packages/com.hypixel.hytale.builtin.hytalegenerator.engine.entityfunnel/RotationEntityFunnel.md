---
title: "RotationEntityFunnel"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.entityfunnel"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.entityfunnel.RotationEntityFunnel"
api_surface: false
extends: null
implements: ["EntityFunnel"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "entityfunnel"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.entityfunnel`

```java
public class RotationEntityFunnel implements EntityFunnel
```

An [EntityFunnel](EntityFunnel.md) decorator that applies a rotation transform to entity placement data before delegating to a source funnel. Rotates both the entity offset position and the entity's transform (position and rotation) around an anchor point using a `RotationTuple`. The view bounds are the inverse rotation of the source's bounds.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `RotationTuple` | `rotation_fromViewToSource` |
| `@Nonnull private` | `Bounds3i` | `viewBounds` |
| `@Nonnull private` | `EntityFunnel` | `source` |
| `@Nonnull private final` | `Vector3i` | `anchor` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `RotationEntityFunnel(@Nonnull RotationTuple rotation)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setSource(@Nonnull EntityFunnel source, @Nonnull Vector3i anchor)` |
| `@Override public` | `void` | `addEntity(@Nonnull EntityPlacementData entityPlacementData)` |
| `@Override public` | `Bounds3i` | `getBounds()` |
