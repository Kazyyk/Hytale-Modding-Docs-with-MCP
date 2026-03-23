# WeatherTracker

Type: class | Package: com.hypixel.hytale.builtin.weather.components | Implements: Component

public class WeatherTracker implements Component

## Fields

- private final UpdateWeather updateWeather
- private final Vector3i previousBlockPosition
- private int environmentId
- private boolean firstSendForWorld

## Methods

- public static ComponentType<EntityStore,WeatherTracker> getComponentType()
- public void updateWeather(PlayerRef playerRef, WeatherResource weatherComponent, TransformComponent transformComponent, float transitionSeconds, ComponentAccessor<EntityStore> componentAccessor)
- public void sendWeatherIndex(PlayerRef playerRef, int weatherIndex, float transitionSeconds)
- public boolean consumeFirstSendForWorld()
- public void clear()
- public void updateEnvironment(TransformComponent transformComponent, ComponentAccessor<EntityStore> componentAccessor)
- public int getEnvironmentId()
- public int getWeatherIndex()
- public void setWeatherIndex(PlayerRef playerRef, int weatherIndex)
- @Nonnull @Override public Component<EntityStore> clone()

Complete API:
  public static ComponentType<EntityStore,WeatherTracker> getComponentType()
  public void updateWeather(PlayerRef playerRef, WeatherResource weatherComponent, TransformComponent transformComponent, float transitionSeconds, ComponentAccessor<EntityStore> componentAccessor)
  public void sendWeatherIndex(PlayerRef playerRef, int weatherIndex, float transitionSeconds)
  public boolean consumeFirstSendForWorld()
  public void clear()
  public void updateEnvironment(TransformComponent transformComponent, ComponentAccessor<EntityStore> componentAccessor)
  public int getEnvironmentId()
  public int getWeatherIndex()
  public void setWeatherIndex(PlayerRef playerRef, int weatherIndex)
  public Component<EntityStore> clone()

Fields:
private final UpdateWeather updateWeather
private final Vector3i previousBlockPosition
private int environmentId
private boolean firstSendForWorld
