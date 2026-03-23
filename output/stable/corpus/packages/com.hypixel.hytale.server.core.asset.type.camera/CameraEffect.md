# CameraEffect

Type: class | Package: com.hypixel.hytale.server.core.asset.type.camera | Implements: JsonAssetWithMap

public abstract class CameraEffect implements JsonAssetWithMap

## Fields

- public static final AssetCodecMapCodec<String,CameraEffect> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,CameraEffect,IndexedLookupTableAssetMap<String,CameraEffect>> ASSET_STORE
- protected String id
- protected AssetExtraInfo.Data data

## Methods

- @Nonnull public static AssetStore<String,CameraEffect,IndexedLookupTableAssetMap<String,CameraEffect>> getAssetStore()
- @Nonnull public static IndexedLookupTableAssetMap<String,CameraEffect> getAssetMap()
- public String getId()
- public abstract CameraShakeEffect createCameraShakePacket()
- public abstract CameraShakeEffect createCameraShakePacket(float var1)

## Inner Types

- `CameraEffect.MissingCameraEffect`

Known subclasses: CameraShakeEffect, MissingCameraEffect

Also in this package: MissingCameraEffect

Complete API:
  public static AssetStore<String,CameraEffect,IndexedLookupTableAssetMap<String,CameraEffect>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,CameraEffect> getAssetMap()
  public String getId()
  public abstract CameraShakeEffect createCameraShakePacket()
  public abstract CameraShakeEffect createCameraShakePacket(float var1)

Fields:
public static final AssetCodecMapCodec<String,CameraEffect> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,CameraEffect,IndexedLookupTableAssetMap<String,CameraEffect>> ASSET_STORE
protected String id
protected AssetExtraInfo.Data data
