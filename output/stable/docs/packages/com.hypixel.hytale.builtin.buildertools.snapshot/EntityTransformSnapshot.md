---
title: "EntityTransformSnapshot"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.snapshot"
fqcn: "com.hypixel.hytale.builtin.buildertools.snapshot.EntityTransformSnapshot"
api_surface: false
extends: ~
implements: 
  - "EntitySnapshot<EntityTransformSnapshot>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builder-tools"
  - "snapshot"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.snapshot`

```java
public class EntityTransformSnapshot implements EntitySnapshot<EntityTransformSnapshot>
```

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

| Field | Type | Description |
|---|---|---|
| `ref` | `Ref<EntityStore>` | final Ref<EntityStore> field. |
| `transform` | `Transform` | final Transform field. |
| `headRotation` | `Vector3f` | final Vector3f field. |

## Constructors

| Constructor | Description |
|---|---|
| `EntityTransformSnapshot(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | Creates a new EntityTransformSnapshot instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `restoreEntity(@Nonnull Player player, @Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `EntityTransformSnapshot` | public method. |
