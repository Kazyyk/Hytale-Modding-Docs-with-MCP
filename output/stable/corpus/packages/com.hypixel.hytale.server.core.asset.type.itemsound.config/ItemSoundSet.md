# ItemSoundSet

Type: class | Package: com.hypixel.hytale.server.core.asset.type.itemsound.config | Implements: JsonAssetWithMap, NetworkSerializable

public class ItemSoundSet implements JsonAssetWithMap, NetworkSerializable

## Fields

- public static final AssetBuilderCodec<String,ItemSoundSet> CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,ItemSoundSet,IndexedLookupTableAssetMap<String,ItemSoundSet>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected Map<ItemSoundEvent,String> soundEventIds
- protected transient Object2IntMap<ItemSoundEvent> soundEventIndices
- private SoftReference<com.hypixel.hytale.protocol.ItemSoundSet> cachedPacket

## Methods

- public static AssetStore<String,ItemSoundSet,IndexedLookupTableAssetMap<String,ItemSoundSet>> getAssetStore()
- public static IndexedLookupTableAssetMap<String,ItemSoundSet> getAssetMap()
- @Nonnull public com.hypixel.hytale.protocol.ItemSoundSet toPacket()
- public String getId()
- public Map<ItemSoundEvent,String> getSoundEventIds()
- public Object2IntMap<ItemSoundEvent> getSoundEventIndices()
- protected void processConfig()
- @Nonnull @Override public String toString()
