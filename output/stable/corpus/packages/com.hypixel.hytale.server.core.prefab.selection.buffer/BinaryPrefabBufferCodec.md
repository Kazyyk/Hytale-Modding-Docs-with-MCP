# BinaryPrefabBufferCodec

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.buffer | Extends: java.lang.Object | Implements: PrefabBufferCodec<ByteBuf>

public class BinaryPrefabBufferCodec

Codec that serializes and deserializes prefab buffers in a compact binary format. Handles block ID migration across versions, entity holder deserialization, and fluid data. The current format version is 21.

Also in this package: BlockIdEntry, BsonPrefabBufferDeserializer, CachedEntry, FluidIdEntry, PrefabBufferCall, PrefabBufferCodec, PrefabBufferDeserializer, PrefabBufferSerializer, PrefabBufferUtil, PrefabLoader, PrefabSupplier, UpdateBinaryPrefabException

Complete API:
  public PrefabBuffer deserialize(Path path, ByteBuf buffer)
  private BinaryPrefabBufferCodec.BlockIdEntry deserializeBlock(ByteBuf buffer, BlockTypeAssetMap<String,BlockType> assetMap, Function<String,String> blockMigration)
  private BinaryPrefabBufferCodec.FluidIdEntry deserializeFluid(ByteBuf buffer, IndexedLookupTableAssetMap<String,Fluid> assetMap)
  public ByteBuf serialize(PrefabBuffer prefabBuffer)

Fields:
public static final BinaryPrefabBufferCodec INSTANCE
public static final int VERSION
private static final int MASK_CHANCE
private static final int MASK_COMPONENTS
private static final int MASK_FLUID
private static final int MASK_SUPPORT_VALUE
private static final int MASK_FILLER
private static final int MASK_ROTATION
