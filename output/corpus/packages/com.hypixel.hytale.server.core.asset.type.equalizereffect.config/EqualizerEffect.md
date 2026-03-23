# EqualizerEffect

Type: class | Package: com.hypixel.hytale.server.core.asset.type.equalizereffect.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EqualizerEffect>>, NetworkSerializable<com.hypixel.hytale.protocol.EqualizerEffect>

public class EqualizerEffect implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EqualizerEffect>>, NetworkSerializable<com.hypixel.hytale.protocol.EqualizerEffect>

Class in the config subsystem.

## Fields

- EMPTY_ID | int | Static final int field.
- EMPTY | String | Static final String field.
- MIN_GAIN_DB | float | Static final float field.
- MAX_GAIN_DB | float | Static final float field.
- MIN_WIDTH | float | Static final float field.
- MAX_WIDTH | float | Static final float field.
- LOW_FREQ_MIN | float | Static final float field.
- LOW_FREQ_MAX | float | Static final float field.
- LOW_MID_FREQ_MIN | float | Static final float field.
- LOW_MID_FREQ_MAX | float | Static final float field.
- HIGH_MID_FREQ_MIN | float | Static final float field.
- HIGH_MID_FREQ_MAX | float | Static final float field.
- HIGH_FREQ_MIN | float | Static final float field.
- HIGH_FREQ_MAX | float | Static final float field.
- ASSET_STORE | AssetStore<String, EqualizerEffect, IndexedLookupTableAssetMap<String, EqualizerEffect>> | Static AssetStore<String, EqualizerEffect, IndexedLookupTableAssetMap<String, EqualizerEffect>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- lowGain | float | float field.
- lowCutOff | float | float field.
- lowMidGain | float | float field.
- lowMidCenter | float | float field.
- lowMidWidth | float | float field.
- highMidGain | float | float field.
- highMidCenter | float | float field.
- highMidWidth | float | float field.
- highGain | float | float field.
- highCutOff | float | float field.
- cachedPacket | SoftReference<com.hypixel.hytale.protocol.EqualizerEffect> | SoftReference<com.hypixel.hytale.protocol.EqualizerEffect> field.

## Constructors

- EqualizerEffect(String id) | Creates a new EqualizerEffect instance.
- EqualizerEffect() | Creates a new EqualizerEffect instance.

## Methods

- getAssetStore() | AssetStore<String, EqualizerEffect, IndexedLookupTableAssetMap<String, EqualizerEffect>> | static public method.
- getAssetMap() | IndexedLookupTableAssetMap<String, EqualizerEffect> | static public method.
- getId() | String | public method.
- getLowGain() | float | public method.
- getLowCutOff() | float | public method.
- getLowMidGain() | float | public method.
- getLowMidCenter() | float | public method.
- getLowMidWidth() | float | public method.
- getHighMidGain() | float | public method.
- getHighMidCenter() | float | public method.
- getHighMidWidth() | float | public method.
- getHighGain() | float | public method.
- getHighCutOff() | float | public method.
- toString() | String | public method.
- toPacket() | com.hypixel.hytale.protocol.EqualizerEffect | public method.
