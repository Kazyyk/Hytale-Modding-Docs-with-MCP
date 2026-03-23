# LayersOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.tooloperations | Extends: ToolOperation

public class LayersOperation extends ToolOperation

A builder tool operation that applies modifications to terrain.

## Fields

- private boolean failed
- private List<Pair<Integer, String>> layers

## Methods

- super(ref, packet, componentAccessor)
- @Override boolean execute0(int x, int y, int z)

Also in this package: FloodOperation, LaserPointerOperation, NoiseOperation, OperationFactory, PaintOperation, ScatterOperation, SculptOperation, SmoothOperation, SmootherOperation, TintOperation, ToolOperation

Complete API:
  boolean execute0(int x, int y, int z)

Fields:
private final Vector3i depthDirection
private final int layerOneLength
private final int layerTwoLength
private final boolean enableLayerTwo
private final int layerThreeLength
private final boolean enableLayerThree
private final String layerOneBlockPattern
private final String layerTwoBlockPattern
private final String layerThreeBlockPattern
private final int brushDensity
private final int maxDepthNecessary
private boolean failed
private final boolean skipLayerOne
private final boolean skipLayerTwo
private final boolean skipLayerThree
private List<Pair<Integer,String>> layers
