# PipeCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class PipeCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape defined as a tubular pipe along a direction vector with start radius, end radius, and middle radius. Structurally similar to CylinderCaveNodeShape but uses a different collision model that tests the perpendicular distance from the axis without the height-radius-factor scaling in the same manner.

## Constructors


public PipeCaveNodeShape(CaveType caveType, @Nonnull Vector3d o, @Nonnull Vector3d v, double radius1, double radius2, double middleRadius)

## Instance Methods


public double getRadius2()

## Inner Classes

### PipeCaveNodeShapeGenerator


public static class PipeCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory creating `PipeCaveNodeShape` instances from randomized radius, middle radius, and length ranges with optional parent radius inheritance.

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeEnum, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShape, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShape, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShape, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShape, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShapeGenerator, PrefabCaveNodeShape, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShape, TetrahedronCaveNodeShapeGenerator

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
