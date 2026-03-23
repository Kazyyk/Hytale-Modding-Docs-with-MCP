# TintOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.tooloperations | Extends: ToolOperation

public class TintOperation extends ToolOperation

A builder tool operation that applies modifications to terrain.

## Methods

- super(ref, packet, componentAccessor)
- @Override public void execute(ComponentAccessor<EntityStore> componentAccessor)
- @Override public void executeAt(int posX, int posY, int posZ, ComponentAccessor<EntityStore> componentAccessor)
- @Override boolean execute0(int x, int y, int z)

Also in this package: FloodOperation, LaserPointerOperation, LayersOperation, NoiseOperation, OperationFactory, PaintOperation, ScatterOperation, SculptOperation, SmoothOperation, SmootherOperation, ToolOperation

Complete API:
  public void execute(ComponentAccessor<EntityStore> componentAccessor)
  public void executeAt(int posX, int posY, int posZ, ComponentAccessor<EntityStore> componentAccessor)
  boolean execute0(int x, int y, int z)

Fields:
private final int tintColor
