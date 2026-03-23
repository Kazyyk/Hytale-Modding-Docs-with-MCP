---
title: "MovementStatesSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.MovementStatesSystem"
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
public class MovementStatesSystem extends SteppableTickingSystem
```

Updates NPC movement state flags based on the computed velocity. Runs **after** [ComputeVelocitySystem](ComputeVelocitySystem.md). Delegates to `Role.updateMovementState()` which sets flags like walking, running, idle, etc. based on the velocity vector and the movement states component.

Entities with the role name `"Empty_Role"` are skipped. Exceptions during movement state updates are logged and do not crash the system.

## Execution Order

| Dependency | Direction |
|---|---|
| `ComputeVelocitySystem` | AFTER |

## Constructor

```java
public MovementStatesSystem(
    @Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType,
    @Nonnull ComponentType<EntityStore, Velocity> velocityComponentType,
    @Nonnull ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentType
)
```

## Query

Matches entities with `NPCEntity`, `Velocity`, and `MovementStatesComponent`.

## Parallelism

Returns `false` -- this system does not run in parallel.

## Related Types

- [ComputeVelocitySystem](ComputeVelocitySystem.md) -- computes velocity consumed by this system
- [SteppableTickingSystem](SteppableTickingSystem.md) -- base class
