# CameraShakePacketGenerator

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.asset.camerashake | Extends: SimpleAssetPacketGenerator

public class CameraShakePacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedAssetMap<String,CameraShake> assetMap, Map<String,CameraShake> assets)
- @Nonnull protected ToClientPacket generateUpdatePacket(IndexedAssetMap<String,CameraShake> assetMap, Map<String,CameraShake> loadedAssets)
- @Nonnull protected ToClientPacket generateRemovePacket(IndexedAssetMap<String,CameraShake> assetMap, Set<String> removed)
- @Nonnull protected static ToClientPacket toCachedPacket(UpdateType type, IndexedAssetMap<String,CameraShake> assetMap, Map<String,CameraShake> assets)
