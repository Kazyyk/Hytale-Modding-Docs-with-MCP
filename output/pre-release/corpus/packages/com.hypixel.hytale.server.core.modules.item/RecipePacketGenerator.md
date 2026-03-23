# RecipePacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.item | Extends: AssetPacketGenerator<String, CraftingRecipe, DefaultAssetMap<String, CraftingRecipe>>

public class RecipePacketGenerator extends AssetPacketGenerator<String, CraftingRecipe, DefaultAssetMap<String, CraftingRecipe>>

## Methods

- @Nonnull public ToClientPacket generateInitPacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Map<String, CraftingRecipe> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Map<String, CraftingRecipe> loadedAssets, @Nonnull AssetUpdateQuery query)
- @Nonnull public ToClientPacket generateRemovePacket(DefaultAssetMap<String, CraftingRecipe> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query)
