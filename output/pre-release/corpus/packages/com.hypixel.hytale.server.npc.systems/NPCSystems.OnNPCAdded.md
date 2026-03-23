# NPCSystems.OnNPCAdded

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: com.hypixel.hytale.component.system.HolderSystem

public static class OnNPCAdded extends HolderSystem<EntityStore>

Inner class of `NPCSystems`. ECS holder system that fires when an NPC entity is added. Migrates inventory data to components and ensures `Storage`, `Armor`, `Hotbar`, and `Utility` inventory components are present with default capacities.

## Methods

- public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)
- public Query<EntityStore> getQuery()
