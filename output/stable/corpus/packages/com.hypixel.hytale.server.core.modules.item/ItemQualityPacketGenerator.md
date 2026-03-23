# ItemQualityPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.item | Extends: SimpleAssetPacketGenerator<String, ItemQuality, IndexedLookupTableAssetMap<String, ItemQuality>>

public class ItemQualityPacketGenerator extends SimpleAssetPacketGenerator<String, ItemQuality, IndexedLookupTableAssetMap<String, ItemQuality>>

## Methods

- @Nonnull public ToClientPacket generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Map<String, ItemQuality> assets)
- @Nonnull protected ToClientPacket generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Map<String, ItemQuality> loadedAssets)
- @Nonnull protected ToClientPacket generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Set<String> removed)

Also in this package: CraftingRecipePacketGenerator, ItemModule, ItemPacketGenerator, ItemReticleConfigPacketGenerator, RecipePacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,ItemQuality> assetMap, Map<String,ItemQuality> assets)
  protected ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,ItemQuality> assetMap, Map<String,ItemQuality> loadedAssets)
  protected ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,ItemQuality> assetMap, Set<String> removed)
