# ResourceTypePacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item | Extends: DefaultAssetPacketGenerator<String, ResourceType>

public class ResourceTypePacketGenerator extends DefaultAssetPacketGenerator<String, ResourceType>

Concrete implementation extending `DefaultAssetPacketGenerator<String, ResourceType>`.

## Methods

- generateInitPacket(@Nonnull DefaultAssetMap<String, ResourceType> assetMap, @Nonnull Map<String, ResourceType> assets) | ToClientPacket | public method.
- generateUpdatePacket(@Nonnull Map<String, ResourceType> loadedAssets) | ToClientPacket | public method.
- generateRemovePacket(@Nonnull Set<String> removed) | ToClientPacket | public method.
