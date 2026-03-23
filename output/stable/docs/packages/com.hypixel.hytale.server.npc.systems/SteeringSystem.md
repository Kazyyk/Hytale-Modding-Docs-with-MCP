---
title: "SteeringSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.SteeringSystem"
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
public class SteeringSystem extends SteppableTickingSystem
```

Applies the computed steering vectors (body and head) to the NPC's active motion controller. Runs **after** [AvoidanceSystem](AvoidanceSystem.md) and **after** `KnockbackSystems.ApplyKnockback`, and **before** `TransformSystems.EntityTrackerUpdate`.

## Execution Order

| Dependency | Direction |
|---|---|
| `AvoidanceSystem` | AFTER |
| `KnockbackSystems.ApplyKnockback` | AFTER |
| `TransformSystems.EntityTrackerUpdate` | BEFORE |

## Constructor

```java
public SteeringSystem(@Nonnull ComponentType<EntityStore, NPCEntity> npcEntityComponent)
```

## Query

Matches entities with `NPCEntity` and `TransformComponent`.

## Tick Logic

```java
@Override
public void steppedTick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)
```

Delegates to `role.getActiveMotionController().steer(ref, role, bodySteering, headSteering, dt, commandBuffer)`.

When debug motion steering is enabled, logs detailed velocity and heading information. On `IllegalStateException` or `IllegalArgumentException`, removes the entity.

## Parallelism

Returns `false` -- this system does not run in parallel.

## Related Types

- [AvoidanceSystem](AvoidanceSystem.md) -- computes avoidance/separation forces before steering
- [RoleSystems](RoleSystems.md) -- `PostBehaviourSupportTickSystem` runs after steering
