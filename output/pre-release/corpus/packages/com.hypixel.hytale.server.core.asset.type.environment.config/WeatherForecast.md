# WeatherForecast

Type: class | Package: com.hypixel.hytale.server.core.asset.type.environment.config | Implements: IWeightedElement

public class WeatherForecast implements IWeightedElement

Implementation of `IWeightedElement`.

## Fields

- EMPTY_ARRAY | WeatherForecast[] | Static final WeatherForecast[] field.
- weatherId | String | String field.
- weatherIndex | int | int field.
- weight | double | double field.

## Constructors

- WeatherForecast(String weatherId, double weight) | Creates a new WeatherForecast instance.
- WeatherForecast() | Creates a new WeatherForecast instance.

## Methods

- getWeatherId() | String | public method.
- getWeatherIndex() | int | public method.
- processConfig() | void | protected method.
- toString() | String | public method.
- getWeight() | double | public method.

Also in this package: Environment

Complete API:
  public String getWeatherId()
  public int getWeatherIndex()
  protected void processConfig()
  public String toString()
  public double getWeight()

Fields:
public static final BuilderCodec<WeatherForecast> CODEC
public static final WeatherForecast[] EMPTY_ARRAY
protected String weatherId
protected transient int weatherIndex
protected double weight
