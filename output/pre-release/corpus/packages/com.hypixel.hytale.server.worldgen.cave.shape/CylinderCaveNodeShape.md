# CylinderCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class CylinderCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape defined by a cylindrical volume along a direction vector with start radius, end radius, and a middle radius for interpolation. Block replacement is determined by projecting each point onto the cylinder axis and checking distance against the interpolated radius scaled by the cave type's height radius factor.

## Constructors


public CylinderCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, @Nonnull Vector3d v, double radius1, double radius2, double middleRadius)

## Instance Methods


public double getRadius1()


public double getRadius2()

## Inner Classes

### CylinderCaveNodeShapeGenerator


public static class CylinderCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory that creates `CylinderCaveNodeShape` instances from randomized radius, middle radius, and length ranges. Supports inheriting the start radius from the parent node.

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeEnum, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShape, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShape, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShape, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShape, PipeCaveNodeShapeGenerator, PrefabCaveNodeShape, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShape, TetrahedronCaveNodeShapeGenerator

Complete API:
  public Vector3d getStart()
  public Vector3d getEnd()
  public Vector3d getAnchor(Vector3d vector, double t, double tv, double th)
  public IWorldBounds getBounds()
  public int getLowBoundX()
  public int getLowBoundZ()
  public int getHighBoundX()
  public int getHighBoundZ()
  public int getLowBoundY()
  public int getHighBoundY()
  public double getRadius1()
  public double getRadius2()
  public boolean shouldReplace(int seed, double x, double z, int y)
  private double projectPointOnNode(double px, double py, double pz)
  private double getRadiusAt(double t)
  public double getFloorPosition(int seed, double x, double z)
  public double getCeilingPosition(int seed, double x, double z)
  public String toString()

Fields:
private final CaveType caveType
private final Vector3d o
private final Vector3d v
private final int lowBoundX
private final int lowBoundY
private final int lowBoundZ
private final int highBoundX
private final int highBoundY
private final int highBoundZ
private final double radius1
private final double radius2
private final double middleRadius
