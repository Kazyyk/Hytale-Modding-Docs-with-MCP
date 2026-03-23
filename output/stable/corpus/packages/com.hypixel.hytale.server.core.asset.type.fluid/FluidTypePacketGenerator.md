# FluidTypePacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluid | Extends: com.hypixel.hytale.server.core.asset.packet.AssetPacketGenerator

public class FluidTypePacketGenerator extends AssetPacketGenerator<String, Fluid, IndexedLookupTableAssetMap<String, Fluid>>

Generates `UpdateFluids` network packets for synchronizing fluid asset definitions to clients. Produces three packet types: `Init` (full asset map), `AddOrUpdate` (changed assets), and `Remove` (deleted assets). Each packet maps integer fluid indices to their protocol `Fluid` representation via Fluid`.toPacket()`.

## Methods

- @Nonnull public ToClientPacket generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, Fluid> assetMap, @Nonnull Map<String, Fluid> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, Fluid> assetMap, @Nonnull Map<String, Fluid> loadedAssets, @Nonnull AssetUpdateQuery query)
- @Nonnull public ToClientPacket generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, Fluid> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query)

## Related Types

- Fluid -- the asset type serialized into packets
