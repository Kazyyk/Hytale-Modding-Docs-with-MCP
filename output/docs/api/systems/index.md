---
title: "ECS Systems"
kind: "overview"
package: "com.hypixel.hytale.component.system"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "ecs"
  - "systems"
  - "overview"
---

> Package: `com.hypixel.hytale.component.system`

Systems process entities matching archetype queries. They are the logic layer of the ECS — components hold data, systems operate on it.

## System Type Hierarchy

```
ISystem<ECS_TYPE>
├── System<ECS_TYPE>                           (abstract base with convenience methods)
│   ├── RefSystem<ECS_TYPE>                    (entity lifecycle: added/removed)
│   ├── RefChangeSystem<ECS_TYPE>              (archetype transition: component added/removed)
│   ├── HolderSystem<ECS_TYPE>                 (holder lifecycle)
│   └── StoreSystem<ECS_TYPE>                  (store lifecycle)
├── QuerySystem<ECS_TYPE>                      (interface: has getQuery())
│   ├── EntityEventSystem<ECS_TYPE, Event>     (ECS event handler, per-entity)
│   ├── ArchetypeChunkSystem<ECS_TYPE>         (archetype chunk lifecycle)
│   ├── ArchetypeTickingSystem<ECS_TYPE>       (per-chunk ticking)
│   │   └── EntityTickingSystem<ECS_TYPE>      (per-entity ticking)
│   └── RefSystem / RefChangeSystem
└── WorldEventSystem<ECS_TYPE, Event>          (ECS event handler, store-level)
```

## System Types

### EntityTickingSystem

Per-entity ticking. Called every frame for each entity matching the query.

```java
public class HealthRegenSystem extends EntityTickingSystem<EntityStore> {
    @Override
    public Query<EntityStore> getQuery() {
        return HEALTH_TYPE;  // only entities with HealthComponent
    }

    @Override
    public void tick(float dt, int index, ArchetypeChunk<EntityStore> chunk,
                     Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer) {
        HealthComponent health = chunk.getComponent(index, HEALTH_TYPE);
        health.regenerate(dt);
    }
}
```

Supports optional parallelization via `isParallel(archetypeChunkSize, taskCount)`.

### ArchetypeTickingSystem

Per-archetype-chunk ticking. Called every frame for each matching chunk (not per-entity).

### EntityEventSystem

Handles ECS events at the per-entity level. Only fires for entities whose archetype matches the system's query. Automatically skips cancelled events.

```java
public class OnBreakBlockSystem extends EntityEventSystem<EntityStore, BreakBlockEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return PLAYER_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       BreakBlockEvent event) {
        // Handle block break for this entity
    }
}
```

### WorldEventSystem

Handles ECS events at the store level (not per-entity).

### RefSystem

Entity lifecycle system. Fires `onEntityAdded()` when an entity matching the query is added, `onEntityRemove()` when removed. Receives `AddReason`/`RemoveReason` enums.

### RefChangeSystem

Fires when an entity's archetype changes (component added/removed) and the entity transitions into or out of the system's query.

### HolderSystem

Fires when `Holder`s (entity blueprints) are added to or removed from a store.

### StoreSystem

Store lifecycle system. Fires `onSystemAddedToStore()` and `onSystemRemovedFromStore()`.

### ArchetypeChunkSystem

Fires when the system is added to or removed from matching archetype chunks.

## Queries

Systems declare a `Query` that filters which archetype chunks they process. A `ComponentType` implements `Query`, so a single component type can be used directly as a query:

```java
@Override
public Query<EntityStore> getQuery() {
    return HEALTH_TYPE;  // entities must have HealthComponent
}
```

## System Groups

`SystemGroup` instances order system execution within a tick. Systems in the same group run together. `EntityStore.SEND_PACKET_GROUP` groups all packet-sending systems.

## Dependencies

Systems declare dependencies via `getDependencies()`. The runtime uses these to determine execution order within a group.

## Tick Rate

`TickingSystem` has `getTickRate()` for controlling how often the system ticks.

## Related

- **[ECS Overview](../components/index.md)** — Core ECS concepts
- **[Events](../events/index.md)** — ECS event dispatch mechanism
