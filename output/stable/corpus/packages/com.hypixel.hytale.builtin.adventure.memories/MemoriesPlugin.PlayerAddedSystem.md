# MemoriesPlugin.PlayerAddedSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories | Extends: RefSystem<EntityStore>

public static class PlayerAddedSystem extends RefSystem<EntityStore>

ECS system that runs after `PlayerSystems.PlayerSpawnedSystem`. When a player entity is added, sends an `UpdateMemoriesFeatureStatus` packet to the player's connection indicating whether the memories feature is unlocked (i.e., whether the player has a `PlayerMemories` component).

## Methods

- public Query<EntityStore> getQuery()
- public Set<Dependency<EntityStore>> getDependencies()
- public void onEntityAdded(@Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- public void onEntityRemove(@Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)

Also in this package: MemoriesGameplayConfig, MemoriesPlugin, MemoriesPluginConfig, RecordedMemories

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final Set<Dependency<EntityStore>> dependencies
private final ComponentType<EntityStore,Player> playerComponentType
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final ComponentType<EntityStore,PlayerMemories> playerMemoriesComponentType
private final Query<EntityStore> query
