---
title: "PlayerCollisionResultAddSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.PlayerCollisionResultAddSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "player"
  - "collision"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class PlayerCollisionResultAddSystem extends HolderSystem<EntityStore>
```

Holder system that initializes the `CollisionResultComponent` for player entities when they are added to the store. Queries for entities that have `Player` but do not yet have `CollisionResultComponent`.

## Constructor

```java
public PlayerCollisionResultAddSystem(
    @Nonnull ComponentType<EntityStore, Player> playerComponentType,
    @Nonnull ComponentType<EntityStore, CollisionResultComponent> collisionResultComponentType
)
```

Takes the component types for `Player` and `CollisionResultComponent`.

## Behavior

On entity add:
1. Creates a new `CollisionResultComponent`.
2. Reads the `CollisionResult` from the component and calls `setDefaultPlayerSettings()` to initialize default collision parameters.
3. Calls `resetLocationChange()` on the component.
4. Configures the player's trigger block processing via `Player.configTriggerBlockProcessing(true, true, collisionResultComponent)`.
5. Adds the component to the entity holder.

On entity removed: No-op.

## Related Types

- [PlayerSpatialSystem](PlayerSpatialSystem.md) -- spatial indexing for player entities
- [UpdateLocationSystems](UpdateLocationSystems.md) -- chunk location tracking for entities
- `Player` -- the player ECS component
- `CollisionResultComponent` -- ECS component storing collision detection results
- `CollisionResult` -- collision data with default player settings
