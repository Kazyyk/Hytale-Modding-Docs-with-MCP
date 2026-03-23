# LegacySpawnBeaconEntity

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: Entity

public class LegacySpawnBeaconEntity extends Entity

The legacy spawn beacon entity component. An invisible, non-collidable entity that manages NPC spawning via a `BeaconSpawnController`. Hidden from players not in Creative mode. Tracks spawn configuration, next spawn timing (supporting both real-time and game-time modes), self-despawn timer, spawn attempt counter, and an optional objective UUID.

Provides static helper methods for managing spawn timers (`prepareNextSpawnTimer`, `clearDespawnTimer`, `setToDespawnAfter`) and a factory method (`create`/`createHolder`) that assembles the full entity holder with transform, UUID, model, display name, nameplate, and optional spawn suppression components.

## Key Methods

- @Nullable public static ComponentType<EntityStore, LegacySpawnBeaconEntity> getComponentType()
- public String getSpawnConfigId()
- public BeaconSpawnController getSpawnController()
- public void setSpawnController(@Nonnull BeaconSpawnController spawnController)
- public Instant getNextSpawnAfter()
- public boolean isNextSpawnAfterRealtime()
- @Nullable public Instant getDespawnSelfAfter()
- public BeaconSpawnWrapper getSpawnWrapper()
- public void setSpawnWrapper(BeaconSpawnWrapper spawnWrapper)
- public int getSpawnAttempts()
- public void setSpawnAttempts(int spawnAttempts)
- public int getLastPlayerCount()
- public void setLastPlayerCount(int lastPlayerCount)
- @Nullable public UUID getObjectiveUUID()
- public void setObjectiveUUID(@Nullable UUID objectiveUUID)
- public void notifyFailedSpawn()
- public void notifySpawn(@Nonnull Player target, @Nonnull Ref<EntityStore> spawnedEntity, @Nonnull Store<EntityStore> store)
- public static void prepareNextSpawnTimer(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void clearDespawnTimer(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void setToDespawnAfter(@Nonnull Ref<EntityStore> ref, @Nullable Duration duration, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public boolean prepareSpawnContext(@Nonnull Vector3d playerPosition, int spawnsThisRound, int roleIndex, @Nonnull SpawningContext spawningContext, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- @Nonnull public static Pair<Ref<EntityStore>, LegacySpawnBeaconEntity> create(@Nonnull BeaconSpawnWrapper spawnWrapper, @Nonnull Vector3d position, @Nonnull Vector3f rotation, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static Holder<EntityStore> createHolder(@Nonnull BeaconSpawnWrapper spawnWrapper, @Nonnull Vector3d position, @Nonnull Vector3f rotation)
