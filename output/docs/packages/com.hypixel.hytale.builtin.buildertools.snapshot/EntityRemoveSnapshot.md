---
title: "EntityRemoveSnapshot"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.snapshot"
fqcn: "com.hypixel.hytale.builtin.buildertools.snapshot.EntityRemoveSnapshot"
api_surface: false
extends: ~
implements: 
  - "EntitySnapshot<EntityAddSnapshot>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builder-tools"
  - "snapshot"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.snapshot`

```java
public class EntityRemoveSnapshot implements EntitySnapshot<EntityAddSnapshot>
```

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

| Field | Type | Description |
|---|---|---|
| `holder` | `Holder<EntityStore>` | final Holder<EntityStore> field. |

## Constructors

| Constructor | Description |
|---|---|
| `EntityRemoveSnapshot(@Nonnull Ref<EntityStore> ref)` | Creates a new EntityRemoveSnapshot instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getHolder()` | `Holder<EntityStore>` | public method. |
| `restoreEntity(@Nonnull Player player, @Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `EntityAddSnapshot` | public method. |
