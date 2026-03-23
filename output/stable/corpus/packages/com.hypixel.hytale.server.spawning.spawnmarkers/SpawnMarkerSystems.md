# SpawnMarkerSystems

Type: class | Package: com.hypixel.hytale.server.spawning.spawnmarkers

public class SpawnMarkerSystems

Container for all ECS systems managing spawn marker entity lifecycle, from initial load through ticking, deactivation, and reactivation.

## Inner Types

- AddedFromWorldGen | HolderSystem<EntityStore> | Assigns `WorldGenId` to spawn markers created by world generation.
- CacheMarker | RefSystem<EntityStore> | Resolves and caches the `SpawnMarker` asset reference on entity add. Removes the entity if the asset is missing.
- EnsureNetworkSendable | HolderSystem<EntityStore> | Ensures spawn markers have a `NetworkId` and `Intangible` component for client visibility.
- EntityAdded | RefSystem<EntityStore> | Post-cache initialization: sets up temp storage lists, refreshes timeout, ensures `PrefabCopyableComponent`. Depends on `CacheMarker`.
- EntityAddedFromExternal | RefSystem<EntityStore> | Resets spawn state for markers placed from prefabs or world gen. Initializes `StoredFlock` when deactivation distance is configured.
- LegacyEntityMigration | MigrationSystem | **Deprecated.** Migrates legacy spawn marker data from unknown components.
- Ticking | EntityTickingSystem<EntityStore> | Core tick system. Handles respawn timer, deactivation (store/restore NPCs when players leave range), spawn-lost timeout recovery, game-time respawn, and suppression checks.

Also in this package: AddedFromWorldGen, CacheMarker, EnsureNetworkSendable, EntityAdded, EntityAddedFromExternal, FailReason, LegacyEntityMigration, SpawnMarkerEntity, Ticking

Fields:
private static final HytaleLogger LOGGER
