# HarvestingDropType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.Harvesting>

Defines drops when a block is harvested (e.g., crops). Contains optional `itemId` and `dropListId`. The `withoutDrops()` method returns null, removing harvest drops entirely.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public Harvesting toPacket()
  public String getItemId()
  public String getDropListId()
  public HarvestingDropType withoutDrops()
  public String toString()

Fields:
public static final BuilderCodec<HarvestingDropType> CODEC
protected String itemId
protected String dropListId
