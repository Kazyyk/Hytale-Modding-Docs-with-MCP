---
title: "SteppableTickingSystem"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.SteppableTickingSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public abstract class SteppableTickingSystem extends EntityTickingSystem<EntityStore>
```

Abstract base class for NPC ECS systems that respect the `Frozen` component for debug stepping. When an NPC entity has a `Frozen` component (or the world's `isAllNPCFrozen()` flag is set), the system skips the entity unless a `StepComponent` is present, in which case it ticks for a single step using the step's configured tick length.

Most NPC systems extend this class rather than `EntityTickingSystem` directly, ensuring that frozen NPCs only advance when explicitly stepped by the debug tools.

## Tick Flow

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

Checks the `Frozen` component and world freeze flag. If the entity is not frozen, delegates to `steppedTick` with the frame delta time. If frozen, looks for a `StepComponent` and uses its tick length. If frozen with no step component, returns without ticking.

## Abstract Method

```java
public abstract void steppedTick(
    float var1,
    int var2,
    @Nonnull ArchetypeChunk<EntityStore> var3,
    @Nonnull Store<EntityStore> var4,
    @Nonnull CommandBuffer<EntityStore> var5
)
```

Called with the resolved tick length (either the frame `dt` or the step component's tick length). Subclasses implement their per-entity tick logic here.

## Fields

| Field | Type | Description |
|---|---|---|
| `stepComponentType` | `ComponentType<EntityStore, StepComponent>` | Component type for debug step. |
| `frozenComponentType` | `ComponentType<EntityStore, Frozen>` | Component type for frozen state. |

## Related Types

- [StepCleanupSystem](StepCleanupSystem.md) -- removes `StepComponent` at end of frame
- [AvoidanceSystem](AvoidanceSystem.md), [SteeringSystem](SteeringSystem.md), [ComputeVelocitySystem](ComputeVelocitySystem.md), [MovementStatesSystem](MovementStatesSystem.md) -- concrete subclasses
