# ModelVFXPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.modelvfx | Extends: SimpleAssetPacketGenerator

public class ModelVFXPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Map<String,ModelVFX> assets)
- @Nonnull protected ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Map<String,ModelVFX> loadedAssets)
- @Nonnull protected ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Map<String,ModelVFX> assets)
  protected ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Map<String,ModelVFX> loadedAssets)
  protected ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,ModelVFX> assetMap, Set<String> removed)
