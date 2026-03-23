# ConnectedBlockRuleSet

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks

public abstract class ConnectedBlockRuleSet

Holds a set of rules that determine connected block model variants based on neighboring block faces.

## Constants

- CodecMapCodec<ConnectedBlockRuleSet> CODEC

## Key Methods

- public abstract boolean onlyUpdateOnPlacement()
- public abstract Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockType(World var1, Vector3i var2, BlockType var3, int var4, Vector3i var5, boolean var6)
- public void updateCachedBlockTypes(BlockType blockType, BlockTypeAssetMap<String, BlockType> assetMap)
- public com.hypixel.hytale.protocol.ConnectedBlockRuleSet toPacket(BlockTypeAssetMap<String, BlockType> assetMap)
