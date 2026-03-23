# IBlackboardViewManager

Type: interface | Package: com.hypixel.hytale.server.npc.blackboard.view

public interface IBlackboardViewManager<View extends IBlackboardView<View>>

Interface defining: `get()`, `get()`, `get()`, `get()`....

## Methods

- get(Ref<EntityStore> var1, Blackboard var2, ComponentAccessor<EntityStore> var3) | View | package-private method.
- get(Vector3d var1, Blackboard var2) | View | package-private method.
- get(int var1, int var2, Blackboard var3) | View | package-private method.
- get(long var1, Blackboard var3) | View | package-private method.
- getIfExists(long var1) | View | package-private method.
- cleanup() | void | package-private method.
- onWorldRemoved() | void | package-private method.
- forEachView(Consumer<View> var1) | void | package-private method.
- clear() | void | package-private method.

Known implementors: BlockRegionViewManager, SingletonBlackboardViewManager

Also in this package: BlockRegionView, BlockRegionViewManager, IBlackboardView, PrioritisedProvider, PrioritisedProviderView, SingletonBlackboardViewManager

Complete API:
  View get(Ref<EntityStore> var1, Blackboard var2, ComponentAccessor<EntityStore> var3)
  View get(Vector3d var1, Blackboard var2)
  View get(int var1, int var2, Blackboard var3)
  View get(long var1, Blackboard var3)
  View getIfExists(long var1)
  void cleanup()
  void onWorldRemoved()
  void forEachView(Consumer<View> var1)
  void clear()
