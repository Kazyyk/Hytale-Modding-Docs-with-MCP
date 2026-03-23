# SoundEvent

Type: class | Package: com.hypixel.hytale.server.core.asset.type.soundevent.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, SoundEvent>>, NetworkSerializable<com.hypixel.hytale.protocol.SoundEvent>

public class SoundEvent implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, SoundEvent>>, NetworkSerializable<com.hypixel.hytale.protocol.SoundEvent>

## Fields

- public static final int EMPTY_ID
- public static final String EMPTY
- public static final SoundEvent EMPTY_SOUND_EVENT
- public static final ValidatorCache<String> VALIDATOR_CACHE
- protected AssetExtraInfo.Data data
- protected String id
- protected transient float volume
- protected transient float pitch
- protected transient float musicDuckingVolume
- protected transient float ambientDuckingVolume
- protected float startAttenuationDistance
- protected float maxDistance
- protected int maxInstance
- protected boolean preventSoundInterruption
- protected SoundEventLayer[] layers
- protected String audioCategoryId
- protected transient int audioCategoryIndex
- protected transient int highestNumberOfChannels
- private SoftReference<com.hypixel.hytale.protocol.SoundEvent> cachedPacket

## Methods

- public static IndexedLookupTableAssetMap<String, SoundEvent> getAssetMap()
- protected void processConfig()
- public String getId()
- public float getVolume()
- public float getPitch()
- public float getMusicDuckingVolume()
- public float getAmbientDuckingVolume()
- public float getStartAttenuationDistance()
- public float getMaxDistance()
- public int getMaxInstance()
- public boolean getPreventSoundInterruption()
- public SoundEventLayer[] getLayers()
- @Nullable public String getAudioCategoryId()
- public int getAudioCategoryIndex()
- public int getHighestNumberOfChannels()
- @Override @Nonnull public String toString()
- @Nonnull public com.hypixel.hytale.protocol.SoundEvent toPacket()
