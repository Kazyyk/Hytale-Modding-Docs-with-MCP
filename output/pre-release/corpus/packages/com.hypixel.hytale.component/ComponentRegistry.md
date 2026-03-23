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

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  public boolean isShutdown()
  public void shutdown()
  void shutdown0()
  public ReadWriteLock getDataUpdateLock()
  public ComponentType<ECS_TYPE,UnknownComponents<ECS_TYPE>> getUnknownComponentType()
  public ComponentType<ECS_TYPE,NonTicking<ECS_TYPE>> getNonTickingComponentType()
  public ComponentType<ECS_TYPE,NonSerialized<ECS_TYPE>> getNonSerializedComponentType()
  public SystemType<ECS_TYPE,HolderSystem<ECS_TYPE>> getHolderSystemType()
  public SystemType<ECS_TYPE,RefSystem<ECS_TYPE>> getRefSystemType()
  public SystemType<ECS_TYPE,RefChangeSystem<ECS_TYPE,?>> getRefChangeSystemType()
  public SystemType<ECS_TYPE,QuerySystem<ECS_TYPE>> getQuerySystemType()
  public SystemType<ECS_TYPE,TickingSystem<ECS_TYPE>> getTickingSystemType()
  public SystemType<ECS_TYPE,TickableSystem<ECS_TYPE>> getTickableSystemType()
  public SystemType<ECS_TYPE,RunWhenPausedSystem<ECS_TYPE>> getRunWhenPausedSystemType()
  public SystemType<ECS_TYPE,ArchetypeTickingSystem<ECS_TYPE>> getArchetypeTickingSystemType()
  public ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, Supplier<T> supplier)
  public ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, String id, BuilderCodec<T> codec)
  public ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, String id, BuilderCodec<T> codec, boolean skipValidation)
  private ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, String id, BuilderCodec<T> codec, Supplier<T> supplier, boolean skipValidation)
  public void unregisterComponent(ComponentType<ECS_TYPE,T> componentType)
  public ResourceType<ECS_TYPE,T> registerResource(Class<? super T> tClass, Supplier<T> supplier)
  public ResourceType<ECS_TYPE,T> registerResource(Class<? super T> tClass, String id, BuilderCodec<T> codec)
  private ResourceType<ECS_TYPE,T> registerResource(Class<? super T> tClass, String id, BuilderCodec<T> codec, Supplier<T> supplier)
  public void unregisterResource(ResourceType<ECS_TYPE,T> resourceType)
  public SystemType<ECS_TYPE,T> registerSystemType(Class<? super T> systemTypeClass)
  public void unregisterSystemType(SystemType<ECS_TYPE,T> systemType)
  public EntityEventType<ECS_TYPE,T> registerEntityEventType(Class<? super T> eventTypeClass)
  public WorldEventType<ECS_TYPE,T> registerWorldEventType(Class<? super T> eventTypeClass)
  public void unregisterEntityEventType(EntityEventType<ECS_TYPE,T> eventType)
  public void unregisterEntityHolderEventType(EntityHolderEventType<ECS_TYPE,T> eventType)
  public void unregisterWorldEventType(WorldEventType<ECS_TYPE,T> eventType)
  public SystemGroup<ECS_TYPE> registerSystemGroup()
  public SystemGroup<ECS_TYPE> registerSystemGroup(Set<Dependency<ECS_TYPE>> dependencies)
  public void unregisterSystemGroup(SystemGroup<ECS_TYPE> systemGroup)
  public void registerSystem(ISystem<ECS_TYPE> system)
  public void registerSystem(ISystem<ECS_TYPE> system, boolean bypassClassCheck)
  public void unregisterSystem(Class<? extends ISystem<ECS_TYPE>> systemClass)
  public ResourceType<ECS_TYPE,SpatialResource<Ref<ECS_TYPE>,ECS_TYPE>> registerSpatialResource(Supplier<SpatialStructure<Ref<ECS_TYPE>>> supplier)
  public Store<ECS_TYPE> addStore(ECS_TYPE externalData, IResourceStorage resourceStorage)
  public Store<ECS_TYPE> addStore(ECS_TYPE externalData, IResourceStorage resourceStorage, Consumer<Store<ECS_TYPE>> consumer)
  public void removeStore(Store<ECS_TYPE> store)
  public Holder<ECS_TYPE> newHolder()
  public Holder<ECS_TYPE> newHolder(Archetype<ECS_TYPE> archetype, Component<ECS_TYPE>[] components)
  protected Holder<ECS_TYPE> _internal_newEntityHolder()
  protected ComponentRegistry.Data<ECS_TYPE> _internal_getData()
  public ComponentRegistry.Data<ECS_TYPE> getData()
  public BuilderCodec<Holder<ECS_TYPE>> getEntityCodec()
  public void assertInStoreThread()
  public Holder<ECS_TYPE> deserialize(BsonDocument entityDocument)
  public Holder<ECS_TYPE> deserialize(BsonDocument entityDocument, int version)
  public BsonDocument serialize(Holder<ECS_TYPE> holder)
  public boolean hasSystem(ISystem<ECS_TYPE> system)
  public boolean hasSystemClass(Class<T> systemClass)
  public boolean hasSystemType(SystemType<ECS_TYPE,T> systemType)
  public boolean hasSystemGroup(SystemGroup<ECS_TYPE> group)
  private ComponentType<ECS_TYPE,T> registerComponent0(ComponentRegistration<ECS_TYPE,T> registration)
  private ComponentType<ECS_TYPE,T> registerComponent0(Class<? super T> tClass, String id, BuilderCodec<T> codec, Supplier<T> supplier, ComponentType<ECS_TYPE,T> componentType)
  private void unregisterComponent0(ComponentType<ECS_TYPE,T> componentType)
  private ResourceType<ECS_TYPE,T> registerResource0(ResourceRegistration<ECS_TYPE,T> registration)
  private ResourceType<ECS_TYPE,T> registerResource0(Class<? super T> tClass, String id, BuilderCodec<T> codec, Supplier<T> supplier, ResourceType<ECS_TYPE,T> resourceType)
  private void unregisterResource0(ResourceType<ECS_TYPE,T> resourceType)
  private SystemType<ECS_TYPE,T> registerSystemType0(Class<? super T> systemTypeClass)
  private void unregisterSystemType0(SystemType<ECS_TYPE,T> systemType)
  private EntityEventType<ECS_TYPE,T> registerEntityEventType0(Class<? super T> eventTypeClass)
  private void unregisterEntityEventType0(EntityEventType<ECS_TYPE,T> eventType)
  public EntityEventType<ECS_TYPE,T> getEntityEventTypeForClass(Class<T> eClass)
  private EntityHolderEventType<ECS_TYPE,T> registerEntityHolderEventType0(Class<? super T> eventTypeClass)
  private void unregisterEntityHolderEventType0(EntityHolderEventType<ECS_TYPE,T> eventType)
  public EntityHolderEventType<ECS_TYPE,T> getEntityHolderEventTypeForClass(Class<T> eClass)
  private WorldEventType<ECS_TYPE,T> registerWorldEventType0(Class<? super T> eventTypeClass)
  private void unregisterWorldEventType0(WorldEventType<ECS_TYPE,T> eventType)
  public WorldEventType<ECS_TYPE,T> getWorldEventTypeForClass(Class<T> eClass)
  private SystemGroup<ECS_TYPE> registerSystemGroup0(Set<Dependency<ECS_TYPE>> dependencies)
  private void unregisterSystemGroup0(SystemGroup<ECS_TYPE> systemType)
  private void registerSystem0(ISystem<ECS_TYPE> system)
  private void unregisterSystem0(int systemIndex, ISystem<ECS_TYPE> system)
  private Store<ECS_TYPE> addStore0(ECS_TYPE externalData, IResourceStorage resourceStorage, Consumer<Store<ECS_TYPE>> consumer)
  private void removeStore0(Store<ECS_TYPE> store)
  ComponentRegistry.Data<ECS_TYPE> doDataUpdate()
  private void updateData0(DataChange dataChanges)
  public String toString()
  public T createComponent(ComponentType<ECS_TYPE,T> componentType)

Fields:
public static final int UNASSIGNED_INDEX
public static final int DEFAULT_INITIAL_SIZE
private static final HytaleLogger LOGGER
private static final KeyedCodec<Integer> VERSION
private static final AtomicInteger REFERENCE_THREAD_COUNTER
private boolean shutdown
private final StampedLock dataLock
private final Object2IntMap<String> componentIdToIndex
private final BitSet componentIndexReuse
private int componentSize
private String[] componentIds
private BuilderCodec<? extends Component<ECS_TYPE>>[] componentCodecs
private Supplier<? extends Component<ECS_TYPE>>[] componentSuppliers
private ComponentType<ECS_TYPE,? extends Component<ECS_TYPE>>[] componentTypes
private final Object2IntMap<String> resourceIdToIndex
private final BitSet resourceIndexReuse
private int resourceSize
private String[] resourceIds
private BuilderCodec<? extends Resource<ECS_TYPE>>[] resourceCodecs
private Supplier<? extends Resource<ECS_TYPE>>[] resourceSuppliers
private ResourceType<ECS_TYPE,? extends Resource<ECS_TYPE>>[] resourceTypes
private final Object2IntMap<Class<? extends ISystem<ECS_TYPE>>> systemTypeClassToIndex
private final Object2IntMap<Class<? extends EcsEvent>> entityEventTypeClassToIndex
private final Object2IntMap<Class<? extends EcsEvent>> entityHolderEventTypeClassToIndex
private final Object2IntMap<Class<? extends EcsEvent>> worldEventTypeClassToIndex
private final BitSet systemTypeIndexReuse
private int systemTypeSize
private SystemType<ECS_TYPE,? extends ISystem<ECS_TYPE>>[] systemTypes
private BitSet[] systemTypeToSystemIndex
private final BitSet systemGroupIndexReuse
private int systemGroupSize
private SystemGroup<ECS_TYPE>[] systemGroups
private int systemSize
private ISystem<ECS_TYPE>[] systems
private ISystem<ECS_TYPE>[] sortedSystems
private final Object2IntMap<Class<? extends ISystem<ECS_TYPE>>> systemClasses
private final Object2BooleanMap<Class<? extends ISystem<ECS_TYPE>>> systemBypassClassCheck
private final StampedLock storeLock
private int storeSize
private Store<ECS_TYPE>[] stores
private final ReadWriteLock dataUpdateLock
private ComponentRegistry.Data<ECS_TYPE> data
private final Set<Reference<Holder<ECS_TYPE>>> holders
private final ReferenceQueue<Holder<ECS_TYPE>> holderReferenceQueue
private final Thread holderReferenceThread
private final ComponentType<ECS_TYPE,UnknownComponents<ECS_TYPE>> unknownComponentType
private final ComponentType<ECS_TYPE,NonTicking<ECS_TYPE>> nonTickingComponentType
private final ComponentType<ECS_TYPE,NonSerialized<ECS_TYPE>> nonSerializedComponentType
private final SystemType<ECS_TYPE,HolderSystem<ECS_TYPE>> holderSystemType
private final SystemType<ECS_TYPE,RefSystem<ECS_TYPE>> refSystemType
private final SystemType<ECS_TYPE,RefChangeSystem<ECS_TYPE,?>> refChangeSystemType
private final SystemType<ECS_TYPE,QuerySystem<ECS_TYPE>> querySystemType
private final SystemType<ECS_TYPE,TickingSystem<ECS_TYPE>> tickingSystemType
private final SystemType<ECS_TYPE,TickableSystem<ECS_TYPE>> tickableSystemType
private final SystemType<ECS_TYPE,RunWhenPausedSystem<ECS_TYPE>> runWhenPausedSystemType
private final SystemType<ECS_TYPE,ArchetypeTickingSystem<ECS_TYPE>> archetypeTickingSystemType
