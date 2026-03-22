---
title: "AvoidanceSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.AvoidanceSystem"
api_surface: false
extends: "SteppableTickingSystem"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class AvoidanceSystem extends SteppableTickingSystem
```

Blends entity avoidance and separation steering forces into the NPC's body steering vector. Runs **after** [RoleSystems.BehaviourTickSystem](RoleSystems.md) in the NPC tick pipeline.

For each NPC with avoidance or separation enabled (via Role configuration), this system adds the target-to-ignore for avoidance from the `MarkedEntitySupport`, then blends avoidance and separation forces into the body steering. When the motion controller reports the NPC is obstructed, avoidance is skipped entirely.

## Execution Order

| Dependency | Direction |
|---|---|
| `RoleSystems.BehaviourTickSystem` | AFTER |

## Debug Visualization

When debug flags `VisAvoidance` or `VisSeparation` are set on the role's `DebugSupport`, the system renders colored arrows:

| Color | Constant | Purpose |
|---|---|---|
| Green (0, 1, 0) | `DEBUG_COLOR_STEERING_POST` | Post-blend steering vector |
| Red (1, 0, 0) | `DEBUG_COLOR_STEERING_PRE` | Pre-blend steering vector |
| White (1, 1, 1) | `DEBUG_COLOR_AVOIDANCE` | Avoidance steering contribution |
| Blue (0, 0, 1) | `DEBUG_COLOR_SEPARATION` | Separation steering contribution |

Debug vectors are scaled by `DEBUG_VECTORS_SCALE` (4.0) and drawn for `DEBUG_VECTORS_TIME` (0.05s). Vectors shorter than `DEBUG_MIN_VECTOR_DRAW_LENGTH_SQUARED` (0.01) are not rendered.

## Constructor

```java
public AvoidanceSystem(@Nonnull ComponentType<EntityStore, NPCEntity> componentType)
```

## Fields

| Field | Type | Description |
|---|---|---|
| `componentType` | `ComponentType<EntityStore, NPCEntity>` | NPC entity component type. |
| `transformComponentType` | `ComponentType<EntityStore, TransformComponent>` | Transform component type. |
| `query` | `Query<EntityStore>` | Matches entities with both `NPCEntity` and `TransformComponent`. |

## Parallelism

```java
@Override
public boolean isParallel(int archetypeChunkSize, int taskCount)
```

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- [SteeringSystem](SteeringSystem.md) -- applies final steering after avoidance
- [SteppableTickingSystem](SteppableTickingSystem.md) -- base class
- [RoleSystems](RoleSystems.md) -- behavior tick that precedes avoidance
