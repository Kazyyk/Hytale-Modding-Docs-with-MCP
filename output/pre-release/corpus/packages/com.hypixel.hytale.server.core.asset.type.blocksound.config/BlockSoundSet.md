# BlockSoundSet

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocksound.config | Implements: JsonAssetWithMap, NetworkSerializable

public class BlockSoundSet implements JsonAssetWithMap, NetworkSerializable

## Fields

- public static final int EMPTY_ID
- public static final String EMPTY
- private static final FloatRange DEFAULT_MOVE_IN_REPEAT_RANGE
- public static final BlockSoundSet EMPTY_BLOCK_SOUND_SET
- public static final AssetBuilderCodec<String,BlockSoundSet> CODEC
- public static final ValidatorCache<String> VALIDATOR_CACHE
- private static AssetStore<String,BlockSoundSet,IndexedLookupTableAssetMap<String,BlockSoundSet>> ASSET_STORE
- protected AssetExtraInfo.Data data
- protected String id
- protected Map<BlockSoundEvent,String> soundEventIds
- protected transient Object2IntMap<BlockSoundEvent> soundEventIndices
- protected FloatRange moveInRepeatRange
- private SoftReference<com.hypixel.hytale.protocol.BlockSoundSet> cachedPacket

## Methods

- public static AssetStore<String,BlockSoundSet,IndexedLookupTableAssetMap<String,BlockSoundSet>> getAssetStore()
- public static IndexedLookupTableAssetMap<String,BlockSoundSet> getAssetMap()
- @Nonnull public com.hypixel.hytale.protocol.BlockSoundSet toPacket()
- public String getId()
- public Map<BlockSoundEvent,String> getSoundEventIds()
- public Object2IntMap<BlockSoundEvent> getSoundEventIndices()
- public FloatRange getMoveInRepeatRange()
- protected void processConfig()
- @Nonnull @Override public String toString()
