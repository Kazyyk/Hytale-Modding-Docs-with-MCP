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
