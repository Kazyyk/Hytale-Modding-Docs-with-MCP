# CustomModelTexture

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object

A single custom model texture entry with a `texture` path string and an integer `weight` for variant selection.

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 8 more)

Complete API:
  public String getTexture()
  public int getWeight()
  public ModelTexture toPacket(float totalWight)
  public String toString()

Fields:
public static BuilderCodec<CustomModelTexture> CODEC
private String texture
private int weight
