---
title: "DespawnSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.DespawnSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:13:02Z"
tags:
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

```java
public class DespawnSystem extends EntityTickingSystem<EntityStore>
```

An ECS ticking system that removes entities whose scheduled despawn time has elapsed. On each tick, reads the [DespawnComponent](DespawnComponent.md) to get the despawn instant, compares it against the current server time from `TimeResource`, and issues a `RemoveReason.REMOVE` command if the time has passed.

The query excludes entities with the `Interactable` component, preventing despawn of entities that are currently being interacted with.

Supports parallel execution via `EntityTickingSystem.maybeUseParallel()`.

## Constructor

```java
public DespawnSystem(ComponentType<EntityStore, DespawnComponent> despawnComponentType)
```

Constructs the system with the given despawn component type. The query is built as `Query.and(despawnComponentType, Query.not(Interactable.getComponentType()))`.

## Methods

```java
@Override
public boolean isParallel(int archetypeChunkSize, int taskCount)
```

Returns `true` when parallel execution is beneficial, delegating to `EntityTickingSystem.maybeUseParallel()`.

```java
@Nonnull
@Override
public Query<EntityStore> getQuery()
```

Returns the compound query matching entities that have a `DespawnComponent` but do not have an `Interactable` component.

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

Per-entity tick. Reads the despawn instant from the `DespawnComponent`, retrieves the current time from `TimeResource`, and removes the entity if the current time is after the despawn instant.

## Related Types

- [DespawnComponent](DespawnComponent.md) -- the component that stores the despawn time
- [EntityModule](EntityModule.md) -- registers this system during setup
- `TimeResource` -- provides the current server time for comparison
- `Interactable` -- entities with this component are excluded from despawn
- `EntityTickingSystem` -- base class for per-entity ticking systems
