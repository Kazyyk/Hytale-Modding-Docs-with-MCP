# SoftBlockDropType

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object | Implements: NetworkSerializable<com.hypixel.hytale.protocol.SoftBlock>

Defines drops for soft blocks (blocks that break on contact). Contains optional `itemId`, `dropListId`, and `isWeaponBreakable` flag (default true). The `withoutDrops()` method preserves the weapon-breakable setting.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType (and 8 more)

Complete API:
  public SoftBlock toPacket()
  public String getItemId()
  public String getDropListId()
  public boolean isWeaponBreakable()
  public SoftBlockDropType withoutDrops()
  public String toString()

Fields:
public static final BuilderCodec<SoftBlockDropType> CODEC
protected String itemId
protected String dropListId
protected boolean isWeaponBreakable
