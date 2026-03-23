# SelectionPrefabSerializer

Type: class | Package: com.hypixel.hytale.server.core.prefab.config

public class SelectionPrefabSerializer

Provides SelectionPrefabSerializer functionality within the config subsystem.

## Constants

- public static final int VERSION
- private static final BsonInt32 DEFAULT_SUPPORT_VALUE
- private static final BsonInt32 DEFAULT_FILLER_VALUE
- private static final BsonInt32 DEFAULT_ROTATION_VALUE

## Methods

- private SelectionPrefabSerializer()
- @Nonnull public static BlockSelection deserialize(@Nonnull BsonDocument doc)
- @Nonnull public static BsonDocument serialize(@Nonnull BlockSelection prefab)
- public static int readWorldVersion(@Nonnull BsonDocument document)
- @Nullable public static Holder<EntityStore> legacyEntityDecode(@Nonnull BsonDocument document, int version)
- @Nonnull public static Holder<ChunkStore> legacyStateDecode(@Nonnull BsonDocument document)

Complete API:
  public static BlockSelection deserialize(BsonDocument doc)
  public static BsonDocument serialize(BlockSelection prefab)
  public static int readWorldVersion(BsonDocument document)
  public static Holder<EntityStore> legacyEntityDecode(BsonDocument document, int version)
  public static Holder<ChunkStore> legacyStateDecode(BsonDocument document)

Fields:
public static final int VERSION
private static final Comparator<BsonDocument> COMPARE_BLOCK_POSITION
private static final BsonInt32 DEFAULT_SUPPORT_VALUE
private static final BsonInt32 DEFAULT_FILLER_VALUE
private static final BsonInt32 DEFAULT_ROTATION_VALUE
