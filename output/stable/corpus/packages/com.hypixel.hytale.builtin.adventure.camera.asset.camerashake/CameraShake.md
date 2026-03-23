# CameraShake

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.asset.camerashake | Implements: NetworkSerializable, JsonAssetWithMap

public class CameraShake implements NetworkSerializable, JsonAssetWithMap

## Fields

- public static final AssetBuilderCodec<String,CameraShake> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,CameraShake,IndexedAssetMap<String,CameraShake>> ASSET_STORE
- protected String id
- protected AssetExtraInfo.Data data
- protected CameraShakeConfig firstPerson
- protected CameraShakeConfig thirdPerson

## Methods

- @Nonnull public static AssetStore<String,CameraShake,IndexedAssetMap<String,CameraShake>> getAssetStore()
- @Nonnull public static IndexedAssetMap<String,CameraShake> getAssetMap()
- @Nonnull public com.hypixel.hytale.protocol.CameraShake toPacket()
- public String getId()
- @Nonnull @Override public String toString()
