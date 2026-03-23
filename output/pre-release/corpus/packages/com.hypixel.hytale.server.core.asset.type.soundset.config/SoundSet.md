# SoundSet

Type: class | Package: com.hypixel.hytale.server.core.asset.type.soundset.config | Implements: JsonAssetWithMap, NetworkSerializable

public class SoundSet implements JsonAssetWithMap, NetworkSerializable

## Fields

- public static final int EMPTY_ID
- public static final String EMPTY
- public static final SoundSet EMPTY_SOUND_SET
- public static final AssetBuilderCodec<String,SoundSet> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,SoundSet,IndexedLookupTableAssetMap<String,SoundSet>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected Map<String,String> soundEventIds
- protected transient Object2IntMap<String> soundEventIndices
- protected SoundCategory category
- private SoftReference<com.hypixel.hytale.protocol.SoundSet> cachedPacket

## Methods

- public static AssetStore<String,SoundSet,IndexedLookupTableAssetMap<String,SoundSet>> getAssetStore()
- public static IndexedLookupTableAssetMap<String,SoundSet> getAssetMap()
- public String getId()
- public Map<String,String> getSoundEventIds()
- public Object2IntMap<String> getSoundEventIndices()
- protected void processConfig()
- @Nonnull @Override public String toString()
- @Nonnull public com.hypixel.hytale.protocol.SoundSet toPacket()
