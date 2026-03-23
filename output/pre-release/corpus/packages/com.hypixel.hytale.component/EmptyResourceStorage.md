# EmptyResourceStorage

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: IResourceStorage

public class EmptyResourceStorage implements IResourceStorage

A no-op implementation of IResourceStorage. `load()` creates a default resource instance, `save()` and `remove()` are no-ops. Used for stores that do not require resource persistence. Singleton via `get()`.

## Methods


public static EmptyResourceStorage get()

Returns the singleton instance.

## Related Types

- IResourceStorage -- the interface this implements

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  public static EmptyResourceStorage get()
  public CompletableFuture<T> load(Store<ECS_TYPE> store, ComponentRegistry.Data<ECS_TYPE> data, ResourceType<ECS_TYPE,T> resourceType)
  public CompletableFuture<Void> save(Store<ECS_TYPE> store, ComponentRegistry.Data<ECS_TYPE> data, ResourceType<ECS_TYPE,T> resourceType, T resource)
  public CompletableFuture<Void> remove(Store<ECS_TYPE> store, ComponentRegistry.Data<ECS_TYPE> data, ResourceType<ECS_TYPE,T> resourceType)

Fields:
private static final EmptyResourceStorage INSTANCE
