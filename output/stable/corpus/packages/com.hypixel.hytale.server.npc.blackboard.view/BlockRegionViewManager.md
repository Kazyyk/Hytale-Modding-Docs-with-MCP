# BlockRegionViewManager

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view | Extends: BlockRegionView<Type>> | Implements: IBlackboardViewManager<Type>

public abstract class BlockRegionViewManager<Type extends BlockRegionView<Type>> implements IBlackboardViewManager<Type>

Implementation of `IBlackboardViewManager<Type>`.

## Methods

- get(@Nonnull Ref<EntityStore> ref, Blackboard blackboard, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | Type | public method.
- get(@Nonnull Vector3d position, Blackboard blackboard) | Type | public method.
- get(int chunkX, int chunkZ, Blackboard blackboard) | Type | public method.
- get(long index, Blackboard blackboard) | Type | public method.
- createView(long var1, Blackboard var3) | Type | protected method.
- getIfExists(long index) | Type | public method.
- cleanup() | void | public method.
- shouldCleanup(Type var1) | boolean | protected method.
- onWorldRemoved() | void | public method.
- forEachView(@Nonnull Consumer<Type> consumer) | void | public method.
- clear() | void | public method.

Known subclasses: BlockTypeViewManager, ResourceViewManager

Also in this package: BlockRegionView, IBlackboardView, IBlackboardViewManager, PrioritisedProvider, PrioritisedProviderView, SingletonBlackboardViewManager

Complete API:
  public Type get(Ref<EntityStore> ref, Blackboard blackboard, ComponentAccessor<EntityStore> componentAccessor)
  public Type get(Vector3d position, Blackboard blackboard)
  public Type get(int chunkX, int chunkZ, Blackboard blackboard)
  public Type get(long index, Blackboard blackboard)
  protected abstract Type createView(long var1, Blackboard var3)
  public Type getIfExists(long index)
  public void cleanup()
  protected abstract boolean shouldCleanup(Type var1)
  public void onWorldRemoved()
  public void forEachView(Consumer<Type> consumer)
  public void clear()

Fields:
protected Long2ObjectConcurrentHashMap<Type> views
protected LongArrayFIFOQueue removalQueue
