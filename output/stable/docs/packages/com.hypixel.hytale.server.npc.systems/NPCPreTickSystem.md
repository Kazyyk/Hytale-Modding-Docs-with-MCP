---
title: "NPCPreTickSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.NPCPreTickSystem"
api_surface: false
extends: "SteppableTickingSystem"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "lifecycle"
  - "despawn"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class NPCPreTickSystem extends SteppableTickingSystem
```

Runs at the beginning of the NPC tick pipeline. Stores the tick-start position (used later by [ComputeVelocitySystem](ComputeVelocitySystem.md)), and manages the NPC despawn lifecycle including despawn timers, despawn animations, and despawn checks.

## Execution Order

| Dependency | Direction |
|---|---|
| `DeathSystems.CorpseRemoval` | BEFORE |

## Constructor

```java
public NPCPreTickSystem(@Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType)
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

1. Stores the current position as the tick-start position via `npcComponent.storeTickStartPosition(position)`.
2. **Despawn animation phase:** If playing a despawn animation, ticks the animation timer. On expiry, removes the entity.
3. **Despawn timer phase:** If despawning, ticks the despawn timer. On expiry, checks for a "Despawn" animation. If present, transitions to the animation phase. Otherwise, removes the entity immediately.
4. **Despawn check phase:** Every 30 seconds (`DEFAULT_DESPAWN_CHECK_DELAY`), queries `SpawningPlugin.shouldNPCDespawn()`. If the NPC should despawn and is not in a busy state, initiates the despawn timer.

## Constants

| Constant | Value | Description |
|---|---|---|
| `DEFAULT_DESPAWN_CHECK_DELAY` | `30.0F` | Seconds between despawn eligibility checks. |

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- [ComputeVelocitySystem](ComputeVelocitySystem.md) -- uses the tick-start position stored by this system
- [SpawnReferenceSystems](SpawnReferenceSystems.md) -- spawn marker/beacon despawn logic
