# ConnectedBlockOutput

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks.builtin

public class ConnectedBlockOutput

Codec-backed output definition for connected blocks. Resolves a state string and optional block ID against the block type asset map.

Also in this package: RoofConnectedBlockRuleSet, StairConnectedBlockRuleSet, StairConnection, StairLikeConnectedBlockRuleSet, StairType

Complete API:
  public int resolve(BlockType baseBlockType, BlockTypeAssetMap<String,BlockType> assetMap)

Fields:
public static final BuilderCodec<ConnectedBlockOutput> CODEC
protected String state
protected String blockTypeKey
