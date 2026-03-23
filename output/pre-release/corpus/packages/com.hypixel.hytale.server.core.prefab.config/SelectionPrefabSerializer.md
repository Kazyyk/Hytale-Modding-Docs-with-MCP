# SelectionPrefabSerializer

Type: class | Package: com.hypixel.hytale.server.core.prefab.config

public class SelectionPrefabSerializer

Serializer/deserializer for `BlockSelection` prefabs to/from BSON documents. Handles versioned deserialization (versions 1-8) with legacy block migration, fluid conversion, rotation parsing, filler metadata, and entity decoding. Serialization always writes version 8 format.

Complete API:
  public static BlockSelection deserialize(BsonDocument doc)
  public static BsonDocument serialize(BlockSelection prefab)
  public static int readWorldVersion(BsonDocument document)
  public static Holder<EntityStore> legacyEntityDecode(BsonDocument document, int version)

Fields:
public static final int VERSION
private static final Comparator<BsonDocument> COMPARE_BLOCK_POSITION
private static final BsonInt32 DEFAULT_SUPPORT_VALUE
private static final BsonInt32 DEFAULT_FILLER_VALUE
private static final BsonInt32 DEFAULT_ROTATION_VALUE
