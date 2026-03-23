# ShapeDistortion

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: null

public class ShapeDistortion

## Fields

- private static final NoiseProperty DEFAULT_NOISE
- public static final ShapeDistortion DEFAULT
- private final NoiseProperty widthNoise
- private final NoiseProperty floorNoise
- private final NoiseProperty ceilingNoise

## Constructors

- public ShapeDistortion(NoiseProperty widthNoise, NoiseProperty floorNoise, NoiseProperty ceilingNoise)

## Methods

- public double getWidthFactor(int seed, double x, double z)
- public double getFloorFactor(int seed, double x, double z)
- public double getCeilingFactor(int seed, double x, double z)
- public static ShapeDistortion of(@Nullable NoiseProperty widthNoise, @Nullable NoiseProperty floorNoise, @Nullable NoiseProperty ceilingNoise)

Also in this package: AbstractDistortedBody, AbstractDistortedExtrusion, AbstractDistortedShape, DistortedCylinderShape, DistortedEllipsoidShape, DistortedPipeShape, DistortedShape, DistortedShapes, Factory, Factory, Factory, Factory, Factory

Complete API:
  public double getWidthFactor(int seed, double x, double z)
  public double getFloorFactor(int seed, double x, double z)
  public double getCeilingFactor(int seed, double x, double z)
  public static ShapeDistortion of(NoiseProperty widthNoise, NoiseProperty floorNoise, NoiseProperty ceilingNoise)

Fields:
private static final NoiseProperty DEFAULT_NOISE
public static final ShapeDistortion DEFAULT
private final NoiseProperty widthNoise
private final NoiseProperty floorNoise
private final NoiseProperty ceilingNoise
