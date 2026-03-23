# DistortedShape

Type: interface | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Implements: com.hypixel.hytale.server.worldgen.util.bounds.IWorldBounds

public interface DistortedShape extends IWorldBounds

Interface for distorted cave shapes. Extends `IWorldBounds`. Provides methods for shape projection, validity testing, Y/width/height interpolation, height calculation with distortion, and ceiling/floor computation. Includes a `Factory` interface for creating shapes with configurable dimensions and interpolation.

Known implementors: AbstractDistortedShape

Also in this package: AbstractDistortedBody, AbstractDistortedExtrusion, AbstractDistortedShape, DistortedCylinderShape, DistortedEllipsoidShape, DistortedPipeShape, DistortedShapes, Factory, Factory, Factory, Factory, Factory, ShapeDistortion

Complete API:
  Vector3d getStart()
  Vector3d getEnd()
  Vector3d getAnchor(Vector3d var1, double var2, double var4, double var6)
  double getProjection(double var1, double var3)
  boolean isValidProjection(double var1)
  double getYAt(double var1)
  double getWidthAt(double var1)
  double getHeightAt(double var1)
  double getHeightAtProjection(int var1, double var2, double var4, double var6, double var8, CaveType var10, ShapeDistortion var11)
  default double getCeiling(double x, double z, double centerY, double height)
  default double getFloor(double x, double z, double centerY, double height)
