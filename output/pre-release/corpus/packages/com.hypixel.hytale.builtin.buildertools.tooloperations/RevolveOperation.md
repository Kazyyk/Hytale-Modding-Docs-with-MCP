# RevolveOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.tooloperations | Extends: ToolOperation

public class RevolveOperation extends ToolOperation

Builder tool operation that revolves (radially copies) the current selection around a center point. Supports neighbor sampling, reverse sampling, and disabled sampling modes. Can copy both blocks and entities, with configurable copy count, center (player or target), and custom distance.

Also in this package: FloodOperation, LaserPointerOperation, LayersOperation, NoiseOperation, OperationFactory, PaintOperation, Sampling, ScatterOperation, SculptOperation, SmoothOperation, SmootherOperation, TintOperation, ToolOperation

Complete API:
  public void execute(ComponentAccessor<EntityStore> componentAccessor)
  public void executeAt(int posX, int posY, int posZ, ComponentAccessor<EntityStore> componentAccessor)
  private void rotateEntities(ComponentAccessor<EntityStore> componentAccessor, double[] sin, double[] cos, double[] degrees)
  private static int rotateBlock(BlockSelection.BlockHolder blockHolder, double snapped)
  private int checkNeighbours(int[][] offsets, int blockID, int x, int y, int z, boolean fluid)
  private void rotate(Vector3i v, int c, double x, int y, double z, double[] sin, double[] cos)
  private void reverseSample()
  private static double computeRadiusXZ(int xMin, int xMax, int zMin, int zMax, Vector3f hit)
  public boolean execute0(int x, int y, int z)

Fields:
private Vector3f center
private BlockSelection currentSelection
private RevolveOperation.Sampling samplingMode
private int copyCount
private double stepRadians
private double stepDegrees
private int bufferX
private int bufferZ
private Material[][][] materialBuffer
private static final double DISTANCE_TO_NEXT_BLOCK
private static final int REVOLVE_COPY_LIMIT
private static final int MAX_ENTITIES
private static final int MIN_COPY_FULL
private static final int MAX_COPY_FULL
private static final int REVOLVE_DENSITY
private static final int[][] NEIGHBOR_OFFSETS_XZ
