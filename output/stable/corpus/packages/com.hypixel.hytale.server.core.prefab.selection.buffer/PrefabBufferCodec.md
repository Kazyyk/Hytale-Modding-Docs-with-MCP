# PrefabBufferCodec

Type: interface | Package: com.hypixel.hytale.server.core.prefab.selection.buffer | Implements: PrefabBufferSerializer<T>, PrefabBufferDeserializer<T>

public interface PrefabBufferCodec

Combined interface for types that can both serialize and deserialize prefab buffers. Parameterized by the storage medium type (e.g., `ByteBuf` for binary, `BsonDocument` for BSON).
