# AudioCategory

Type: class | Package: com.hypixel.hytale.server.core.asset.type.audiocategory.config | Implements: JsonAssetWithMap, NetworkSerializable

public class AudioCategory implements JsonAssetWithMap, NetworkSerializable

## Fields

- public static final int EMPTY_ID
- public static final String EMPTY
- public static final AudioCategory EMPTY_AUDIO_CATEGORY
- public static final AssetBuilderCodec<String,AudioCategory> CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,AudioCategory,IndexedLookupTableAssetMap<String,AudioCategory>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected float volume
- private SoftReference<com.hypixel.hytale.protocol.AudioCategory> cachedPacket

## Methods

- public static AssetStore<String,AudioCategory,IndexedLookupTableAssetMap<String,AudioCategory>> getAssetStore()
- public static IndexedLookupTableAssetMap<String,AudioCategory> getAssetMap()
- public String getId()
- public float getVolume()
- @Nonnull @Override public String toString()
- @Nonnull public com.hypixel.hytale.protocol.AudioCategory toPacket()

Complete API:
  public static AssetStore<String,AudioCategory,IndexedLookupTableAssetMap<String,AudioCategory>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,AudioCategory> getAssetMap()
  public String getId()
  public float getVolume()
  public String toString()
  public com.hypixel.hytale.protocol.AudioCategory toPacket()

Fields:
public static final int EMPTY_ID
public static final String EMPTY
public static final AudioCategory EMPTY_AUDIO_CATEGORY
public static final AssetBuilderCodec<String,AudioCategory> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,AudioCategory,IndexedLookupTableAssetMap<String,AudioCategory>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected float volume
private SoftReference<com.hypixel.hytale.protocol.AudioCategory> cachedPacket
