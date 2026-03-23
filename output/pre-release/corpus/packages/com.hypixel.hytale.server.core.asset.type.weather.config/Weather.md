# Weather

Type: class | Package: com.hypixel.hytale.server.core.asset.type.weather.config

public class Weather implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Weather>>, NetworkSerializable<com.hypixel.hytale.protocol.Weather>

## Constants

- public static final ValidatorCache<String> VALIDATOR_CACHE
- public static final float[] DEFAULT_FOG_DISTANCE
- public static final int UNKNOWN_ID
- public static final Weather UNKNOWN

## Fields

- private static AssetStore<String, Weather, IndexedLookupTableAssetMap<String, Weather>> ASSET_STORE
- public static final float[] DEFAULT_FOG_DISTANCE
- public static final int UNKNOWN_ID
- protected AssetExtraInfo.Data data
- protected String id
- protected DayTexture[] moons
- protected Cloud[] clouds
- protected TimeFloat[] sunlightDampingMultiplier
- protected TimeColor[] sunlightColors
- protected TimeColor[] sunColors
- protected TimeColorAlpha[] moonColors
- protected TimeColorAlpha[] sunGlowColors
- protected TimeColorAlpha[] moonGlowColors
- protected TimeFloat[] sunScales
- protected TimeFloat[] moonScales
- protected TimeColorAlpha[] skyTopColors
- protected TimeColorAlpha[] skyBottomColors
- protected TimeColorAlpha[] skySunsetColors
- protected TimeColor[] fogColors
- protected TimeFloat[] fogHeightFalloffs
- protected TimeFloat[] fogDensities
- protected TimeColor[] waterTints
- protected float[] fogDistance
- protected FogOptions fogOptions
- protected String screenEffect
- protected TimeColorAlpha[] screenEffectColors
- protected TimeColor[] colorFilters
- protected String stars
- protected WeatherParticle particle
- private SoftReference<com.hypixel.hytale.protocol.Weather> cachedPacket

## Methods

- public static AssetStore<String, Weather, IndexedLookupTableAssetMap<String, Weather>> getAssetStore()
- public static IndexedLookupTableAssetMap<String, Weather> getAssetMap()
- public Weather( String id, DayTexture[] moons, Cloud[] clouds, TimeFloat[] sunlightDampingMultiplier, TimeColor[] sunlightColors, TimeColor[] sunColors, TimeColorAlpha[] moonColors, TimeColorAlpha[] sunGlowColors, TimeColorAlpha[] moonGlowColors, TimeFloat[] sunScales, TimeFloat[] moonScales, TimeColorAlpha[] skyTopColors, TimeColorAlpha[] skyBottomColors, TimeColorAlpha[] skySunsetColors, TimeColor[] fogColors, TimeFloat[] fogHeightFalloffs, TimeFloat[] fogDensities, TimeColor[] waterTints, float[] fogDistance, FogOptions fogOptions, String screenEffect, TimeColorAlpha[] screenEffectColors, TimeColor[] colorFilters, String stars, WeatherParticle particle )
- public Weather(String id)
- protected Weather()
- public com.hypixel.hytale.protocol.Weather toPacket()
- public String getId()
- public DayTexture[] getMoons()
- public Cloud[] getClouds()
- public TimeFloat[] getSunlightDampingMultiplier()
- public TimeColor[] getSunlightColors()
- public TimeColor[] getSunColors()
- public TimeColorAlpha[] getMoonColors()
- public TimeColorAlpha[] getSunGlowColors()
- public TimeColorAlpha[] getMoonGlowColors()
- public TimeFloat[] getSunScales()
- public TimeFloat[] getMoonScales()
- public TimeColorAlpha[] getSkyTopColors()
- public TimeColorAlpha[] getSkyBottomColors()
- public TimeColorAlpha[] getSkySunsetColors()
- public TimeColor[] getFogColors()
- public TimeFloat[] getFogHeightFalloffs()
- public TimeFloat[] getFogDensities()
- public TimeColor[] getWaterTints()
- public float[] getFogDistance()
- public FogOptions getFogOptions()
- public String getScreenEffect()
- public TimeColorAlpha[] getScreenEffectColors()
- public TimeColor[] getColorFilters()
- public String getStars()
- public WeatherParticle getParticle()
- public String toString()
- public static Map<Integer, String> toStringMap(@Nonnull DayTexture[] dayTexture)
- public static Map<Float, Float> toFloatMap(@Nonnull TimeFloat[] timeFloat)
- public static Map<Float, Color> toColorMap(@Nonnull TimeColor[] timeColor)
- public static Map<Float, ColorAlpha> toColorAlphaMap(@Nonnull TimeColorAlpha[] timeColorAlpha)

Also in this package: Cloud, DayTexture, FogOptions, TimeColor, TimeColorAlpha, TimeFloat

Complete API:
  public static AssetStore<String,Weather,IndexedLookupTableAssetMap<String,Weather>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,Weather> getAssetMap()
  public com.hypixel.hytale.protocol.Weather toPacket()
  public String getId()
  public DayTexture[] getMoons()
  public Cloud[] getClouds()
  public TimeFloat[] getSunlightDampingMultiplier()
  public TimeColor[] getSunlightColors()
  public TimeColor[] getSunColors()
  public TimeColorAlpha[] getMoonColors()
  public TimeColorAlpha[] getSunGlowColors()
  public TimeColorAlpha[] getMoonGlowColors()
  public TimeFloat[] getSunScales()
  public TimeFloat[] getMoonScales()
  public TimeColorAlpha[] getSkyTopColors()
  public TimeColorAlpha[] getSkyBottomColors()
  public TimeColorAlpha[] getSkySunsetColors()
  public TimeColor[] getFogColors()
  public TimeFloat[] getFogHeightFalloffs()
  public TimeFloat[] getFogDensities()
  public TimeColor[] getWaterTints()
  public float[] getFogDistance()
  public FogOptions getFogOptions()
  public String getScreenEffect()
  public TimeColorAlpha[] getScreenEffectColors()
  public TimeColor[] getColorFilters()
  public String getStars()
  public WeatherParticle getParticle()
  public String toString()
  public static Map<Integer,String> toStringMap(DayTexture[] dayTexture)
  public static Map<Float,Float> toFloatMap(TimeFloat[] timeFloat)
  public static Map<Float,Color> toColorMap(TimeColor[] timeColor)
  public static Map<Float,ColorAlpha> toColorAlphaMap(TimeColorAlpha[] timeColorAlpha)

Fields:
public static final BuilderCodec<WeatherParticle> PARTICLE_CODEC
public static final AssetBuilderCodec<String,Weather> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,Weather,IndexedLookupTableAssetMap<String,Weather>> ASSET_STORE
public static final float[] DEFAULT_FOG_DISTANCE
public static final int UNKNOWN_ID
public static final Weather UNKNOWN
protected AssetExtraInfo.Data data
protected String id
protected DayTexture[] moons
protected Cloud[] clouds
protected TimeFloat[] sunlightDampingMultiplier
protected TimeColor[] sunlightColors
protected TimeColor[] sunColors
protected TimeColorAlpha[] moonColors
protected TimeColorAlpha[] sunGlowColors
protected TimeColorAlpha[] moonGlowColors
protected TimeFloat[] sunScales
protected TimeFloat[] moonScales
protected TimeColorAlpha[] skyTopColors
protected TimeColorAlpha[] skyBottomColors
protected TimeColorAlpha[] skySunsetColors
protected TimeColor[] fogColors
protected TimeFloat[] fogHeightFalloffs
protected TimeFloat[] fogDensities
protected TimeColor[] waterTints
protected float[] fogDistance
protected FogOptions fogOptions
protected String screenEffect
protected TimeColorAlpha[] screenEffectColors
protected TimeColor[] colorFilters
protected String stars
protected WeatherParticle particle
private SoftReference<com.hypixel.hytale.protocol.Weather> cachedPacket
