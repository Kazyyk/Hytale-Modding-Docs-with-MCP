# BufferChunkSaver

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkSaver

public abstract class BufferChunkSaver implements IChunkSaver

Abstract chunk saver that serializes chunks to `ByteBuffer` via BSON. Subclasses provide the `saveBuffer` and `removeBuffer` implementations.

Known subclasses: IndexedStorageChunkSaver, Saver

Also in this package: BufferChunkLoader, ChunkLoadState, ChunkLoaderSaverSetupSystem, ChunkStorage, ChunkStore, EntityStore, GetChunkFlags, IChunkLoader, IChunkSaver, LoadFuturePacketDataQuerySystem, LoadPacketDataQuerySystem, NetworkIdSystem, UUIDSystem, UnloadPacketDataQuerySystem

Complete API:
  public Store<ChunkStore> getStore()
  public abstract CompletableFuture<Void> saveBuffer(int var1, int var2, ByteBuffer var3)
  public abstract CompletableFuture<Void> removeBuffer(int var1, int var2)
  public CompletableFuture<Void> saveHolder(int x, int z, Holder<ChunkStore> holder)
  public CompletableFuture<Void> removeHolder(int x, int z)

Fields:
private final Store<ChunkStore> store
