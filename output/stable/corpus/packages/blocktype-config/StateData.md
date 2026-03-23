# StateData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object

Defines block state mappings. Maps state names to block type keys via `stateToBlock` and maintains the reverse `blockToState` mapping. Used for block state transitions (e.g., on/off, open/closed). The `Definitions` field uses `ContainedAssetCodec` to inline block type definitions within the state data.

Known subclasses: Data, ItemContainerStateData

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType, RequiredBlockFaceSupport (and 7 more)

Complete API:
  public String getId()
  public String getBlockForState(String state)
  public String getStateForBlock(String blockTypeKey)
  public Map<String,Integer> toPacket(BlockType current)
  public String toString()
  public void copyFrom(StateData state)
  static void addDefinitions()
  private static String generateBlockKey(AssetExtraInfo<String> extraInfo)

Fields:
public static final String NULL_STATE_ID
public static final BuilderCodec.Builder<StateData> DEFAULT_CODEC_BUILDER
public static final BuilderCodec<StateData> DEFAULT_CODEC
public static final CodecMapCodec<StateData> CODEC
private String id
private Map<String,String> stateToBlock
private Map<String,String> blockToState
