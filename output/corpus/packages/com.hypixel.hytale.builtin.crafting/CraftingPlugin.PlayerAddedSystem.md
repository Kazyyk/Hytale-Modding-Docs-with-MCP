# CraftingPlugin.PlayerAddedSystem

Type: class | Package: com.hypixel.hytale.builtin.crafting | Extends: RefSystem

public static class PlayerAddedSystem extends RefSystem<EntityStore>

## Fields

- private final Query<EntityStore> query

## Methods

- public PlayerAddedSystem( @Nonnull ComponentType<EntityStore, Player> playerComponentType, @Nonnull ComponentType<EntityStore, PlayerRef> playerRefComponentType )
- public Query<EntityStore> getQuery()
- public void onEntityAdded( @Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public void onEntityRemove( @Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
