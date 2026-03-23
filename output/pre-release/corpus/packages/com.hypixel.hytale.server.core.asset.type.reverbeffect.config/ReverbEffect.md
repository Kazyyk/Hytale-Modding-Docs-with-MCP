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

Complete API:
  public static AssetStore<String,ReverbEffect,IndexedLookupTableAssetMap<String,ReverbEffect>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,ReverbEffect> getAssetMap()
  public String getId()
  public float getDryGain()
  public float getModalDensity()
  public float getDiffusion()
  public float getGain()
  public float getHighFrequencyGain()
  public float getDecayTime()
  public float getHighFrequencyDecayRatio()
  public float getReflectionGain()
  public float getReflectionDelay()
  public float getLateReverbGain()
  public float getLateReverbDelay()
  public float getRoomRolloffFactor()
  public float getAirAbsorptionHighFrequencyGain()
  public boolean isLimitDecayHighFrequency()
  public String toString()
  public com.hypixel.hytale.protocol.ReverbEffect toPacket()

Fields:
public static final int EMPTY_ID
public static final String EMPTY
public static final ReverbEffect EMPTY_REVERB_EFFECT
public static final AssetBuilderCodec<String,ReverbEffect> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,ReverbEffect,IndexedLookupTableAssetMap<String,ReverbEffect>> ASSET_STORE
protected AssetExtraInfo.Data data
protected String id
protected float dryGain
protected float modalDensity
protected float diffusion
protected float gain
protected float highFrequencyGain
protected float decayTime
protected float highFrequencyDecayRatio
protected float reflectionGain
protected float reflectionDelay
protected float lateReverbGain
protected float lateReverbDelay
protected float roomRolloffFactor
protected float airAbsorptionHighFrequencyGain
protected boolean limitDecayHighFrequency
private SoftReference<com.hypixel.hytale.protocol.ReverbEffect> cachedPacket
