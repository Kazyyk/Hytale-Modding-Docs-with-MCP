---
title: "StateEvaluatorSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.StateEvaluatorSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "utility-ai"
  - "decision-making"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class StateEvaluatorSystem extends EntityTickingSystem<EntityStore>
```

Utility-AI state evaluation system. Periodically scores `StateOption` entries using configured conditions and response curves, then transitions the NPC to the highest-scoring behavioral state. Runs **after** `PreBehaviourSupportTickSystem` and **before** `BehaviourTickSystem`, ensuring the NPC's state is resolved before the instruction tree is evaluated.

## Execution Order

| Dependency | Direction |
|---|---|
| `RoleSystems.PreBehaviourSupportTickSystem` | AFTER |
| `RoleSystems.BehaviourTickSystem` | BEFORE |

## Constructor

```java
public StateEvaluatorSystem(
    @Nonnull ComponentType<EntityStore, StateEvaluator> stateEvaluatorComponent,
    @Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType
)
```

## Query

Matches entities with `NPCEntity`, `StateEvaluator`, and `UUIDComponent`.

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

1. Skips if the role is running transition actions (state transitions take priority).
2. Checks if the evaluator is active and the execution frequency timer has elapsed.
3. Prepares the `EvaluationContext` with minimum utility and predictability settings.
4. Calls `stateEvaluator.evaluate()` to score all options and select the best.
5. If the chosen option differs from the current state, sets the new state via `StateSupport.setState()` and notifies the evaluator of the switch.
6. Resets the evaluation context.

## Parallelism

Returns `EntityTickingSystem.maybeUseParallel(archetypeChunkSize, taskCount)`.

## Related Types

- [RoleSystems](RoleSystems.md) -- the behavior pipeline that depends on state evaluation
- [PositionCacheSystems](PositionCacheSystems.md) -- `initialisePositionCache` sets up the evaluator
