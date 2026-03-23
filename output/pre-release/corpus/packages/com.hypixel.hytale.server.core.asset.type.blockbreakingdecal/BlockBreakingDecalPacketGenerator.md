# BlockBreakingDecalPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blockbreakingdecal | Extends: DefaultAssetPacketGenerator

public class BlockBreakingDecalPacketGenerator extends DefaultAssetPacketGenerator<String, BlockBreakingDecal>

Generates init, update, and remove network packets for `BlockBreakingDecal` assets.

## Methods

- generateInitPacket(DefaultAssetMap<String, BlockBreakingDecal> assetMap, Map<String, BlockBreakingDecal> assets) | ToClientPacket | Instance method.
- generateUpdatePacket(Map<String, BlockBreakingDecal> loadedAssets) | ToClientPacket | Instance method.
- generateRemovePacket(Set<String> removed) | ToClientPacket | Instance method.
