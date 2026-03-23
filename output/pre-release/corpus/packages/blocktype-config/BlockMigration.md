# BlockMigration

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: JsonAssetWithMap<Integer, DefaultAssetMap<Integer, BlockMigration>>

Handles block type ID migration between versions. Maps old block type keys to new ones via `directMigrations` and `nameMigrations` maps. Used during world loading to update blocks to their current identifiers.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public static DefaultAssetMap<Integer,BlockMigration> getAssetMap()
  public Integer getId()
  public String getMigration(String blockTypeKey)
  public String getDirectMigration(String blockTypeKey)
  public String getNameMigration(String blockTypeKey)
  public Map<String,String> getDirectMigrations()
  public Map<String,String> getNameMigrations()
  public String toString()

Fields:
public static final AssetBuilderCodec<Integer,BlockMigration> CODEC
private static DefaultAssetMap<Integer,BlockMigration> ASSET_MAP
protected AssetExtraInfo.Data data
protected int id
protected Map<String,String> directMigrations
protected Map<String,String> nameMigrations
