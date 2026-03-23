# EllipsoidCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class EllipsoidCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape defined as an axis-aligned ellipsoid centered at an origin point with independent X, Y, and Z radii. Block replacement tests use the standard ellipsoid equation scaled by the cave type's height radius factor.

## Constructors


public EllipsoidCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, double rx, double ry, double rz)

## Inner Classes

### EllipsoidCaveNodeShapeGenerator


public static class EllipsoidCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory creating `EllipsoidCaveNodeShape` instances from randomized X, Y, and Z radius ranges.

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeEnum, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShape, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShape, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShape, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShape, PipeCaveNodeShapeGenerator, PrefabCaveNodeShape, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShape, TetrahedronCaveNodeShapeGenerator

Complete API:
  public Vector3d getStart()
  public Vector3d getEnd()
  public Vector3d getAnchor(Vector3d vector, double tx, double ty, double tz)
  public IWorldBounds getBounds()
  public int getLowBoundX()
  public int getLowBoundZ()
  public int getHighBoundX()
  public int getHighBoundZ()
  public int getLowBoundY()
  public int getHighBoundY()
  public boolean shouldReplace(int seed, double x, double z, int y)
  public double getFloorPosition(int seed, double x, double z)
  public double getCeilingPosition(int seed, double x, double z)
  public String toString()

Fields:
private final CaveType caveType
private final Vector3d o
private final double rx
private final double ry
private final double rz
private final int lowBoundX
private final int lowBoundY
private final int lowBoundZ
private final int highBoundX
private final int highBoundY
private final int highBoundZ
