# WeatherPlugin

Type: class | Package: com.hypixel.hytale.builtin.weather | Extends: JavaPlugin

public class WeatherPlugin extends JavaPlugin

Server plugin that initializes the Weather system and registers related features.

## Accessors

- get() | WeatherPlugin | Accessor method.
- getWeatherTrackerComponentType() | ComponentType<EntityStore, WeatherTracker> | Accessor method.
- getWeatherResourceType() | ResourceType<EntityStore, WeatherResource> | Accessor method.

Complete API:
  public static WeatherPlugin get()
  protected void setup()
  public ComponentType<EntityStore,WeatherTracker> getWeatherTrackerComponentType()
  public ResourceType<EntityStore,WeatherResource> getWeatherResourceType()

Fields:
private static WeatherPlugin instance
private ComponentType<EntityStore,WeatherTracker> weatherTrackerComponentType
private ResourceType<EntityStore,WeatherResource> weatherResourceType
