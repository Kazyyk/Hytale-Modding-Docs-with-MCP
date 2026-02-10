---
title: Store
kind: class
package: com.hypixel.hytale.component
api_surface: true
extends: ~
implements:
  - ComponentAccessor<ECS_TYPE>
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - ecs
  - store
  - entity
  - component
  - container
---

**Package:** `com.hypixel.hytale.component`

```java
public class Store<ECS_TYPE> implements ComponentAccessor<ECS_TYPE>
```

The main entity container in Hytale's Entity Component System (ECS). A `Store` holds entities organized into archetype chunks, manages their components, dispatches ECS events, and provides the central access point for all ECS operations within a scope.

Each `World` has its own `EntityStore` and `ChunkStore`. These are the two concrete store types -- `EntityStore` manages game entities (players, mobs, items, projectiles) and `ChunkStore` manages chunk-level data (terrain, block states, lighting).

## Thread Binding

A `Store` is bound to the thread that created it:

```java
private final Thread thread = Thread.currentThread()
```

All operations on a `Store` must occur on its owning thread. This is a hard constraint -- calling methods from the wrong thread results in undefined behavior or assertion failures. The only safe way to mutate a store from another thread is through `CommandBuffer`.

## Entity Access

### Direct Access via Ref

```java
public <T extends Component<ECS_TYPE>> T getComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE, T> componentType)
```

Retrieves the component data of the given type for the entity identified by `ref`. Returns `null` if the entity does not have the component. The `ref` must be valid (see [Ref](Ref.md)).

```java
public void addComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE, ?> componentType, Component<ECS_TYPE> component)
```

Adds a component to an entity. If the entity already has this component type, the existing data is replaced. This may cause the entity to move to a different archetype chunk internally.

```java
public void removeComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE, ?> componentType)
```

Removes a component from an entity. This may cause the entity to move to a different archetype chunk internally. No-op if the entity does not have the component.

### Entity Lifecycle

```java
public Ref<ECS_TYPE> addEntity(Holder<ECS_TYPE> holder, AddReason reason)
```

Adds a new entity to the store. The `Holder` contains the entity's initial component data. Returns a [Ref](Ref.md) that identifies the entity for all subsequent operations. The `AddReason` is recorded for diagnostics and event dispatch.

```java
public Holder<ECS_TYPE> removeEntity(Ref<ECS_TYPE> ref, Holder<ECS_TYPE> holder, RemoveReason reason)
```

Removes an entity from the store. The entity's component data is written into the provided `Holder` (or a new one is created) so it can be transferred or inspected after removal. The `Ref` is invalidated -- its index is set to `Integer.MIN_VALUE` and any subsequent use will fail validation (see [Ref](Ref.md)).

### Iteration via Systems

Direct `Ref`-based access is for targeted operations on known entities. For bulk processing, the ECS system pipeline iterates entities by archetype. Systems declare a `Query` that matches archetypes containing specific component types (see [ComponentType](ComponentType.md) -- it implements `Query` directly). The store's internal archetype index routes each system to only the chunks that match its query, avoiding unnecessary iteration.

## Store-Level Resources

```java
public <T extends Resource<ECS_TYPE>> T getResource(ResourceType<ECS_TYPE, T> resourceType)
```

Returns a store-level resource. Resources are singleton data attached to the store itself rather than to individual entities. Examples include spatial indices and global counters. Resources are registered via [ComponentRegistryProxy.registerResource()](ComponentRegistryProxy.md).

## ECS Event Dispatch

```java
public void invoke(Ref<ECS_TYPE> ref, EcsEvent event)
```

Dispatches an entity-level ECS event. The event is routed to all systems that have registered an entity event handler for the event's type. The `ref` identifies which entity the event targets.

```java
public void invoke(EcsEvent event)
```

Dispatches a store-level (world-level) ECS event. The event is routed to all systems that have registered a world event handler for the event's type.

ECS events are distinct from `EventBus` events (see [EventRegistry](EventRegistry.md)). ECS events flow through the system pipeline and are dispatched via the store. EventBus events are dispatched via `EventBus.dispatch()` and registered through `EventRegistry`.

## CommandBuffer

```java
private final Deque<CommandBuffer<ECS_TYPE>> commandBuffers
```

During system execution, direct mutation of the store (adding/removing entities or components) can cause iterator invalidation and archetype chunk reallocation. The `CommandBuffer` mechanism defers these mutations until a safe point.

A system acquires a `CommandBuffer` from the pool, records mutations (add entity, remove entity, add component, remove component), and the store applies them in batch after the system's tick completes. This ensures that iteration is never interrupted by structural changes.

The command buffer pool is a `Deque` -- buffers are reused across ticks to avoid allocation pressure.

## ParallelTask Support

The store supports parallelized system execution through `ParallelTask`. When `EntityTickingSystem` parallelization is enabled, the store partitions its archetype chunks across worker threads. Each worker operates on a disjoint set of chunks, eliminating the need for synchronization during read-heavy ticks. Write operations still go through `CommandBuffer` and are applied sequentially.

## Metrics

```java
public int getEntityCount()
```

Returns the total number of entities currently in the store.

```java
public int getArchetypeChunkCount()
```

Returns the number of archetype chunks allocated. Useful for monitoring memory layout efficiency -- a high chunk count relative to entity count may indicate excessive archetype fragmentation.

## Related Types

- [Ref](Ref.md) -- entity reference handle, identifies entities within a store
- [ComponentType](ComponentType.md) -- type-safe key for component access, also serves as a Query
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- plugin-scoped registration of components, resources, systems, and events
- [PluginBase](PluginBase.md) -- provides `getEntityStoreRegistry()` and `getChunkStoreRegistry()`
- `ComponentAccessor` -- interface defining `getComponent`, `addComponent`, `removeComponent`
- `Holder` -- snapshot of an entity's component data, used for entity transfer
- `Archetype` -- internal grouping of entities by component signature
- `CommandBuffer` -- deferred mutation buffer for safe structural changes during iteration
- `EntityStore` -- concrete store for game entities (per-world)
- `ChunkStore` -- concrete store for chunk-level data (per-world)
- [SystemType](SystemType.md) -- type-safe handle identifying a system within a registry
- `ISystem` -- base interface for ECS systems that operate on store entities
- [EcsEvent](EcsEvent.md) -- base class for ECS events dispatched through the store
- `Resource` -- base class for store-level singleton data
- `ParallelTask` -- parallel execution support for system ticking
