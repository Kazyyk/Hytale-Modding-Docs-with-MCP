# ReturnType

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes

public abstract class ReturnType

Abstract base class providing shared logic for ReturnType implementations.

## Fields

- protected double maxDistance

## Methods

- public abstract double get(double var1, double var3, @Nonnull Vector3d var5, @Nullable Vector3d var6, @Nullable Vector3d var7, @Nullable Density.Context var8)
- public void setMaxDistance(double maxDistance)

Known subclasses: CellValueReturnType, CurveReturnType, DensityReturnType, Distance2AddReturnType, Distance2DivReturnType, Distance2MulReturnType, Distance2ReturnType, Distance2SubReturnType, DistanceReturnType

Also in this package: CellValueReturnType, CurveReturnType, DensityReturnType, Distance2AddReturnType, Distance2DivReturnType, Distance2MulReturnType, Distance2ReturnType, Distance2SubReturnType, DistanceReturnType, Entry, Vector3dComparator

Complete API:
  public abstract double get(double var1, double var3, Vector3d var5, Vector3d var6, Vector3d var7, Density.Context var8)
  public void setMaxDistance(double maxDistance)

Fields:
protected double maxDistance
