# FluidFXPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.fluidfx | Extends: SimpleAssetPacketGenerator

public class FluidFXPacketGenerator extends SimpleAssetPacketGenerator<String, FluidFX, IndexedLookupTableAssetMap<String, FluidFX>>

Generates init, update, and remove network packets for `FluidFX` assets.

## Methods

- generateInitPacket(IndexedLookupTableAssetMap<String, FluidFX> assetMap, Map<String, FluidFX> assets) | ToClientPacket | Instance method.
- generateUpdatePacket(IndexedLookupTableAssetMap<String, FluidFX> assetMap, Map<String, FluidFX> loadedAssets) | ToClientPacket | Instance method.
- generateRemovePacket(IndexedLookupTableAssetMap<String, FluidFX> assetMap, Set<String> removed) | ToClientPacket | Instance method.
