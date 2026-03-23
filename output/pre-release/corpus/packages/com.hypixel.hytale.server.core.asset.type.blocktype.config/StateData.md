# StateData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object

public class StateData

Maps between block state names and block type asset keys. Provides bidirectional lookups: state name to block key and block key to state name. The default state ID is `"default"`.

## Constants

- NULL_STATE_ID | "default"

## Methods


@Nullable
public String getBlockForState(String state)

Returns the block type key for the given state name, or `null` if no mapping exists.


@Nullable
public String getStateForBlock(String blockTypeKey)

Returns the state name for the given block type key, or `null` if no mapping exists.


@Nullable
public Map<String, Integer> toPacket(@Nonnull BlockType current)

Converts the state mapping to a packet-ready map of state names to asset indices.


public void copyFrom(@Nullable StateData state)

Copies state data from another instance if this instance has no mapping defined.

## Related Types

- BlockType -- uses this for block state variants

Also in this package: BlockBreakingDropType, BlockFace, BlockFaceSupport, BlockFlipType, BlockGathering, BlockMigration, BlockMovementSettings, BlockPlacementSettings, BlockPreviewVisibility, BlockSupportsRequiredForType, BlockToolData, BlockType, BlockTypeTextures, ConditionalBlockSound, CustomModelTexture, FaceConnectionType, HarvestingDropType, Match, MergedBlockFaces, PhysicsDropType (and 8 more)

Complete API:
  public String getBlockForState(String state)
  public String getStateForBlock(String blockTypeKey)
  public Map<String,Integer> toPacket(BlockType current)
  public String toString()
  public void copyFrom(StateData state)
  static void addDefinitions()
  private static String generateBlockKey(AssetExtraInfo<String> extraInfo)

Fields:
public static final String NULL_STATE_ID
public static final BuilderCodec.Builder<StateData> CODEC_BUILDER
public static final BuilderCodec<StateData> CODEC
private Map<String,String> stateToBlock
private Map<String,String> blockToState
