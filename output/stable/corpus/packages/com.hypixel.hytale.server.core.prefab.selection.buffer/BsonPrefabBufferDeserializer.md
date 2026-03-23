# BsonPrefabBufferDeserializer

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.buffer | Extends: java.lang.Object | Implements: PrefabBufferDeserializer<BsonDocument>

public class BsonPrefabBufferDeserializer

Deserializer that reads prefab buffers from BSON documents. Used for the legacy JSON-based prefab storage format.

Also in this package: BinaryPrefabBufferCodec, BlockIdEntry, CachedEntry, FluidIdEntry, PrefabBufferCall, PrefabBufferCodec, PrefabBufferDeserializer, PrefabBufferSerializer, PrefabBufferUtil, PrefabLoader, PrefabSupplier, UpdateBinaryPrefabException

Complete API:
  public PrefabBuffer deserialize(Path path, BsonDocument document)
  private static void deserializeBlockType(PrefabBufferBlockEntry blockEntry, BsonDocument blockDocument, BlockTypeAssetMap<String,BlockType> assetMap, Function<String,String> blockMigration)
  private static void deserializeState(PrefabBufferBlockEntry blockEntry, BsonDocument blockDocument, int version, int worldVersion)
  private static Int2ObjectOpenHashMap<List<Holder<EntityStore>>> deserializeEntityHolders(BsonDocument document, Vector3i anchor, int version, int entityVersion)

Fields:
public static final BsonPrefabBufferDeserializer INSTANCE
public static final BsonInt32 LEGACY_BLOCK_ID_VERSION
private static final BsonInt32 DEFAULT_SUPPORT_VALUE
private static final BsonInt32 DEFAULT_FILLER_VALUE
private static final BsonInt32 DEFAULT_ROTATION_VALUE
