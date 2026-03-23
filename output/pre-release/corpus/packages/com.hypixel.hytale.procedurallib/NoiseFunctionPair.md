# NoiseFunctionPair

Type: class | Package: com.hypixel.hytale.procedurallib | Implements: NoiseFunction

public class NoiseFunctionPair implements NoiseFunction

Utility type in the `procedurallib` subsystem.

## Accessors

- getNoiseFunction2d() | NoiseFunction2d | Accessor method.
- setNoiseFunction2d(NoiseFunction2d noiseFunction2d) | void | Mutator method.
- getNoiseFunction3d() | NoiseFunction3d | Accessor method.
- setNoiseFunction3d(NoiseFunction3d noiseFunction3d) | void | Mutator method.
- get(int seed, int offsetSeed, double x, double y) | double | Accessor method.
- get(int seed, int offsetSeed, double x, double y, double z) | double | Accessor method.

Also in this package: NoiseFunction, NoiseFunction2d, NoiseFunction3d, NoiseType

Complete API:
  public NoiseFunction2d getNoiseFunction2d()
  public void setNoiseFunction2d(NoiseFunction2d noiseFunction2d)
  public NoiseFunction3d getNoiseFunction3d()
  public void setNoiseFunction3d(NoiseFunction3d noiseFunction3d)
  public double get(int seed, int offsetSeed, double x, double y)
  public double get(int seed, int offsetSeed, double x, double y, double z)
  public String toString()

Fields:
protected NoiseFunction2d noiseFunction2d
protected NoiseFunction3d noiseFunction3d
