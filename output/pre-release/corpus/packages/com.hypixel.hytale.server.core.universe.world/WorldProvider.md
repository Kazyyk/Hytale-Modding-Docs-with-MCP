# WorldProvider

Type: interface | Package: com.hypixel.hytale.server.core.universe.world

public interface WorldProvider

Simple provider interface for obtaining a `World` reference. Implemented by stores and other components that belong to a specific world.

## Methods

- getWorld() | World | Returns the associated world.

## See Also

- World

Known implementors: ChunkStore, EntityStore

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, ZoneDiscoveryInfo

Complete API:
  World getWorld()
