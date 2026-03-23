# ObjectivePlugin

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives | Extends: JavaPlugin

public class ObjectivePlugin extends JavaPlugin

The main plugin class for the adventure objectives system. Registers assets, components, systems, tasks, completions, events, and commands. Manages objective lifecycle including starting, completing, canceling, and reloading objectives and objective lines.

## Key Methods

- public static ObjectivePlugin get()
- public ComponentType<EntityStore, ObjectiveHistoryComponent> getObjectiveHistoryComponentType()
- public Model getObjectiveLocationMarkerModel()
- public ObjectiveDataStore getObjectiveDataStore()
- public ComponentType<EntityStore, ReachLocationMarker> getReachLocationMarkerComponentType()
- public ComponentType<EntityStore, ObjectiveLocationMarker> getObjectiveLocationMarkerComponentType()
- public ComponentType<ChunkStore, TreasureChestBlock> getTreasureChestComponentType()
- public <T extends ObjectiveTaskAsset, U extends ObjectiveTask> void registerTask( String id, Class<T> assetClass, Codec<T> assetCodec, Class<U> implementationClass, Codec<U> implementationCodec, TriFunction<T, Integer, Integer, U> generator )
- public <T extends ObjectiveCompletionAsset, U extends ObjectiveCompletion> void registerCompletion( String id, Class<T> assetClass, Codec<T> codec, Function<T, U> generator )
- public ObjectiveTask createTask(ObjectiveTaskAsset task, int taskSetIndex, int taskIndex)
- public ObjectiveCompletion createCompletion(ObjectiveCompletionAsset completionAsset)
- public Objective startObjective( String objectiveId, Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID, Store<EntityStore> store )
- public Objective startObjective( String objectiveId, UUID objectiveUUID, Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID, Store<EntityStore> store )
- public boolean canPlayerDoObjective(Player player, String objectiveAssetId)
- public Objective startObjectiveLine( Store<EntityStore> store, String objectiveLineId, Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID )
- public boolean canPlayerDoObjectiveLine(Player player, String objectiveLineId)
- public void objectiveCompleted(Objective objective, Store<EntityStore> store)
- public void storeObjectiveHistoryData(Objective objective)
- public void storeObjectiveLineHistoryData(ObjectiveLineHistoryData objectiveLineHistoryData, Set<UUID> playerUUIDs)
- public void cancelObjective(UUID objectiveUUID, Store<EntityStore> store)
- public void untrackObjectiveForPlayer(Objective objective, UUID playerUUID)
- public void addPlayerToExistingObjective(@Nonnull Store<EntityStore> store, @Nonnull UUID playerUUID, @Nonnull UUID objectiveUUID)
- public void removePlayerFromExistingObjective(@Nonnull Store<EntityStore> store, @Nonnull UUID playerUUID, @Nonnull UUID objectiveUUID)
- @Nonnull public String getObjectiveDataDump()

## Inner Types

- `ObjectivePlugin.ObjectivePluginConfig` -- codec-based configuration for the objective data store provider
