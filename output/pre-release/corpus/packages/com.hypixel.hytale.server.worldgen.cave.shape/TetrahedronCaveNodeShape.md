# TetrahedronCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class TetrahedronCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape defined as a tetrahedron. Purpose unknown -- inferred from usage context. Extends `AbstractCaveNodeShape` and implements `IWorldBounds` for spatial queries.

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeEnum, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShape, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShape, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShape, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShape, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShape, PipeCaveNodeShapeGenerator, PrefabCaveNodeShape, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShapeGenerator

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
  private static boolean determine(Vector3d o, Vector3d n, double px, double py, double pz)
  private static boolean determine(double ox, double oy, double oz, Vector3d n, double px, double py, double pz)

Fields:
private final Vector3d o
private final Vector3d a
private final Vector3d b
private final Vector3d c
private final Vector3d n1
private final Vector3d n2
private final Vector3d n3
private final Vector3d n4
private final int lowBoundX
private final int lowBoundY
private final int lowBoundZ
private final int highBoundX
private final int highBoundY
private final int highBoundZ
