---
title: "EntityAddSnapshot"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.snapshot"
fqcn: "com.hypixel.hytale.builtin.buildertools.snapshot.EntityAddSnapshot"
api_surface: false
extends: ~
implements: 
  - "EntitySnapshot<EntityRemoveSnapshot>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builder-tools"
  - "snapshot"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.snapshot`

```java
public class EntityAddSnapshot implements EntitySnapshot<EntityRemoveSnapshot>
```

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

| Field | Type | Description |
|---|---|---|
| `entityRef` | `Ref<EntityStore>` | final Ref<EntityStore> field. |

## Constructors

| Constructor | Description |
|---|---|
| `EntityAddSnapshot(Ref<EntityStore> entityRef)` | Creates a new EntityAddSnapshot instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getEntityRef()` | `Ref<EntityStore>` | public method. |
| `restoreEntity(@Nonnull Player player, @Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `EntityRemoveSnapshot` | public method. |
