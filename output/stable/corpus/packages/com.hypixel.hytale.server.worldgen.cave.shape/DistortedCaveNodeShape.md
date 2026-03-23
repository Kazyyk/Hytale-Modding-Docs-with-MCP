# DistortedCaveNodeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape | Implements: CaveNodeShape

public class DistortedCaveNodeShape implements CaveNodeShape

Cave node shape that wraps a `DistortedShape` with a `ShapeDistortion` to produce noise-modulated cave profiles. The distortion independently scales the floor and ceiling heights, creating organic, non-uniform cave cross-sections. Provides its own `populateChunk` implementation that pre-computes floor and ceiling per-column for efficiency.

## Constructors


public DistortedCaveNodeShape(CaveType caveType, DistortedShape shape, ShapeDistortion distortion)

## Instance Methods


public DistortedShape getShape()

## Inner Classes

### DistortedCaveNodeShapeGenerator


public static class DistortedCaveNodeShapeGenerator implements CaveNodeShapeEnum.CaveNodeShapeGenerator

Factory creating `DistortedCaveNodeShape` instances with configurable width, height, mid-width, mid-height, and length ranges plus a noise distortion profile. Supports parent radius inheritance and custom interpolation functions.

Also in this package: AbstractCaveNodeShape, CaveNodeShape, CaveNodeShapeEnum, CaveNodeShapeGenerator, CaveNodeShapeUtils, CylinderCaveNodeShape, CylinderCaveNodeShapeGenerator, DistortedCaveNodeShapeGenerator, EllipsoidCaveNodeShape, EllipsoidCaveNodeShapeGenerator, EmptyLineCaveNodeShape, EmptyLineCaveNodeShapeGenerator, PipeCaveNodeShape, PipeCaveNodeShapeGenerator, PrefabCaveNodeShape, PrefabCaveNodeShapeGenerator, TetrahedronCaveNodeShape, TetrahedronCaveNodeShapeGenerator

Complete API:
  public DistortedShape getShape()
  public Vector3d getStart()
  public Vector3d getEnd()
  public Vector3d getAnchor(Vector3d vector, double tx, double ty, double tz)
  public IWorldBounds getBounds()
  public boolean hasGeometry()
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
