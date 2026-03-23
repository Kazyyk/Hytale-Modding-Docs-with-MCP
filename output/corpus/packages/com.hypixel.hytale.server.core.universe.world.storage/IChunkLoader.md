# IChunkLoader

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: Closeable

public interfaceinterface IChunkLoader implements Closeable

Interface for loading chunk holders from persistent storage. Provides `loadHolder(int, int)` returning a future and `getIndexes()` returning all stored chunk indices.
