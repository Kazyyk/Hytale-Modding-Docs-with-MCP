# EmptyLineCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class EmptyLineCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Invisible cave node shape that defines a line segment without carving any blocks. Used as a connector between cave nodes to provide anchor points for child node attachment. `shouldReplace` always returns false; `hasGeometry` returns false. All bounds return 0.

## Constructors


public EmptyLineCaveNodeShape(Vector3d o, Vector3d v)

## Inner Classes

### EmptyLineCaveNodeShapeGenerator


public static class EmptyLineCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory creating `EmptyLineCaveNodeShape` instances from a randomized length range.

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeEnum, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShape, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShape, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShape, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShape, PipeCaveNodeShapeGenerator, PrefabCaveNodeShape, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShape, TetrahedronCaveNodeShapeGenerator

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
  public boolean shouldReplace(int seed, double x, double z, int y)
  public double getFloorPosition(int seed, double x, double z)
  public double getCeilingPosition(int seed, double x, double z)
  public boolean hasGeometry()
  public String toString()

Fields:
private final Vector3d o
private final Vector3d v
