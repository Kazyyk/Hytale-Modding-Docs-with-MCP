# BufferChunkLoader

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkLoader

public abstract class BufferChunkLoader implements IChunkLoader

Abstract chunk loader that deserializes chunks from `ByteBuffer` via BSON. Subclasses provide the `loadBuffer(int, int)` implementation.
