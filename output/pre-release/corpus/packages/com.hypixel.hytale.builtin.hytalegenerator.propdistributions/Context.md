# PropDistribution.Context

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: java.lang.Object

public static class Context

Mutable context object for prop distribution. Carries bounds, a two-argument pipe (position + prop), and distance-from-biome-edge information.

Also in this package: AssignedPropDistribution, ConstantPropDistribution, NoPropDistribution, PositionsPropDistribution, PropDistribution, UnionPropDistribution

Complete API:
  public void assign(PropDistribution.Context context)

Fields:
public Bounds3d bounds
public Pipe.Two<Vector3d,Prop> pipe
public double distanceFromBiomeEdge
