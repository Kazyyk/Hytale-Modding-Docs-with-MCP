---
title: "StepCleanupSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.StepCleanupSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "debug"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class StepCleanupSystem extends EntityTickingSystem<EntityStore>
```

Removes `StepComponent` from all entities at the end of the frame. This ensures that debug single-step commands only advance frozen NPCs for one tick. Uses `RootDependency.lastSet()` to guarantee it runs after all other systems.

## Execution Order

Runs last in the frame via `RootDependency.lastSet()`.

## Constructor

```java
public StepCleanupSystem(@Nonnull ComponentType<EntityStore, StepComponent> stepComponentType)
```

## Query

Matches entities with the `StepComponent`.

## Tick Logic

```java
@Override
public void tick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)
```

Removes the `StepComponent` from the entity.

## Related Types

- [SteppableTickingSystem](SteppableTickingSystem.md) -- base class that checks for `StepComponent`
- [NewSpawnStartTickingSystem](NewSpawnStartTickingSystem.md) -- runs after this system
