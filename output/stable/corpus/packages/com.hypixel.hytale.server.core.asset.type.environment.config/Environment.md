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
