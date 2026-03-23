# Environment

Type: class | Package: com.hypixel.hytale.server.core.asset.type.environment.config | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Environment>>, NetworkSerializable<WorldEnvironment>

public class Environment implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Environment>>, NetworkSerializable<WorldEnvironment>

Implementation of `JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Environment>>, NetworkSerializable<WorldEnvironment>`.

## Fields

- MAX_KEY_HOUR | int | Static final int field.
- HOURS | Integer[] | Static final Integer[] field.
- DEFAULT_WEATHER_FORECAST | IWeightedMap<WeatherForecast> | Static final IWeightedMap<WeatherForecast> field.
- CODEC | AssetBuilderCodec<String, Environment> | Static final AssetBuilderCodec<String, Environment> field.
- VALIDATOR_CACHE | ValidatorCache<String> | Static final ValidatorCache<String> field.
- ASSET_STORE | AssetStore<String, Environment, IndexedLookupTableAssetMap<String, Environment>> | Static AssetStore<String, Environment, IndexedLookupTableAssetMap<String, Environment>> field.
- UNKNOWN_ID | int | Static final int field.
- UNKNOWN | Environment | Static final Environment field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- id | String | String field.
- waterTint | Color | Color field.
- weatherForecasts | Int2ObjectMap<IWeightedMap<WeatherForecast>> | Int2ObjectMap<IWeightedMap<WeatherForecast>> field.
- spawnDensity | double | double field.
- blockModificationAllowed | boolean | boolean field.
- cachedPacket | SoftReference<WorldEnvironment> | SoftReference<WorldEnvironment> field.

## Constructors

- Environment() | Creates a new Environment instance.

## Methods

- getAssetStore() | AssetStore<String, Environment, IndexedLookupTableAssetMap<String, Environment>> | static public method.
- getAssetMap() | IndexedLookupTableAssetMap<String, Environment> | static public method.
- getId() | String | public method.
- getWaterTint() | Color | public method.
- getFluidParticles() | Map<String, FluidParticle> | public method.
- getWeatherForecasts() | Int2ObjectMap<IWeightedMap<WeatherForecast>> | public method.
- getWeatherForecast(int hour) | IWeightedMap<WeatherForecast> | public method.
- getSpawnDensity() | double | public method.
- isBlockModificationAllowed() | boolean | public method.
- toPacket() | WorldEnvironment | public method.
- equals(@Nullable Object o) | boolean | public method.
- hashCode() | int | public method.
- toString() | String | public method.
- getUnknownFor(final String unknownId) | Environment | static public method.
- getIndexOrUnknown(String id, String message, Object... params) | int | static public method.

Also in this package: WeatherForecast

Complete API:
  public static AssetStore<String,Environment,IndexedLookupTableAssetMap<String,Environment>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,Environment> getAssetMap()
  public String getId()
  public Color getWaterTint()
  public Map<String,FluidParticle> getFluidParticles()
  public Int2ObjectMap<IWeightedMap<WeatherForecast>> getWeatherForecasts()
  public IWeightedMap<WeatherForecast> getWeatherForecast(int hour)
  public double getSpawnDensity()
  public boolean isBlockModificationAllowed()
  public WorldEnvironment toPacket()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static Environment getUnknownFor(String unknownId)
  public static int getIndexOrUnknown(String id, String message, Object params)

Fields:
public static final int HOURS_PER_DAY
public static final int MAX_KEY_HOUR
public static final Integer[] HOURS
private static final IWeightedMap<WeatherForecast> DEFAULT_WEATHER_FORECAST
public static final AssetBuilderCodec<String,Environment> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,Environment,IndexedLookupTableAssetMap<String,Environment>> ASSET_STORE
public static final int UNKNOWN_ID
public static final Environment UNKNOWN
protected AssetExtraInfo.Data data
protected String id
protected Color waterTint
protected Map<String,FluidParticle> fluidParticles
protected Int2ObjectMap<IWeightedMap<WeatherForecast>> weatherForecasts
protected double spawnDensity
protected boolean blockModificationAllowed
private SoftReference<WorldEnvironment> cachedPacket
