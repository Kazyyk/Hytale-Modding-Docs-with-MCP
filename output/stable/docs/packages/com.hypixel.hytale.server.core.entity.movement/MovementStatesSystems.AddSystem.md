---
title: "MovementStatesSystems.AddSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.movement"
fqcn: "com.hypixel.hytale.server.core.entity.movement.MovementStatesSystems.AddSystem"
api_surface: false
extends: "HolderSystem"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.entity.movement`

```java
public static class AddSystem extends HolderSystem<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore, MovementStatesComponent>` | `movementStatesComponentComponentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `AddSystem(@Nonnull ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentComponentType)` |
| `public` | `void` | `onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)` |
| `public` | `Query<EntityStore>` | `getQuery()` |
