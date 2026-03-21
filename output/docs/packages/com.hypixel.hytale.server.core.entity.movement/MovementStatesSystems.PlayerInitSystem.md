---
title: "MovementStatesSystems.PlayerInitSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.movement"
fqcn: "com.hypixel.hytale.server.core.entity.movement.MovementStatesSystems.PlayerInitSystem"
api_surface: false
extends: "RefSystem"
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
public static class PlayerInitSystem extends RefSystem<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Query<EntityStore>` | `query` |
| `private final` | `ComponentType<EntityStore, Player>` | `playerComponentType` |
| `private final` | `ComponentType<EntityStore, MovementStatesComponent>` | `movementStatesComponentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `PlayerInitSystem( @Nonnull ComponentType<EntityStore, Player> playerComponentType, @Nonnull ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentType )` |
| `public` | `void` | `onEntityAdded( @Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `void` | `onEntityRemove( @Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `Query<EntityStore>` | `getQuery()` |
