---
title: "Store"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.Store"
api_surface: true
extends: "java.lang.Object"
implements:
  - "ComponentAccessor<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
  - "core"
---

**Package:** `com.hypixel.hytale.component`

```java
public class Store<ECS_TYPE> implements ComponentAccessor<ECS_TYPE>
```

The central data container of the ECS framework. A Store holds all entities, their components (organized into [ArchetypeChunk](ArchetypeChunk.md) arrays), and per-store [Resource](Resource.md) singletons. The server uses two concrete store types: `EntityStore` (for entities like players, NPCs, flocks) and `ChunkStore` (for world chunks).

Store is the most important class in the ECS framework at approximately 2,167 lines. It manages the complete entity lifecycle -- adding, removing, copying, and iterating entities -- and dispatches ECS events to registered systems. All structural mutations (adding/removing entities or components) are processed through a lock-based `ProcessingCounter` to ensure thread safety, and all public methods assert they are called from the store's owning thread.

## Type Parameters

- `ECS_TYPE` -- the external data type (e.g., `EntityStore` or `ChunkStore`)

## Key Fields

```java
public static final Store[] EMPTY_ARRAY = new Store[0];
```

```java
@Nonnull
public static final MetricsRegistry<Store<?>> METRICS_REGISTRY
```

Metrics registry exposing `ArchetypeChunkCount`, `EntityCount`, `Systems`, and `ArchetypeChunks` for monitoring.

## Constructor

```java
Store(@Nonnull ComponentRegistry<ECS_TYPE> registry, int storeIndex, @Nonnull ECS_TYPE externalData, @Nonnull IResourceStorage resourceStorage)
```

Package-private constructor called by [ComponentRegistry](ComponentRegistry.md) when creating a new store. Initializes the entity reference arrays, archetype index maps, and command buffer pool.

## Entity Lifecycle Methods

```java
@Nullable
public Ref<ECS_TYPE> addEntity(@Nonnull Holder<ECS_TYPE> holder, @Nonnull AddReason reason)
```

Adds an entity to the store from a [Holder](Holder.md). Invokes `HolderSystem.onEntityAdd()` before placement and `RefSystem.onEntityAdded()` after. Returns the [Ref](Ref.md) handle, or `null` if the entity was removed by a system during the add process.

```java
@Nonnull
public Ref<ECS_TYPE>[] addEntities(@Nonnull Holder<ECS_TYPE>[] holders, @Nonnull AddReason reason)
```

Batch variant that adds multiple entities. More efficient than individual calls because systems are iterated once per batch.

```java
@Nonnull
public Holder<ECS_TYPE> removeEntity(@Nonnull Ref<ECS_TYPE> ref, @Nonnull RemoveReason reason)
```

Removes an entity and returns its data in a [Holder](Holder.md). Invokes `RefSystem.onEntityRemove()` before removal and `HolderSystem.onEntityRemoved()` after. The entity's [Ref](Ref.md) is invalidated.

```java
@Nonnull
public Holder<ECS_TYPE>[] removeEntities(@Nonnull Ref<ECS_TYPE>[] refs, @Nonnull RemoveReason reason)
```

Batch removal variant.

## Component Access Methods

```java
@Nullable
public <T extends Component<ECS_TYPE>> T getComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

Returns the component of the given type for the referenced entity, or `null` if the entity does not have that component.

```java
@Nonnull
public <T extends Component<ECS_TYPE>> T ensureAndGetComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

Returns the component if present, or creates and adds a default instance if absent.

```java
public <T extends Component<ECS_TYPE>> void addComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)
```

Adds a component to an entity. Triggers archetype migration and `RefChangeSystem.onComponentAdded()`.

```java
public <T extends Component<ECS_TYPE>> void removeComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

Removes a component from an entity. Triggers archetype migration and `RefChangeSystem.onComponentRemoved()`.

```java
public <T extends Component<ECS_TYPE>> void replaceComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)
```

Replaces an existing component with a new instance. Does not trigger archetype migration but does trigger `RefChangeSystem.onComponentSet()`.

```java
public <T extends Component<ECS_TYPE>> void putComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)
```

Adds the component if absent, or replaces it if present. Convenience method combining `addComponent` and `replaceComponent`.

```java
public <T extends Component<ECS_TYPE>> boolean removeComponentIfExists(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

Removes the component if present. Returns `true` if removed, `false` if the entity did not have the component.

## Resource Access Methods

```java
@Nonnull
public <T extends Resource<ECS_TYPE>> T getResource(@Nonnull ResourceType<ECS_TYPE, T> resourceType)
```

Returns the store-level resource for the given type.

```java
public <T extends Resource<ECS_TYPE>> void replaceResource(@Nonnull ResourceType<ECS_TYPE, T> resourceType, @Nonnull T resource)
```

Replaces a store-level resource with a new instance.

## Iteration Methods

```java
public void forEachChunk(@Nonnull BiConsumer<ArchetypeChunk<ECS_TYPE>, CommandBuffer<ECS_TYPE>> consumer)
```

Iterates all archetype chunks in the store.

```java
public void forEachChunk(Query<ECS_TYPE> query, @Nonnull BiConsumer<ArchetypeChunk<ECS_TYPE>, CommandBuffer<ECS_TYPE>> consumer)
```

Iterates archetype chunks matching the given query.

```java
public void forEachEntityParallel(IntBiObjectConsumer<ArchetypeChunk<ECS_TYPE>, CommandBuffer<ECS_TYPE>> consumer)
```

Parallel iteration over all entities using the store's `ParallelTask` infrastructure.

## Query Methods

```java
public int getEntityCount()
```

Returns the total number of entities in this store.

```java
public int getEntityCountFor(@Nonnull Query<ECS_TYPE> query)
```

Returns the number of entities matching the given query.

```java
@Nonnull
public Archetype<ECS_TYPE> getArchetype(@Nonnull Ref<ECS_TYPE> ref)
```

Returns the archetype (set of component types) of the referenced entity.

## Store Lifecycle

```java
public void shutdown()
```

Shuts down the store -- saves all resources, invalidates all entity references, and unregisters from the [ComponentRegistry](ComponentRegistry.md).

```java
@Nonnull
public CompletableFuture<Void> saveAllResources()
```

Persists all resources via the store's [IResourceStorage](IResourceStorage.md).

## Accessors

```java
public int getStoreIndex()
```

```java
@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()
```

```java
@Nonnull
public ECS_TYPE getExternalData()
```

```java
@Nonnull
public IResourceStorage getResourceStorage()
```

```java
public boolean isShutdown()
```

## ECS Event Dispatch

Store dispatches ECS events through the `ComponentAccessor` interface:

```java
public <Event extends EcsEvent> void invoke(@Nonnull Ref<ECS_TYPE> ref, @Nonnull Event param)
```

Dispatches an entity-scoped event to all matching `EntityEventSystem` instances.

```java
public <Event extends EcsEvent> void invoke(@Nonnull Event param)
```

Dispatches a world-scoped event to all matching `WorldEventSystem` instances.

## Inner Classes

### ProcessingCounter

```java
private static class ProcessingCounter implements Lock
```

A reentrant lock used to protect structural mutations (entity add/remove, component add/remove) from concurrent access. Implements `java.util.concurrent.locks.Lock`.

## Related Types

- [ComponentRegistry](ComponentRegistry.md) -- creates and manages stores
- [CommandBuffer](CommandBuffer.md) -- deferred command queue that delegates to Store
- [Ref](Ref.md) -- entity reference handle
- [Holder](Holder.md) -- portable entity data container
- [ArchetypeChunk](ArchetypeChunk.md) -- columnar storage for entities of the same archetype
- [ComponentAccessor](ComponentAccessor.md) -- the interface Store implements
