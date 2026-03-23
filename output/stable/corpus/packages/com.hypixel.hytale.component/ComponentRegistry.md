# ComponentRegistry

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: IComponentRegistry<ECS_TYPE>

public class ComponentRegistry<ECS_TYPE> implements IComponentRegistry<ECS_TYPE>

The central registry for the ECS framework. ComponentRegistry manages all type registrations (components, resources, systems, system types, system groups, event types) and maintains the immutable `Data` snapshot that stores use for runtime lookups. At approximately 1,662 lines, it is one of the largest classes in the ECS.

The registry maintains multiple stores and propagates registration changes to all of them. It uses a `StampedLock` for the data snapshot and a separate `ReadWriteLock` for data updates, enabling lock-free reads during normal operation.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Constructor


public ComponentRegistry()

Initializes the registry and pre-registers the built-in component types (`UnknownComponents`, `NonTicking`, `NonSerialized`) and system types (`HolderSystem`, `RefSystem`, `RefChangeSystem`, `QuerySystem`, `TickingSystem`, `TickableSystem`, `RunWhenPausedSystem`, `ArchetypeTickingSystem`). Also starts a daemon thread for cleaning up garbage-collected Holder weak references.

## Registration Methods


@Nonnull
public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)

Registers a non-serialized component type. Returns a ComponentType handle.


@Nonnull
public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)

Registers a serialized component type with a string ID and codec.


@Nonnull
public <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)

Registers a non-serialized resource type.


@Nonnull
public <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)

Registers a serialized resource type.


public <T extends ISystem<ECS_TYPE>> SystemType<ECS_TYPE, T> registerSystemType(@Nonnull Class<? super T> systemTypeClass)

Registers a new system type classification.


@Nonnull
public <T extends EcsEvent> EntityEventType<ECS_TYPE, T> registerEntityEventType(@Nonnull Class<? super T> eventClass)

Registers an entity-scoped ECS event type.


@Nonnull
public <T extends EcsEvent> WorldEventType<ECS_TYPE, T> registerWorldEventType(@Nonnull Class<? super T> eventClass)

Registers a world-scoped ECS event type.


@Nonnull
public SystemGroup<ECS_TYPE> registerSystemGroup()

Registers a new system group for dependency ordering.


public void registerSystem(@Nonnull ISystem<ECS_TYPE> system)

Registers a system instance. The system is added to the sorted execution order based on its dependencies and type.

## Built-in Type Accessors


@Nonnull
public ComponentType<ECS_TYPE, UnknownComponents<ECS_TYPE>> getUnknownComponentType()


@Nonnull
public ComponentType<ECS_TYPE, NonTicking<ECS_TYPE>> getNonTickingComponentType()


@Nonnull
public ComponentType<ECS_TYPE, NonSerialized<ECS_TYPE>> getNonSerializedComponentType()


@Nonnull
public SystemType<ECS_TYPE, TickingSystem<ECS_TYPE>> getTickingSystemType()


@Nonnull
public SystemType<ECS_TYPE, TickableSystem<ECS_TYPE>> getTickableSystemType()

And similar accessors for `HolderSystem`, `RefSystem`, `RefChangeSystem`, `QuerySystem`, `RunWhenPausedSystem`, and `ArchetypeTickingSystem` system types.

## Lifecycle


public void shutdown()

Shuts down the registry, interrupts the holder reference thread, and shuts down all stores in reverse order.


public boolean isShutdown()

## Inner Classes

### Data


public static class Data<ECS_TYPE>

An immutable snapshot of the registry state. Stores reference this snapshot for all runtime lookups (component IDs, codecs, system indexes, etc.). When the registry changes, a new Data snapshot is created and propagated to all stores.

## Related Types

- IComponentRegistry -- the interface plugins use for registration
- ComponentRegistryProxy -- plugin-scoped proxy with auto-unregistration
- Store -- created and managed by this registry
- ComponentType -- handle returned by component registration
- ResourceType -- handle returned by resource registration
- SystemType -- handle returned by system type registration
- SystemGroup -- handle returned by system group registration
