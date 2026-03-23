# SpawnUtil

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public final class SpawnUtil

Utilities for applying spawn transforms to player entities. Used during first-join and respawn to position the player at the world's spawn point with appropriate body and head rotation.

## Methods

- applyFirstSpawnTransform(Holder<EntityStore>, World, WorldConfig, UUID) | TransformComponent | Applies the world's spawn provider transform to a player holder. Returns null if no spawn provider is configured.
- applyTransform(Holder<EntityStore>, Transform) | void | Applies an arbitrary transform (position and rotation) to an existing entity holder.

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Complete API:
  public static TransformComponent applyFirstSpawnTransform(Holder<EntityStore> holder, World world, WorldConfig worldConfig, UUID playerUuid)
  public static void applyTransform(Holder<EntityStore> holder, Transform transform)
