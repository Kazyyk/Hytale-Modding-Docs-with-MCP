# TintOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.tooloperations | Extends: ToolOperation

public class TintOperation extends ToolOperation

A builder tool operation that applies modifications to terrain.

## Methods

- super(ref, packet, componentAccessor)
- @Override public void execute(ComponentAccessor<EntityStore> componentAccessor)
- @Override public void executeAt(int posX, int posY, int posZ, ComponentAccessor<EntityStore> componentAccessor)
- @Override boolean execute0(int x, int y, int z)

Also in this package: FloodOperation, LaserPointerOperation, LayersOperation, NoiseOperation, OperationFactory, PaintOperation, RevolveOperation, Sampling, ScatterOperation, SculptOperation, SmoothOperation, SmootherOperation, ToolOperation

Complete API:
  boolean execute0(int x, int y, int z)
  private int sampleKernelBlend(int x, int z)

Fields:
private int tintColor
private double opacity
private boolean blendMode
private int bufferOriginX
private int bufferOriginZ
private int[][] colorBuffer
private final boolean isHoldingAltModeDown
private LongOpenHashSet packedPlacedTinsPositions
private static final int SAMPLE_DISTANCE
