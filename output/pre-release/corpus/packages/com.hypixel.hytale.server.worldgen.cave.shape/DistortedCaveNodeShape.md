# DistortedCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Implements: com.hypixel.hytale.server.worldgen.cave.shape.CaveNodeShape

public class DistortedCaveNodeShape implements CaveNodeShape

Implements `CaveNodeShape` using a `DistortedShape` and `ShapeDistortion`. Determines whether blocks should be replaced based on shape projection, height distortion, floor/ceiling calculations. Populates chunks by carving blocks, applying fillings, and placing cover entries.

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeEnum, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShape, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShape, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShape, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShape, PipeCaveNodeShapeGenerator, PrefabCaveNodeShape, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShape, TetrahedronCaveNodeShapeGenerator

Complete API:
  public DistortedShape getShape()
  public Vector3d getStart()
  public Vector3d getEnd()
  public Vector3d getAnchor(Vector3d vector, double tx, double ty, double tz)
  public IWorldBounds getBounds()
  public boolean shouldReplace(int seed, double x, double z, int y)
  public double getFloorPosition(int seed, double x, double z)
  public double getCeilingPosition(int seed, double x, double z)
  public void populateChunk(int seed, ChunkGeneratorExecution execution, Cave cave, CaveNode node, Random random)
  private int getFloor(int seed, double x, double z, double centerY, double height, int minY)
  private int getCeiling(int seed, double x, double z, double centerY, double height, int maxY)

Fields:
private final CaveType caveType
private final DistortedShape shape
private final ShapeDistortion distortion
