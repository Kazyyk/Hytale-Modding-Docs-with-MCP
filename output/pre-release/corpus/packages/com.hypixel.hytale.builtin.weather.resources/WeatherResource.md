# WeatherResource

Type: class | Package: com.hypixel.hytale.builtin.weather.resources | Implements: Resource

public class WeatherResource implements Resource<EntityStore>

ECS resource attached to `EntityStore`.

## Constants

- WEATHER_UPDATE_RATE_S | float

## Accessors

- getResourceType() | ResourceType<EntityStore, WeatherResource> | Accessor method.
- getEnvironmentWeather() | Int2IntMap | Accessor method.
- getWeatherIndexForEnvironment(int environmentId) | int | Accessor method.
- getForcedWeatherIndex() | int | Accessor method.
- setForcedWeather(String forcedWeather) | void | Mutator method.

## Methods

- consumeForcedWeatherChange() | boolean | Instance method.
- compareAndSwapHour(int currentHour) | boolean | Instance method.

Complete API:
  public static ResourceType<EntityStore,WeatherResource> getResourceType()
  public Int2IntMap getEnvironmentWeather()
  public int getWeatherIndexForEnvironment(int environmentId)
  public int getForcedWeatherIndex()
  public void setForcedWeather(String forcedWeather)
  public boolean consumeForcedWeatherChange()
  public boolean compareAndSwapHour(int currentHour)
  public Resource<EntityStore> clone()

Fields:
public static final float WEATHER_UPDATE_RATE_S
private int forcedWeatherIndex
private int previousForcedWeatherIndex
private final Int2IntMap environmentWeather
private int previousHour
public float playerUpdateDelay
