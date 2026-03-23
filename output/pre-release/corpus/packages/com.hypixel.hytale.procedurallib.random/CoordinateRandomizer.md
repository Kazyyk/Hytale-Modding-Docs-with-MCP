# CoordinateRandomizer

Type: class | Package: com.hypixel.hytale.procedurallib.random | Implements: ICoordinateRandomizer

public class CoordinateRandomizer implements ICoordinateRandomizer

Implements `ICoordinateRandomizer` to provide CoordinateRandomizer functionality.

## Constants

- public static final ICoordinateRandomizer EMPTY_RANDOMIZER

## Fields

- protected final CoordinateRandomizer.AmplitudeNoiseProperty[] xNoise
- protected final CoordinateRandomizer.AmplitudeNoiseProperty[] yNoise
- protected final CoordinateRandomizer.AmplitudeNoiseProperty[] zNoise

## Methods

- public CoordinateRandomizer(CoordinateRandomizer.AmplitudeNoiseProperty[] xNoise,
        CoordinateRandomizer.AmplitudeNoiseProperty[] yNoise,
        CoordinateRandomizer.AmplitudeNoiseProperty[] zNoise)` |
| `public` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `getXNoise()` |
| `public` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `getYNoise()` |
| `public` | `CoordinateRandomizer.AmplitudeNoiseProperty[]` | `getZNoise()` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y)` |
| `@Override public` | `double` | `randomDoubleX(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleY(int seed, double x, double y, double z)` |
| `@Override public` | `double` | `randomDoubleZ(int seed, double x, double y, double z)` |
| `@Nonnull @Override public` | `String` | `toString()` |

Also in this package: AmplitudeNoiseProperty, CoordinateOriginRotator, CoordinateRotator, EmptyCoordinateRandomizer, ICoordinateRandomizer, RotatedCoordinateRandomizer

Complete API:
  public CoordinateRandomizer.AmplitudeNoiseProperty[] getXNoise()
  public CoordinateRandomizer.AmplitudeNoiseProperty[] getYNoise()
  public CoordinateRandomizer.AmplitudeNoiseProperty[] getZNoise()
  public double randomDoubleX(int seed, double x, double y)
  public double randomDoubleY(int seed, double x, double y)
  public double randomDoubleX(int seed, double x, double y, double z)
  public double randomDoubleY(int seed, double x, double y, double z)
  public double randomDoubleZ(int seed, double x, double y, double z)
  public String toString()

Fields:
public static final ICoordinateRandomizer EMPTY_RANDOMIZER
protected final CoordinateRandomizer.AmplitudeNoiseProperty[] xNoise
protected final CoordinateRandomizer.AmplitudeNoiseProperty[] yNoise
protected final CoordinateRandomizer.AmplitudeNoiseProperty[] zNoise
