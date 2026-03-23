# IBlackboardView

Type: interface | Package: com.hypixel.hytale.server.npc.blackboard.view

public interface IBlackboardView<View extends IBlackboardView<View>>

Interface defining: `isOutdated()`, `getUpdatedView()`, `initialiseEntity()`, `cleanup()`....

## Methods

- isOutdated(@Nonnull Ref<EntityStore> var1, @Nonnull Store<EntityStore> var2) | boolean | package-private method.
- getUpdatedView(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2) | View | package-private method.
- initialiseEntity(@Nonnull Ref<EntityStore> var1, @Nonnull NPCEntity var2) | void | package-private method.
- cleanup() | void | package-private method.
- onWorldRemoved() | void | package-private method.

Known implementors: BlockRegionView, EventView, PrioritisedProviderView

Also in this package: BlockRegionView, BlockRegionViewManager, IBlackboardViewManager, PrioritisedProvider, PrioritisedProviderView, SingletonBlackboardViewManager

Complete API:
  boolean isOutdated(Ref<EntityStore> var1, Store<EntityStore> var2)
  View getUpdatedView(Ref<EntityStore> var1, ComponentAccessor<EntityStore> var2)
  void initialiseEntity(Ref<EntityStore> var1, NPCEntity var2)
  void cleanup()
  void onWorldRemoved()
