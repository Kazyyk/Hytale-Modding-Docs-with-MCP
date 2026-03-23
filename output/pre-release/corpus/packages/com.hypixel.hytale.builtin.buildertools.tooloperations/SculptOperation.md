# SculptOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.tooloperations | Extends: ToolOperation

public class SculptOperation extends ToolOperation

A builder tool operation that applies modifications to terrain.

## Fields

- private LongOpenHashSet packedPlacedBlockPositions

## Methods

- super(ref, packet, componentAccessor)
- @Override boolean execute0(int x, int y, int z)

Also in this package: FloodOperation, LaserPointerOperation, LayersOperation, NoiseOperation, OperationFactory, PaintOperation, RevolveOperation, Sampling, ScatterOperation, SmoothOperation, SmootherOperation, TintOperation, ToolOperation

Complete API:
  boolean execute0(int x, int y, int z)

Fields:
private final int smoothVolume
private final int smoothRadius
private final boolean isAltPlaySculptBrushModDown
private LongOpenHashSet packedPlacedBlockPositions
