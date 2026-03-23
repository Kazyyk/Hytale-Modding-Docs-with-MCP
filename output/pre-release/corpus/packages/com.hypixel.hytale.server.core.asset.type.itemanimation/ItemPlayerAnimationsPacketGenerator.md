# ItemPlayerAnimationsPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.itemanimation | Extends: DefaultAssetPacketGenerator

public class ItemPlayerAnimationsPacketGenerator extends DefaultAssetPacketGenerator<String, ItemPlayerAnimations>

Generates init, update, and remove network packets for `ItemPlayerAnimations` assets.

## Methods

- generateInitPacket(DefaultAssetMap<String, ItemPlayerAnimations> assetMap, Map<String, ItemPlayerAnimations> assets) | ToClientPacket | Instance method.
- generateUpdatePacket(Map<String, ItemPlayerAnimations> loadedAssets) | ToClientPacket | Instance method.
- generateRemovePacket(Set<String> removed) | ToClientPacket | Instance method.

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,ItemPlayerAnimations> assetMap, Map<String,ItemPlayerAnimations> assets)
  public ToClientPacket generateUpdatePacket(Map<String,ItemPlayerAnimations> loadedAssets)
  public ToClientPacket generateRemovePacket(Set<String> removed)
