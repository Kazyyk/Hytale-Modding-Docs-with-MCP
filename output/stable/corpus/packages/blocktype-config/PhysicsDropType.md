# PhysicsDropType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object

Defines drops when a block is affected by physics (e.g., falling sand). Contains optional `itemId` and `dropListId`. The `withoutDrops()` method returns null.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, RequiredBlockFaceSupport, RequiredBlockFaceSupportValidator (and 7 more)

Complete API:
  public String getItemId()
  public String getDropListId()
  public PhysicsDropType withoutDrops()
  public String toString()

Fields:
public static final BuilderCodec<PhysicsDropType> CODEC
protected String itemId
protected String dropListId
