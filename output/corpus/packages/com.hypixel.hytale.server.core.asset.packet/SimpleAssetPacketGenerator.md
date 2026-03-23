# SimpleAssetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.packet | Extends: AssetPacketGenerator

public abstract class SimpleAssetPacketGenerator<K, T, M> extends AssetPacketGenerator

## Methods

- @Override public abstract ToClientPacket generateInitPacket(M var1, Map<K,T> var2)
- @Override public ToClientPacket generateUpdatePacket(M assetMap, Map<K,T> loadedAssets, AssetUpdateQuery query)
- @Override public ToClientPacket generateRemovePacket(M assetMap, Set<K> removed, AssetUpdateQuery query)
- protected abstract ToClientPacket generateUpdatePacket(M var1, Map<K,T> var2)
- @Nullable protected abstract ToClientPacket generateRemovePacket(M var1, Set<K> var2)
