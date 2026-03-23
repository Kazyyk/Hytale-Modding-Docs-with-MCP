# IChunkSaver

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: Closeable

public interfaceinterface IChunkSaver implements Closeable

Interface for saving/removing chunk holders to persistent storage. Provides `saveHolder`, `removeHolder`, `getIndexes`, and `flush` methods.

Known implementors: BufferChunkSaver, EmptyChunkSaver, Saver

Also in this package: BufferChunkLoader, BufferChunkSaver, ChunkLoadState, ChunkLoaderSaverSetupSystem, ChunkStorage, ChunkStore, EntityStore, GetChunkFlags, IChunkLoader, LoadFuturePacketDataQuerySystem, LoadPacketDataQuerySystem, NetworkIdSystem, UUIDSystem, UnloadPacketDataQuerySystem

Complete API:
  CompletableFuture<Void> saveHolder(int var1, int var2, Holder<ChunkStore> var3)
  CompletableFuture<Void> removeHolder(int var1, int var2)
  LongSet getIndexes()
  void flush()
