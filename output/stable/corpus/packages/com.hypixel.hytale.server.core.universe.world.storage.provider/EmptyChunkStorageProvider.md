# EmptyChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class EmptyChunkStorageProvider implements IChunkStorageProvider<Void>

Singleton no-op provider that discards all save operations and always returns null from load. Provides empty index sets. Codec ID is `Empty`.
