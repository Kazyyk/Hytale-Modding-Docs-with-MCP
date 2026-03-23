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
