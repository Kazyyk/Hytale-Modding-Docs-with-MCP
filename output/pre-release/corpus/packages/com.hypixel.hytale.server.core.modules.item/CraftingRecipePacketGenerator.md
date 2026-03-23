# CraftingRecipePacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.item | Extends: AssetPacketGenerator<String, CraftingRecipe, DefaultAssetMap<String, CraftingRecipe>>

public class CraftingRecipePacketGenerator extends AssetPacketGenerator<String, CraftingRecipe, DefaultAssetMap<String, CraftingRecipe>>

## Methods

- @Nonnull public ToClientPacket generateInitPacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Map<String, CraftingRecipe> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Map<String, CraftingRecipe> loadedAssets, @Nonnull AssetUpdateQuery query)
- @Nonnull public ToClientPacket generateRemovePacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query)

Also in this package: ItemModule, ItemPacketGenerator, ItemQualityPacketGenerator, ItemReticleConfigPacketGenerator, RecipePacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,CraftingRecipe> assetMap, Map<String,CraftingRecipe> assets)
  public ToClientPacket generateUpdatePacket(DefaultAssetMap<String,CraftingRecipe> assetMap, Map<String,CraftingRecipe> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(DefaultAssetMap<String,CraftingRecipe> assetMap, Set<String> removed, AssetUpdateQuery query)
