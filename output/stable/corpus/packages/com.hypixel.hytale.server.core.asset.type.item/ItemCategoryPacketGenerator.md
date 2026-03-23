# ItemCategoryPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item | Extends: DefaultAssetPacketGenerator<String, ItemCategory>

public class ItemCategoryPacketGenerator extends DefaultAssetPacketGenerator<String, ItemCategory>

Concrete implementation extending `DefaultAssetPacketGenerator<String, ItemCategory>`.

## Methods

- generateInitPacket(@Nonnull DefaultAssetMap<String, ItemCategory> assetMap, @Nonnull Map<String, ItemCategory> assets) | ToClientPacket | public method.
- generateUpdatePacket(@Nonnull Map<String, ItemCategory> assets) | ToClientPacket | public method.
- generateRemovePacket(@Nonnull Set<String> removed) | ToClientPacket | public method.

Also in this package: DroplistCommand, FieldcraftCategoryPacketGenerator, ResourceTypePacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,ItemCategory> assetMap, Map<String,ItemCategory> assets)
  public ToClientPacket generateUpdatePacket(Map<String,ItemCategory> assets)
  public ToClientPacket generateRemovePacket(Set<String> removed)
