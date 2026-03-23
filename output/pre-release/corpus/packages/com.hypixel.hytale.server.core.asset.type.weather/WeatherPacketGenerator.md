# WeatherPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.weather | Extends: SimpleAssetPacketGenerator

public class WeatherPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Map<String,Weather> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Map<String,Weather> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Map<String,Weather> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Map<String,Weather> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,Weather> assetMap, Set<String> removed)
