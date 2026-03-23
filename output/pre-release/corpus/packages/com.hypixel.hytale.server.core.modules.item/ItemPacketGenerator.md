# ItemPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.item | Extends: AssetPacketGenerator<String, Item, DefaultAssetMap<String, Item>>

public class ItemPacketGenerator extends AssetPacketGenerator<String, Item, DefaultAssetMap<String, Item>>

## Methods

- @Nonnull public ToClientPacket generateInitPacket(DefaultAssetMap<String, Item> assetMap, @Nonnull Map<String, Item> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(DefaultAssetMap<String, Item> assetMap, @Nonnull Map<String, Item> loadedAssets, @Nonnull AssetUpdateQuery query)
- @Nonnull public ToClientPacket generateRemovePacket(DefaultAssetMap<String, Item> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query)

Also in this package: CraftingRecipePacketGenerator, ItemModule, ItemQualityPacketGenerator, ItemReticleConfigPacketGenerator, RecipePacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,Item> assetMap, Map<String,Item> assets)
  public ToClientPacket generateUpdatePacket(DefaultAssetMap<String,Item> assetMap, Map<String,Item> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(DefaultAssetMap<String,Item> assetMap, Set<String> removed, AssetUpdateQuery query)
