---
title: "PositionCacheSystems"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.PositionCacheSystems"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "spatial"
  - "position-cache"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class PositionCacheSystems
```

Container class for three ECS systems and a static helper method that manage the NPC `PositionCache`. The position cache pre-computes spatial queries for nearby players, NPCs, items, and spawn markers each tick, providing efficient proximity data to sensors and behavior components.

## Static Method

```java
public static void initialisePositionCache(
    @Nonnull Role role,
    @Nullable StateEvaluator stateEvaluator,
    double flockInfluenceRange
)
```

Configures the position cache from the role's requirements:
1. Resets the cache.
2. If avoidance is enabled, registers entity and player distance ranges for avoidance.
3. If separation is enabled, registers separation distances.
4. If flock influence range is positive, registers those distances.
5. Registers all instructions (root, interaction, death) with the role support.
6. Registers state transitions with the role support.
7. Sets up the state evaluator if present.
8. Runs external registrations.
9. Finalizes configuration.

## Inner Systems

### PositionCacheSystems.UpdateSystem

```java
public static class UpdateSystem extends SteppableTickingSystem
```

The main position cache update system. Runs **after** `PlayerSpatialSystem` and **before** `RoleSystems.PreBehaviourSupportTickSystem`.

Each tick (when the update timer fires):
1. Checks the NPC's breathing state from block material.
2. Queries the player spatial resource to populate the nearby player list.
3. Queries the NPC spatial resource to populate the nearby NPC list.
4. Queries the item spatial resource for nearby dropped items.
5. Queries the spawn marker/beacon spatial resources.

Supports benchmarking via `NPCPlugin.isBenchmarkingSensorSupport()`.

**Parallelism:** `false` (single-threaded).

### PositionCacheSystems.RoleActivateSystem

```java
public static class RoleActivateSystem extends HolderSystem<EntityStore>
```

Initializes the position cache when an NPC entity is added to the store, and resets it when removed. Determines flock influence range from `FlockMembership` if present.

### PositionCacheSystems.OnFlockJoinSystem

```java
public static class OnFlockJoinSystem extends RefChangeSystem<EntityStore, FlockMembership>
```

Re-initializes the position cache when an NPC's `FlockMembership` component is added or changed, incorporating the new flock influence range.

## Related Types

- [NPCSpatialSystem](NPCSpatialSystem.md) -- NPC spatial index used by UpdateSystem
- [RoleSystems](RoleSystems.md) -- behavior tick that consumes position cache data
- [AvoidanceSystem](AvoidanceSystem.md) -- uses position cache for avoidance/separation
