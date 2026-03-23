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
