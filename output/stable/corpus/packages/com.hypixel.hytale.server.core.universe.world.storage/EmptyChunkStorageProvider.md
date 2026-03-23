# EmptyChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkStorageProvider<Void>

public class EmptyChunkStorageProvider implements IChunkStorageProvider<Void>

No-op chunk storage provider. Discards saves and returns null for loads. Registered as `"Empty"` in the codec. Singleton via `INSTANCE`.
