# IWorldChunksAsync

Type: interface | Package: com.hypixel.hytale.server.core.universe.world

@Deprecated
public interface IWorldChunksAsync

Deprecated asynchronous chunk retrieval interface. Provides `CompletableFuture`-based methods for loading ticking and non-ticking chunks by coordinate index or (x, z) pair.

## Methods

- getChunkAsync(long) | CompletableFuture<WorldChunk> | Asynchronously loads a ticking chunk by packed coordinate index.
- getNonTickingChunkAsync(long) | CompletableFuture<WorldChunk> | Asynchronously loads a non-ticking chunk by packed coordinate index.
- getChunkAsync(int, int) | CompletableFuture<WorldChunk> | Convenience overload that packs (x, z) via `ChunkUtil.indexChunk`.
- getNonTickingChunkAsync(int, int) | CompletableFuture<WorldChunk> | Convenience overload that packs (x, z) via `ChunkUtil.indexChunk`.

## See Also

- IWorldChunks

Known implementors: IWorldChunks

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Complete API:
  CompletableFuture<WorldChunk> getChunkAsync(long var1)
  CompletableFuture<WorldChunk> getNonTickingChunkAsync(long var1)
  default CompletableFuture<WorldChunk> getChunkAsync(int x, int z)
  default CompletableFuture<WorldChunk> getNonTickingChunkAsync(int x, int z)
