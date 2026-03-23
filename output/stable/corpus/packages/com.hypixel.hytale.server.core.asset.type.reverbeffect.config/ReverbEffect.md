# ReverbEffect

Type: class | Package: com.hypixel.hytale.server.core.asset.type.reverbeffect.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ReverbEffect>>, NetworkSerializable<com.hypixel.hytale.protocol.ReverbEffect>

public class ReverbEffect implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, ReverbEffect>>, NetworkSerializable<com.hypixel.hytale.protocol.ReverbEffect>

Class in the config subsystem.

## Fields

- EMPTY_ID | int | Static final int field.
- EMPTY | String | Static final String field.
- ASSET_STORE | AssetStore<String, ReverbEffect, IndexedLookupTableAssetMap<String, ReverbEffect>> | Static AssetStore<String, ReverbEffect, IndexedLookupTableAssetMap<String, ReverbEffect>> field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- modalDensity | float | float field.
- diffusion | float | float field.
- decayTime | float | float field.
- highFrequencyDecayRatio | float | float field.
- reflectionDelay | float | float field.
- lateReverbDelay | float | float field.
- roomRolloffFactor | float | float field.
- limitDecayHighFrequency | boolean | boolean field.
- cachedPacket | SoftReference<com.hypixel.hytale.protocol.ReverbEffect> | SoftReference<com.hypixel.hytale.protocol.ReverbEffect> field.

## Constructors

- ReverbEffect(String id) | Creates a new ReverbEffect instance.
- ReverbEffect() | Creates a new ReverbEffect instance.

## Methods

- getAssetStore() | AssetStore<String, ReverbEffect, IndexedLookupTableAssetMap<String, ReverbEffect>> | static public method.
- getAssetMap() | IndexedLookupTableAssetMap<String, ReverbEffect> | static public method.
- getId() | String | public method.
- getDryGain() | float | public method.
- getModalDensity() | float | public method.
- getDiffusion() | float | public method.
- getGain() | float | public method.
- getHighFrequencyGain() | float | public method.
- getDecayTime() | float | public method.
- getHighFrequencyDecayRatio() | float | public method.
- getReflectionGain() | float | public method.
- getReflectionDelay() | float | public method.
- getLateReverbGain() | float | public method.
- getLateReverbDelay() | float | public method.
- getRoomRolloffFactor() | float | public method.
- getAirAbsorptionHighFrequencyGain() | float | public method.
- isLimitDecayHighFrequency() | boolean | public method.
- toString() | String | public method.
- toPacket() | com.hypixel.hytale.protocol.ReverbEffect | public method.
