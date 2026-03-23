# BlockBreakingDropType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.BlockBreaking>

Defines drops when a block is broken. Contains `gatherType` string, `quality` tier, `quantity` (default 1), optional `itemId`, and optional `dropListId` for weighted drop tables.

Also in this package: BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public BlockBreaking toPacket()
  public String getGatherType()
  public int getQuality()
  public int getQuantity()
  public String getItemId()
  public String getDropListId()
  public BlockBreakingDropType withoutDrops()
  public String toString()

Fields:
public static final BuilderCodec<BlockBreakingDropType> CODEC
protected String gatherType
protected int quality
protected String itemId
protected String dropListId
protected int quantity
