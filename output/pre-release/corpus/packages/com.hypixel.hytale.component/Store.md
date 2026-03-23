# Store

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: ComponentAccessor<ECS_TYPE>

public class Store<ECS_TYPE> implements ComponentAccessor<ECS_TYPE>

The central data container of the ECS framework. A Store holds all entities, their components (organized into ArchetypeChunk arrays), and per-store Resource singletons. The server uses two concrete store types: `EntityStore` (for entities like players, NPCs, flocks) and `ChunkStore` (for world chunks).

Store is the most important class in the ECS framework at approximately 2,167 lines. It manages the complete entity lifecycle -- adding, removing, copying, and iterating entities -- and dispatches ECS events to registered systems. All structural mutations (adding/removing entities or components) are processed through a lock-based `ProcessingCounter` to ensure thread safety, and all public methods assert they are called from the store's owning thread.

## Type Parameters

- `ECS_TYPE` -- the external data type (e.g., `EntityStore` or `ChunkStore`)

## Key Fields


public static final Store[] EMPTY_ARRAY = new Store[0];


@Nonnull
public static final MetricsRegistry<Store<?>> METRICS_REGISTRY

Metrics registry exposing `ArchetypeChunkCount`, `EntityCount`, `Systems`, and `ArchetypeChunks` for monitoring.

## Constructor


Store(@Nonnull ComponentRegistry<ECS_TYPE> registry, int storeIndex, @Nonnull ECS_TYPE externalData, @Nonnull IResourceStorage resourceStorage)

Package-private constructor called by ComponentRegistry when creating a new store. Initializes the entity reference arrays, archetype index maps, and command buffer pool.

## Entity Lifecycle Methods


@Nullable
public Ref<ECS_TYPE> addEntity(@Nonnull Holder<ECS_TYPE> holder, @Nonnull AddReason reason)

Adds an entity to the store from a Holder. Invokes `HolderSystem.onEntityAdd()` before placement and `RefSystem.onEntityAdded()` after. Returns the Ref handle, or `null` if the entity was removed by a system during the add process.


@Nonnull
public Ref<ECS_TYPE>[] addEntities(@Nonnull Holder<ECS_TYPE>[] holders, @Nonnull AddReason reason)

Batch variant that adds multiple entities. More efficient than individual calls because systems are iterated once per batch.


@Nonnull
public Holder<ECS_TYPE> removeEntity(@Nonnull Ref<ECS_TYPE> ref, @Nonnull RemoveReason reason)

Removes an entity and returns its data in a Holder. Invokes `RefSystem.onEntityRemove()` before removal and `HolderSystem.onEntityRemoved()` after. The entity's Ref is invalidated.


@Nonnull
public Holder<ECS_TYPE>[] removeEntities(@Nonnull Ref<ECS_TYPE>[] refs, @Nonnull RemoveReason reason)

Batch removal variant.

## Component Access Methods


@Nullable
public <T extends Component<ECS_TYPE>> T getComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)

Returns the component of the given type for the referenced entity, or `null` if the entity does not have that component.


@Nonnull
public <T extends Component<ECS_TYPE>> T ensureAndGetComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)

Returns the component if present, or creates and adds a default instance if absent.


public <T extends Component<ECS_TYPE>> void addComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)

Adds a component to an entity. Triggers archetype migration and `RefChangeSystem.onComponentAdded()`.


public <T extends Component<ECS_TYPE>> void removeComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)

Removes a component from an entity. Triggers archetype migration and `RefChangeSystem.onComponentRemoved()`.


public <T extends Component<ECS_TYPE>> void replaceComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)

Replaces an existing component with a new instance. Does not trigger archetype migration but does trigger `RefChangeSystem.onComponentSet()`.


public <T extends Component<ECS_TYPE>> void putComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)

Adds the component if absent, or replaces it if present. Convenience method combining `addComponent` and `replaceComponent`.


public <T extends Component<ECS_TYPE>> boolean removeComponentIfExists(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)

Removes the component if present. Returns `true` if removed, `false` if the entity did not have the component.

## Resource Access Methods


@Nonnull
public <T extends Resource<ECS_TYPE>> T getResource(@Nonnull ResourceType<ECS_TYPE, T> resourceType)

Returns the store-level resource for the given type.


public <T extends Resource<ECS_TYPE>> void replaceResource(@Nonnull ResourceType<ECS_TYPE, T> resourceType, @Nonnull T resource)

Replaces a store-level resource with a new instance.

## Iteration Methods


public void forEachChunk(@Nonnull BiConsumer<ArchetypeChunk<ECS_TYPE>, CommandBuffer<ECS_TYPE>> consumer)

Iterates all archetype chunks in the store.


public void forEachChunk(Query<ECS_TYPE> query, @Nonnull BiConsumer<ArchetypeChunk<ECS_TYPE>, CommandBuffer<ECS_TYPE>> consumer)

Iterates archetype chunks matching the given query.


public void forEachEntityParallel(IntBiObjectConsumer<ArchetypeChunk<ECS_TYPE>, CommandBuffer<ECS_TYPE>> consumer)

Parallel iteration over all entities using the store's `ParallelTask` infrastructure.

## Query Methods


public int getEntityCount()

Returns the total number of entities in this store.


public int getEntityCountFor(@Nonnull Query<ECS_TYPE> query)

Returns the number of entities matching the given query.


@Nonnull
public Archetype<ECS_TYPE> getArchetype(@Nonnull Ref<ECS_TYPE> ref)

Returns the archetype (set of component types) of the referenced entity.

## Store Lifecycle


public void shutdown()

Shuts down the store -- saves all resources, invalidates all entity references, and unregisters from the ComponentRegistry.


@Nonnull
public CompletableFuture<Void> saveAllResources()

Persists all resources via the store's IResourceStorage.

## Accessors


public int getStoreIndex()


@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()


@Nonnull
public ECS_TYPE getExternalData()


@Nonnull
public IResourceStorage getResourceStorage()


public boolean isShutdown()

## ECS Event Dispatch

Store dispatches ECS events through the `ComponentAccessor` interface:


public <Event extends EcsEvent> void invoke(@Nonnull Ref<ECS_TYPE> ref, @Nonnull Event param)

Dispatches an entity-scoped event to all matching `EntityEventSystem` instances.


public <Event extends EcsEvent> void invoke(@Nonnull Event param)

Dispatches a world-scoped event to all matching `WorldEventSystem` instances.

## Inner Classes

### ProcessingCounter


private static class ProcessingCounter implements Lock

A reentrant lock used to protect structural mutations (entity add/remove, component add/remove) from concurrent access. Implements `java.util.concurrent.locks.Lock`.

## Related Types

- ComponentRegistry -- creates and manages stores
- CommandBuffer -- deferred command queue that delegates to Store
- Ref -- entity reference handle
- Holder -- portable entity data container
- ArchetypeChunk -- columnar storage for entities of the same archetype
- ComponentAccessor -- the interface Store implements

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery (and 8 more)

Complete API:
  CommandBuffer<ECS_TYPE> takeCommandBuffer()
  void storeCommandBuffer(CommandBuffer<ECS_TYPE> commandBuffer)
  public int getStoreIndex()
  public ComponentRegistry<ECS_TYPE> getRegistry()
  public ECS_TYPE getExternalData()
  public IResourceStorage getResourceStorage()
  public ParallelTask<EntityTickingSystem.SystemTaskData<ECS_TYPE>> getParallelTask()
  public ParallelTask<EntityDataSystem.SystemTaskData<ECS_TYPE,?,?>> getFetchTask()
  public HistoricMetric[] getSystemMetrics()
  public boolean isShutdown()
  void onAdd(ComponentRegistry.Data<ECS_TYPE> data)
  public void shutdown()
  void shutdown0(ComponentRegistry.Data<ECS_TYPE> data)
  public CompletableFuture<Void> saveAllResources()
  private CompletableFuture<Void> saveAllResources0(ComponentRegistry.Data<ECS_TYPE> data)
  public int getEntityCount()
  public int getEntityCountFor(Query<ECS_TYPE> query)
  public int getEntityCountFor(int systemIndex)
  public int getArchetypeChunkCount()
  public ArchetypeChunkData[] collectArchetypeChunkData()
  public int getArchetypeChunkCountFor(int systemIndex)
  protected void setEntityChunkIndex(Ref<ECS_TYPE> ref, int newEntityChunkIndex)
  public Ref<ECS_TYPE> addEntity(Archetype<ECS_TYPE> archetype, AddReason reason)
  public Ref<ECS_TYPE> addEntity(Holder<ECS_TYPE> holder, AddReason reason)
  public Ref<ECS_TYPE> addEntity(Holder<ECS_TYPE> holder, Ref<ECS_TYPE> ref, AddReason reason)
  public Ref<ECS_TYPE>[] addEntities(Holder<ECS_TYPE>[] holders, AddReason reason)
  public Ref<ECS_TYPE>[] addEntities(Holder<ECS_TYPE>[] holders, int start, int length, AddReason reason)
  public void addEntities(Holder<ECS_TYPE>[] holders, Ref<ECS_TYPE>[] refs, AddReason reason)
  public void addEntities(Holder<ECS_TYPE>[] holders, int holderStart, Ref<ECS_TYPE>[] refs, int refStart, int length, AddReason reason)
  public Holder<ECS_TYPE> copyEntity(Ref<ECS_TYPE> ref)
  public Holder<ECS_TYPE> copyEntity(Ref<ECS_TYPE> ref, Holder<ECS_TYPE> holder)
  public Holder<ECS_TYPE> copySerializableEntity(Ref<ECS_TYPE> ref)
  public Holder<ECS_TYPE> copySerializableEntity(Ref<ECS_TYPE> ref, Holder<ECS_TYPE> holder)
  public Archetype<ECS_TYPE> getArchetype(Ref<ECS_TYPE> ref)
  protected Archetype<ECS_TYPE> __internal_getArchetype(Ref<ECS_TYPE> ref)
  public Holder<ECS_TYPE> removeEntity(Ref<ECS_TYPE> ref, RemoveReason reason)
  public Holder<ECS_TYPE> removeEntity(Ref<ECS_TYPE> ref, Holder<ECS_TYPE> holder, RemoveReason reason)
  Holder<ECS_TYPE> removeEntity(Ref<ECS_TYPE> ref, Holder<ECS_TYPE> holder, RemoveReason reason, Throwable proxyReason)
  public Holder<ECS_TYPE>[] removeEntities(Ref<ECS_TYPE>[] refs, RemoveReason reason)
  public Holder<ECS_TYPE>[] removeEntities(Ref<ECS_TYPE>[] refs, int start, int length, RemoveReason reason)
  public Holder<ECS_TYPE>[] removeEntities(Ref<ECS_TYPE>[] refs, Holder<ECS_TYPE>[] holders, RemoveReason reason)
  public Holder<ECS_TYPE>[] removeEntities(Ref<ECS_TYPE>[] refArr, int refStart, Holder<ECS_TYPE>[] holders, int holderStart, int length, RemoveReason reason)
  public void ensureComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType)
  public T ensureAndGetComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType)
  public T addComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType)
  public void addComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType, T component)
  public void replaceComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType, T component)
  public void putComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType, T component)
  public T getComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType)
  protected T __internal_getComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType)
  public void removeComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType)
  public void tryRemoveComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType)
  public boolean removeComponentIfExists(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE,T> componentType)
  public void replaceResource(ResourceType<ECS_TYPE,T> resourceType, T resource)
  public T getResource(ResourceType<ECS_TYPE,T> resourceType)
  protected T __internal_getResource(ResourceType<ECS_TYPE,T> resourceType)
  public void forEachChunk(BiConsumer<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> consumer)
  public boolean forEachChunk(BiPredicate<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> predicate)
  public void forEachChunk(Query<ECS_TYPE> query, BiConsumer<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> consumer)
  public boolean forEachChunk(Query<ECS_TYPE> query, BiPredicate<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> predicate)
  public void forEachChunk(int systemIndex, BiConsumer<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> consumer)
  public boolean forEachChunk(int systemIndex, BiPredicate<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> predicate)
  public void forEachEntityParallel(IntBiObjectConsumer<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> consumer)
  public void forEachEntityParallel(Query<ECS_TYPE> query, IntBiObjectConsumer<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> consumer)
  public void fetch(SystemType<ECS_TYPE,T> systemType, Q query, List<R> results)
  public void fetch(Collection<Ref<ECS_TYPE>> refs, SystemType<ECS_TYPE,T> systemType, Q query, List<R> results)
  public void invoke(Ref<ECS_TYPE> ref, Event param)
  public void invoke(EntityEventType<ECS_TYPE,Event> systemType, Ref<ECS_TYPE> ref, Event param)
  public void invoke(Holder<ECS_TYPE> holder, Event param)
  public void invoke(EntityHolderEventType<ECS_TYPE,Event> systemType, Holder<ECS_TYPE> holder, Event param)
  public void invoke(Event param)
  public void invoke(WorldEventType<ECS_TYPE,Event> systemType, Event param)
  protected void internal_invoke(CommandBuffer<ECS_TYPE> sourceCommandBuffer, Ref<ECS_TYPE> ref, Event param)
  protected void internal_invoke(CommandBuffer<ECS_TYPE> sourceCommandBuffer, EntityEventType<ECS_TYPE,Event> systemType, Ref<ECS_TYPE> ref, Event param)
  protected void internal_invoke(CommandBuffer<ECS_TYPE> sourceCommandBuffer, Holder<ECS_TYPE> holder, Event param)
  protected void internal_invoke(CommandBuffer<ECS_TYPE> commandBuffer, EntityHolderEventType<ECS_TYPE,Event> systemType, Holder<ECS_TYPE> holder, Event param)
  protected void internal_invoke(CommandBuffer<ECS_TYPE> sourceCommandBuffer, Event param)
  protected void internal_invoke(CommandBuffer<ECS_TYPE> sourceCommandBuffer, WorldEventType<ECS_TYPE,Event> systemType, Event param)
  public void tick(float dt)
  public void pausedTick(float dt)
  private void tickInternal(float dt, SystemType<ECS_TYPE,Tickable> tickingSystemType)
  public void tick(ArchetypeTickingSystem<ECS_TYPE> system, float dt, int systemIndex)
  void updateData(ComponentRegistry.Data<ECS_TYPE> oldData, ComponentRegistry.Data<ECS_TYPE> data)
  private void updateData(ComponentRegistry.Data<ECS_TYPE> oldData, ComponentRegistry.Data<ECS_TYPE> newData, DataChange dataChange)
  private void updateData0(ComponentRegistry.Data<ECS_TYPE> oldData, ComponentRegistry.Data<ECS_TYPE> newData, DataChange dataChange)
  private void updateArchetypeIndexes(ComponentRegistry.Data<ECS_TYPE> data)
  public void assertWriteProcessing()
  public boolean isProcessing()
  public void assertThread()
  public boolean isInThread()
  public boolean isAliveInDifferentThread()
  public String toString()
  private void datachunk_addComponent(Ref<ECS_TYPE> ref, int fromArchetypeIndex, ComponentType<ECS_TYPE,T> componentType, T component, CommandBuffer<ECS_TYPE> commandBuffer)
  private int findOrCreateArchetypeChunk(Archetype<ECS_TYPE> archetype)
  private void removeArchetypeChunk(int archetypeIndex)

Fields:
public static final Store[] EMPTY_ARRAY
public static final MetricsRegistry<Store<?>> METRICS_REGISTRY
private final ComponentRegistry<ECS_TYPE> registry
private final ECS_TYPE externalData
private final IResourceStorage resourceStorage
private final Deque<CommandBuffer<ECS_TYPE>> commandBuffers
private final Thread thread
private final ParallelTask<EntityTickingSystem.SystemTaskData<ECS_TYPE>> parallelTask
private final ParallelTask<ForEachTaskData<ECS_TYPE>> forEachTask
private final ParallelTask<EntityDataSystem.SystemTaskData<ECS_TYPE,?,?>> fetchTask
private final Store.ProcessingCounter processing
private boolean shutdown
int storeIndex
private int entitiesSize
private Ref<ECS_TYPE>[] refs
private int[] entityToArchetypeChunk
private int[] entityChunkIndex
private BitSet[] systemIndexToArchetypeChunkIndexes
private BitSet[] archetypeChunkIndexesToSystemIndex
private final Object2IntMap<Archetype<ECS_TYPE>> archetypeToIndexMap
private int archetypeSize
private final BitSet archetypeChunkReuse
private ArchetypeChunk<ECS_TYPE>[] archetypeChunks
private Resource<ECS_TYPE>[] resources
private HistoricMetric[] systemMetrics
private boolean disableProcessingAssert
