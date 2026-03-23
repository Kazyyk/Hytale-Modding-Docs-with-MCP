---
title: "ComputeVelocitySystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.ComputeVelocitySystem"
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
public class ComputeVelocitySystem extends SteppableTickingSystem
```

Computes the NPC's velocity from the position delta between tick start (stored by [NPCPreTickSystem](NPCPreTickSystem.md)) and the current position. The velocity is written to the `Velocity` component as `(currentPosition - oldPosition) / dt`.

## Constructor

```java
public ComputeVelocitySystem(
    @Nonnull ComponentType<EntityStore, NPCEntity> npcEntityComponentType,
    @Nonnull ComponentType<EntityStore, Velocity> velocityComponentType,
    @Nonnull Set<Dependency<EntityStore>> dependencies
)
```

## Query

Matches entities with `NPCEntity`, `TransformComponent`, and `Velocity` components.

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

Reads the current position from `TransformComponent` and the old (tick-start) position from `NPCEntity.getOldPosition()`, then sets the velocity to `(current - old) / dt` on all three axes.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- [NPCPreTickSystem](NPCPreTickSystem.md) -- stores tick start position used by this system
- [MovementStatesSystem](MovementStatesSystem.md) -- runs after this to update movement state flags
- [SteppableTickingSystem](SteppableTickingSystem.md) -- base class
