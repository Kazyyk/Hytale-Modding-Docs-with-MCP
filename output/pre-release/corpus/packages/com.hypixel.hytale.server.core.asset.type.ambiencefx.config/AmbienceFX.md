# AmbienceFX

Type: class | Package: com.hypixel.hytale.server.core.asset.type.ambiencefx.config | Implements: JsonAssetWithMap, NetworkSerializable

public class AmbienceFX implements JsonAssetWithMap<String, IndexedAssetMap<String, AmbienceFX>>, NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFX>

Implements `JsonAssetWithMap`, `NetworkSerializable`.

## Constants

- public static final int EMPTY_ID
- public static final AmbienceFX EMPTY
        {
            this.id = "Empty"` |

## Fields

- protected AssetExtraInfo.Data data
- protected String id
- protected AmbienceFXConditions conditions
- protected AmbienceFXSound[] sounds
- protected AmbienceFXMusic music
- protected AmbienceFXAmbientBed ambientBed
- protected AmbienceFXSoundEffect soundEffect
- protected int priority
- protected String[] blockedAmbienceFxIds
- @Nullable protected String audioCategoryId
- protected transient int audioCategoryIndex
- private SoftReference<com.hypixel.hytale.protocol.AmbienceFX> cachedPacket

## Methods

- public static AssetStore<String, AmbienceFX, IndexedAssetMap<String, AmbienceFX>> getAssetStore()
- public static IndexedAssetMap<String, AmbienceFX> getAssetMap()
- @Nonnull public com.hypixel.hytale.protocol.AmbienceFX toPacket()
- public String getId()
- public AmbienceFXConditions getConditions()
- public AmbienceFXSound[] getSounds()
- public AmbienceFXMusic getMusic()
- public AmbienceFXAmbientBed getAmbientBed()
- public AmbienceFXSoundEffect getSoundEffect()
- public int getPriority()
- public String[] getBlockedAmbienceFxIds()
- @Override public String toString()
