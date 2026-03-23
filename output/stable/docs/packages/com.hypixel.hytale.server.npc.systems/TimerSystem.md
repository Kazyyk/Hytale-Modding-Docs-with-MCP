---
title: "TimerSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.TimerSystem"
api_surface: false
extends: "SteppableTickingSystem"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "timer"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class TimerSystem extends SteppableTickingSystem
```

Ticks all `Tickable` timers stored in the `Timers` ECS component. Each timer receives the frame delta time.

## Constructor

```java
public TimerSystem(
    @Nonnull ComponentType<EntityStore, Timers> timersComponentType,
    @Nonnull Set<Dependency<EntityStore>> dependencies
)
```

## Query

Matches entities with the `Timers` component.

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

Iterates `timersComponent.getTimers()` and calls `timer.tick(dt)` on each.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- [RoleBuilderSystem](RoleBuilderSystem.md) -- allocates timers during role construction
- [SteppableTickingSystem](SteppableTickingSystem.md) -- base class
