# IChunkLoader

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: Closeable

public interfaceinterface IChunkLoader implements Closeable

Interface for loading chunk holders from persistent storage. Provides `loadHolder(int, int)` returning a future and `getIndexes()` returning all stored chunk indices.

Known implementors: BufferChunkLoader, EmptyChunkLoader, Loader, MigrationChunkLoader

Also in this package: BufferChunkLoader, BufferChunkSaver, ChunkLoadState, ChunkLoaderSaverSetupSystem, ChunkStorage, ChunkStore, EntityStore, GetChunkFlags, IChunkSaver, LoadFuturePacketDataQuerySystem, LoadPacketDataQuerySystem, NetworkIdSystem, UUIDSystem, UnloadPacketDataQuerySystem

Complete API:
  CompletableFuture<Holder<ChunkStore>> loadHolder(int var1, int var2)
  LongSet getIndexes()
