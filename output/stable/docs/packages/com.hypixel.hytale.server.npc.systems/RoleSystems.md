---
title: "RoleSystems"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.RoleSystems"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "behavior"
  - "tick-pipeline"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class RoleSystems
```

Container class for the five core behavior tick pipeline systems. These systems form the heart of the NPC behavior tree evaluation each tick.

## Execution Order

```
PreBehaviourSupportTickSystem
    -> StateEvaluatorSystem (external)
        -> BehaviourTickSystem
            -> AvoidanceSystem (external)
                -> SteeringSystem (external)
                    -> PostBehaviourSupportTickSystem
```

## Inner Systems

### RoleSystems.PreBehaviourSupportTickSystem

```java
public static class PreBehaviourSupportTickSystem extends SteppableTickingSystem
```

Runs **before** `BehaviourTickSystem`. Prepares each NPC for behavior evaluation:
1. Validates marked entity targets: removes invalid refs, removes dead targets, removes creative players without `allowNPCDetection`.
2. Calls `role.clearOnceIfNeeded()` to reset once-triggered instructions.
3. Clears body and head steering vectors.
4. Clears the ignored-for-avoidance entity set.
5. Invalidates the cached horizontal speed multiplier.

**Parallelism:** `EntityTickingSystem.maybeUseParallel`.

### RoleSystems.BehaviourTickSystem

```java
public static class BehaviourTickSystem extends TickingSystem<EntityStore>
```

The core NPC behavior tick. Collects all NPC entity references, then iterates them. For each NPC:
1. Skips entities with `NewSpawnComponent` (not yet initialized).
2. Handles frozen/stepping logic: uses `StepComponent.getTickLength()` for frozen entities.
3. Calls `role.tick(ref, tickLength, store)` to evaluate the instruction tree.
4. Supports benchmarking via `NPCPlugin.isBenchmarkingRole()`.
5. On exception (`IllegalArgumentException`, `IllegalStateException`, `NullPointerException`), logs the error and removes the entity.

This system does **not** extend `SteppableTickingSystem` because it implements its own frozen-entity handling with custom collection logic.

### RoleSystems.PostBehaviourSupportTickSystem

```java
public static class PostBehaviourSupportTickSystem extends SteppableTickingSystem
```

Runs **after** `SteeringSystem` and **before** `TransformSystems.EntityTrackerUpdate`. Post-tick cleanup:
1. Clears motion controller overrides and constrains rotations.
2. Ticks combat support and world support.
3. Ticks entity support and handles nominated display names.
4. Updates state support.
5. Clears damage data.
6. Resets avoidance ignore target slot.
7. Resets terminal action flag.
8. Clears position cache for next tick.

**Parallelism:** `EntityTickingSystem.maybeUseParallel`.

### RoleSystems.RoleActivateSystem

```java
public static class RoleActivateSystem extends HolderSystem<EntityStore>
```

Runs **after** `BalancingInitialisationSystem` and `ModelSystems.ModelSpawned`. On entity add:
1. Activates the role's state support.
2. Notifies debug flag listeners.
3. Updates motion controllers with the model and bounding box.
4. Clears once-triggered instructions.
5. Activates the motion controller.
6. Ensures the interaction chaining data component.

On entity remove: deactivates the motion controller and resets block sensors.

**Query:** `NPCEntity AND ModelComponent AND BoundingBox`

### RoleSystems.RoleDebugSystem

```java
public static class RoleDebugSystem extends SteppableTickingSystem
```

Renders debug visualizations for NPC roles when debug flags are enabled:
- **Debug display:** Delegates to `RoleDebugDisplay.display()` if configured.
- **Marked targets:** Renders colored arrows from the NPC's eye position to each marked target.
- **Sensor visualization:** Renders range discs/sectors and entity match markers.
- **Leash visualization:** Renders the leash point, chain rings, and connecting line.

**Constants:**

| Constant | Value |
|---|---|
| `DEBUG_SHAPE_TIME` | `0.1F` |
| `SENSOR_VIS_OPACITY` | `0.4F` |
| `LEASH_SPHERE_RADIUS` | `0.3F` |
| `LEASH_LINE_THICKNESS` | `0.05F` |

## Related Types

- [StateEvaluatorSystem](StateEvaluatorSystem.md) -- utility AI evaluation between pre and behaviour tick
- [AvoidanceSystem](AvoidanceSystem.md) -- avoidance after behaviour tick
- [SteeringSystem](SteeringSystem.md) -- steering after avoidance
- [PositionCacheSystems](PositionCacheSystems.md) -- populates cache before pre-behaviour tick
