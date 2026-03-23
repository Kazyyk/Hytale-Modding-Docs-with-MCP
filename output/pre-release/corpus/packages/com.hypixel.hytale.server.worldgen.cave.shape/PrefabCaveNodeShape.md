# PrefabCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Extends: AbstractCaveNodeShape | Implements: IWorldBounds

public class PrefabCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds

Cave node shape backed by a prefab structure. The prefab's bounding box defines the shape volume, and its rotation determines the orientation. Provides `getPrefabRotation()` for child nodes to inherit the parent's rotation when computing offsets.

## Instance Methods


public PrefabRotation getPrefabRotation()

Returns the rotation applied to this prefab shape.

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeEnum, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShape, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShape, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShape, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShape, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShape, PipeCaveNodeShapeGenerator, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShape, TetrahedronCaveNodeShapeGenerator

Complete API:
  public CaveType getCaveType()
  public PrefabRotation getPrefabRotation()
  public Vector3d getO()
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
  public void populateChunk(int seed, ChunkGeneratorExecution execution, Cave cave, CaveNode node, Random random)
  public String toString()

Fields:
private final CaveType caveType
private final Vector3d o
private final Vector3d e
private final WorldGenPrefabSupplier prefabSupplier
private final PrefabRotation rotation
private final BlockMaskCondition configuration
private final int lowBoundX
private final int lowBoundY
private final int lowBoundZ
private final int highBoundX
private final int highBoundY
private final int highBoundZ
