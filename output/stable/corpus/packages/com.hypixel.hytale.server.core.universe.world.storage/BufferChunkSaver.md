# BufferChunkSaver

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkSaver

public abstract class BufferChunkSaver implements IChunkSaver

Abstract chunk saver that serializes chunks to `ByteBuffer` via BSON. Subclasses provide the `saveBuffer` and `removeBuffer` implementations.
