# IResourceStorage

Type: interface | Package: com.hypixel.hytale.component

public interface IResourceStorage

Interface for loading, saving, and removing per-store resources. Implementations provide the persistence backend for Resource instances. Each Store is created with an IResourceStorage that handles resource lifecycle.

## Methods


@Nonnull
<T extends Resource<ECS_TYPE>, ECS_TYPE> CompletableFuture<T> load(@Nonnull Store<ECS_TYPE> store, @Nonnull ComponentRegistry.Data<ECS_TYPE> data, @Nonnull ResourceType<ECS_TYPE, T> resourceType)

Loads a resource for the given store. Returns a completed future with a default instance if no persisted data exists.


@Nonnull
<T extends Resource<ECS_TYPE>, ECS_TYPE> CompletableFuture<Void> save(@Nonnull Store<ECS_TYPE> store, @Nonnull ComponentRegistry.Data<ECS_TYPE> data, @Nonnull ResourceType<ECS_TYPE, T> resourceType, T resource)

Saves a resource to persistent storage.


@Nonnull
<T extends Resource<ECS_TYPE>, ECS_TYPE> CompletableFuture<Void> remove(@Nonnull Store<ECS_TYPE> store, @Nonnull ComponentRegistry.Data<ECS_TYPE> data, @Nonnull ResourceType<ECS_TYPE, T> resourceType)

Removes a persisted resource.

## Related Types

- EmptyResourceStorage -- no-op implementation
- Resource -- the interface for resource data
- Store -- uses IResourceStorage for resource persistence

Known implementors: DiskResourceStorage, EmptyResourceStorage

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  CompletableFuture<T> load(Store<ECS_TYPE> var1, ComponentRegistry.Data<ECS_TYPE> var2, ResourceType<ECS_TYPE,T> var3)
  CompletableFuture<Void> save(Store<ECS_TYPE> var1, ComponentRegistry.Data<ECS_TYPE> var2, ResourceType<ECS_TYPE,T> var3, T var4)
  CompletableFuture<Void> remove(Store<ECS_TYPE> var1, ComponentRegistry.Data<ECS_TYPE> var2, ResourceType<ECS_TYPE,T> var3)
