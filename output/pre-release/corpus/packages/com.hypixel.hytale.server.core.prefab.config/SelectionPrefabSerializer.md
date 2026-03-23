# SelectionPrefabSerializer

Type: class | Package: com.hypixel.hytale.server.core.prefab.config

public class SelectionPrefabSerializer

Serializer/deserializer for `BlockSelection` prefabs to/from BSON documents. Handles versioned deserialization (versions 1-8) with legacy block migration, fluid conversion, rotation parsing, filler metadata, and entity decoding. Serialization always writes version 8 format.
