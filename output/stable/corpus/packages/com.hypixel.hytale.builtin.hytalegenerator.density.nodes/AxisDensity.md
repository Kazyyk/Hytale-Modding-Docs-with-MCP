# AxisDensity

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes | Extends: Density

public class AxisDensity extends Density

Computes distance from a given axis with a configurable distance curve.

Also in this package: AbsDensity, AmplitudeConstantDensity, AmplitudeDensity, AnchorDensity, AngleDensity, BaseHeightDensity, Cache, Cache, Cache, CacheDensity, CeilingDensity, CellWallDistanceDensity, ClampDensity, ConstantValueDensity, CubeDensity, CurveMapperDensity, CylinderDensity, DistanceDensity, DistanceToBiomeEdgeDensity, Entry (and 49 more)

Complete API:
  public double process(Density.Context context)
  private double processAnchored(Density.Context context)

Fields:
public static final double ZERO_DELTA
private static final Vector3d ZERO_VECTOR
private final Double2DoubleFunction distanceCurve
private final Vector3d axis
private final boolean isAnchored
private final Vector3d rPosition
private final Vector3d r0
private final Vector3d r1
private final Vector3d r2
private final Vector3d r3
private final Vector3d r4
