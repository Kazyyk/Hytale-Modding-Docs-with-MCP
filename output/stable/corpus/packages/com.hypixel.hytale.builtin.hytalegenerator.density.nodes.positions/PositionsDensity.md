# PositionsDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions | Extends: Density

public class PositionsDensity extends Density

## Fields

- private final PositionProvider positionProvider
- private final double maxDistance
- private final double maxDistanceRaw
- private final ReturnType returnType
- private final DistanceFunction distanceFunction
- private final Vector3d rMin
- private final Vector3d rMax
- private final Vector3d rClosestPoint
- private final Vector3d rPreviousClosestPoint
- private final Vector3d rLocalPoint
- private final double[] rDistance
- private final boolean[] rHasClosestPoint

## Methods

- @Nonnull public static Double2DoubleFunction cellNoiseDistanceFunction(double maxDistance)
- @Override public double process(Density.Context context)

Complete API:
  public static Double2DoubleFunction cellNoiseDistanceFunction(double maxDistance)
  public double process(Density.Context context)

Fields:
private final PositionProvider positionProvider
private final double maxDistance
private final double maxDistanceRaw
private final ReturnType returnType
private final DistanceFunction distanceFunction
private final Vector3d rMin
private final Vector3d rMax
private final Vector3d rClosestPoint
private final Vector3d rPreviousClosestPoint
private final Vector3d rLocalPoint
private final double[] rDistance
private final boolean[] rHasClosestPoint
