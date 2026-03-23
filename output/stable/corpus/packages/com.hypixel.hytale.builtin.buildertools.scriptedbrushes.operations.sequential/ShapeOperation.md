# ShapeOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class ShapeOperation extends SequenceBrushOperation

Constrains the brush's affected area to a geometric shape (sphere, cylinder, cube, etc.). Subsequent operations only affect blocks within the shape boundary.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation (and 2 more)

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<ShapeOperation> CODEC
public BrushShape brushShapeArg
