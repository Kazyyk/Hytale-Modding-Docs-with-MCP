# BufferChunkLoader

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkLoader

public abstract class BufferChunkLoader implements IChunkLoader

Abstract chunk loader that deserializes chunks from `ByteBuffer` via BSON. Subclasses provide the `loadBuffer(int, int)` implementation.

Known subclasses: IndexedStorageChunkLoader, Loader

Also in this package: BufferChunkSaver, ChunkLoadState, ChunkLoaderSaverSetupSystem, ChunkStorage, ChunkStore, EntityStore, GetChunkFlags, IChunkLoader, IChunkSaver, LoadFuturePacketDataQuerySystem, LoadPacketDataQuerySystem, NetworkIdSystem, UUIDSystem, UnloadPacketDataQuerySystem

Complete API:
  public Store<ChunkStore> getStore()
  public abstract CompletableFuture<ByteBuffer> loadBuffer(int var1, int var2)
  public CompletableFuture<Holder<ChunkStore>> loadHolder(int x, int z)

Fields:
private final Store<ChunkStore> store
