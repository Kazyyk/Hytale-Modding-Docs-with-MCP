# SingletonBlackboardViewManager

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view | Extends: IBlackboardView<View>> | Implements: IBlackboardViewManager<View>

public class SingletonBlackboardViewManager<View extends IBlackboardView<View>> implements IBlackboardViewManager<View>

Implementation of `IBlackboardViewManager<View>`.

## Fields

- view | View | final View field.

## Constructors

- SingletonBlackboardViewManager(View view) | Creates a new SingletonBlackboardViewManager instance.

## Methods

- get(Ref<EntityStore> ref, Blackboard blackboard, ComponentAccessor<EntityStore> componentAccessor) | View | public method.
- get(Vector3d position, Blackboard blackboard) | View | public method.
- get(int chunkX, int chunkZ, Blackboard blackboard) | View | public method.
- get(long index, Blackboard blackboard) | View | public method.
- getIfExists(long index) | View | public method.
- cleanup() | void | public method.
- onWorldRemoved() | void | public method.
- forEachView(@Nonnull Consumer<View> consumer) | void | public method.
- clear() | void | public method.

Also in this package: BlockRegionView, BlockRegionViewManager, IBlackboardView, IBlackboardViewManager, PrioritisedProvider, PrioritisedProviderView

Complete API:
  public View get(Ref<EntityStore> ref, Blackboard blackboard, ComponentAccessor<EntityStore> componentAccessor)
  public View get(Vector3d position, Blackboard blackboard)
  public View get(int chunkX, int chunkZ, Blackboard blackboard)
  public View get(long index, Blackboard blackboard)
  public View getIfExists(long index)
  public void cleanup()
  public void onWorldRemoved()
  public void forEachView(Consumer<View> consumer)
  public void clear()

Fields:
private final View view
