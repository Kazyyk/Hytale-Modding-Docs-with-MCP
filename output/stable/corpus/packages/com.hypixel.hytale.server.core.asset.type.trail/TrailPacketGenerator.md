# TrailPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.trail | Extends: DefaultAssetPacketGenerator

public class TrailPacketGenerator extends DefaultAssetPacketGenerator<String, Trail>

Generates init, update, and remove network packets for `Trail` assets.

## Methods

- generateInitPacket(DefaultAssetMap<String, Trail> assetMap, Map<String, Trail> assets) | ToClientPacket | Instance method.
- generateUpdatePacket(Map<String, Trail> loadedAssets) | ToClientPacket | Instance method.
- generateRemovePacket(Set<String> removed) | ToClientPacket | Instance method.

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,Trail> assetMap, Map<String,Trail> assets)
  public ToClientPacket generateUpdatePacket(Map<String,Trail> loadedAssets)
  public ToClientPacket generateRemovePacket(Set<String> removed)
