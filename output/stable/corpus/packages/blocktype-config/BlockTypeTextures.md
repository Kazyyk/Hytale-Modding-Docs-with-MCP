# BlockTypeTextures

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object

Defines per-face textures for a block. Supports shorthand keys (`All`, `Sides`, `UpDown`) and individual face keys (`Up`, `Down`, `North`, `South`, `East`, `West`). Includes a `weight` for texture variant selection. Default texture is `BlockTextures/Unknown.png`.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport, RequiredBlockFaceSupportValidator (and 7 more)

Complete API:
  public String getUp()
  public String getDown()
  public String getNorth()
  public String getSouth()
  public String getEast()
  public String getWest()
  public float getWeight()
  public BlockTextures toPacket(float totalWeight)

Fields:
public static final BuilderCodec<BlockTypeTextures> CODEC
protected String up
protected String down
protected String north
protected String south
protected String east
protected String west
protected int weight
