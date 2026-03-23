# FieldcraftCategoryPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item | Extends: DefaultAssetPacketGenerator<String, FieldcraftCategory>

public class FieldcraftCategoryPacketGenerator extends DefaultAssetPacketGenerator<String, FieldcraftCategory>

Concrete implementation extending `DefaultAssetPacketGenerator<String, FieldcraftCategory>`.

## Methods

- generateInitPacket(@Nonnull DefaultAssetMap<String, FieldcraftCategory> assetMap, @Nonnull Map<String, FieldcraftCategory> assets) | ToClientPacket | public method.
- generateUpdatePacket(@Nonnull Map<String, FieldcraftCategory> assets) | ToClientPacket | public method.
- generateRemovePacket(Set<String> removed) | ToClientPacket | public method.

Also in this package: DroplistCommand, ItemCategoryPacketGenerator, ResourceTypePacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,FieldcraftCategory> assetMap, Map<String,FieldcraftCategory> assets)
  public ToClientPacket generateUpdatePacket(Map<String,FieldcraftCategory> assets)
  public ToClientPacket generateRemovePacket(Set<String> removed)
