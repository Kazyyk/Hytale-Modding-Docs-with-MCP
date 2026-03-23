# IComponentRegistry

Type: interface | Package: com.hypixel.hytale.component

public interface IComponentRegistry<ECS_TYPE>

The plugin-facing interface for registering ECS types. Plugins interact with this interface (typically through ComponentRegistryProxy) rather than the concrete ComponentRegistry directly. This decoupling allows plugin registrations to be automatically cleaned up on shutdown.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Methods


@Nonnull
<T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)

Registers a non-serialized component type with a default supplier.


@Nonnull
<T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)

Registers a serialized component type with a string ID and codec.


@Nonnull
<T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)

Registers a non-serialized resource type.


@Nonnull
<T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)

Registers a serialized resource type.


<T extends ISystem<ECS_TYPE>> SystemType<ECS_TYPE, T> registerSystemType(@Nonnull Class<? super T> systemTypeClass)

Registers a system type classification.


@Nonnull
<T extends EcsEvent> EntityEventType<ECS_TYPE, T> registerEntityEventType(@Nonnull Class<? super T> eventClass)

Registers an entity-scoped ECS event type.


@Nonnull
<T extends EcsEvent> WorldEventType<ECS_TYPE, T> registerWorldEventType(@Nonnull Class<? super T> eventClass)

Registers a world-scoped ECS event type.


@Nonnull
SystemGroup<ECS_TYPE> registerSystemGroup()

Registers a system group for dependency ordering.


void registerSystem(@Nonnull ISystem<ECS_TYPE> system)

Registers a system instance.


ResourceType<ECS_TYPE, SpatialResource<Ref<ECS_TYPE>, ECS_TYPE>> registerSpatialResource(@Nonnull Supplier<SpatialStructure<Ref<ECS_TYPE>>> supplier)

Registers a spatial resource backed by a `SpatialStructure` (e.g., KDTree).

## Related Types

- ComponentRegistry -- the concrete implementation
- ComponentRegistryProxy -- plugin-scoped proxy wrapper
- ComponentType -- returned by component registration
- ResourceType -- returned by resource registration
- SystemType -- returned by system type registration

Known implementors: ComponentRegistry, ComponentRegistryProxy

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> var1, Supplier<T> var2)
  ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> var1, String var2, BuilderCodec<T> var3)
  ResourceType<ECS_TYPE,T> registerResource(Class<? super T> var1, Supplier<T> var2)
  ResourceType<ECS_TYPE,T> registerResource(Class<? super T> var1, String var2, BuilderCodec<T> var3)
  SystemType<ECS_TYPE,T> registerSystemType(Class<? super T> var1)
  EntityEventType<ECS_TYPE,T> registerEntityEventType(Class<? super T> var1)
  WorldEventType<ECS_TYPE,T> registerWorldEventType(Class<? super T> var1)
  SystemGroup<ECS_TYPE> registerSystemGroup()
  void registerSystem(ISystem<ECS_TYPE> var1)
  ResourceType<ECS_TYPE,SpatialResource<Ref<ECS_TYPE>,ECS_TYPE>> registerSpatialResource(Supplier<SpatialStructure<Ref<ECS_TYPE>>> var1)
