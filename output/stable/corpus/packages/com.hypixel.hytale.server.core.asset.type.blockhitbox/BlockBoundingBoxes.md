# BlockBoundingBoxes

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blockhitbox

public class BlockBoundingBoxes

Defines the bounding box shapes for block types used in collision detection and hit testing.

Also in this package: BlockBoundingBoxesPacketGenerator, RotatedVariantBoxes

Complete API:
  public static AssetStore<String,BlockBoundingBoxes,IndexedLookupTableAssetMap<String,BlockBoundingBoxes>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,BlockBoundingBoxes> getAssetMap()
  public String getId()
  public boolean protrudesUnitBox()
  protected void processConfig()
  public BlockBoundingBoxes.RotatedVariantBoxes get(Rotation yaw, Rotation pitch, Rotation roll)
  public BlockBoundingBoxes.RotatedVariantBoxes get(int index)
  public Hitbox[] toPacket()
  public String toString()
  public static BlockBoundingBoxes getUnitBoxFor(String id)
  private static BlockBoundingBoxes.RotatedVariantBoxes getRotated(BlockBoundingBoxes boxes, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  protected static Box rotate(Box box, Rotation rotationYaw, Rotation rotationPitch, Rotation rotationRoll)
  private static void rotate90X(Box box)
  private static void rotate180X(Box box)
  private static void rotate270X(Box box)
  private static void rotate90Y(Box box)
  private static void rotate180Y(Box box)
  private static void rotate270Y(Box box)
  private static void rotate90Z(Box box)
  private static void rotate180Z(Box box)
  private static void rotate270Z(Box box)

Fields:
private static final int ROTATIONS
public static final int DEFAULT_ID
public static final String DEFAULT
public static final BlockBoundingBoxes UNIT_BOX
public static final double UNIT_BOX_MAXIMUM_EXTENT
public static final AssetBuilderCodec<String,BlockBoundingBoxes> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
public static final Hitbox[] EMPTY_HITBOXES
private static AssetStore<String,BlockBoundingBoxes,IndexedLookupTableAssetMap<String,BlockBoundingBoxes>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected Box[] baseDetailBoxes
private final transient BlockBoundingBoxes.RotatedVariantBoxes[] variants
protected transient boolean protrudesUnitBox
