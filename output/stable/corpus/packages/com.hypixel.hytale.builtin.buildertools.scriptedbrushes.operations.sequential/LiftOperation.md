# LiftOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class LiftOperation extends SequenceBrushOperation

Shifts the brush's vertical offset by a configurable amount. Moves subsequent operations up or down without changing the brush's XZ position.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation, ShapeOperation (and 2 more)

Complete API:
  public boolean modifyBlocks(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, BrushConfigEditStore edit, int x, int y, int z, ComponentAccessor<EntityStore> componentAccessor)
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<LiftOperation> CODEC
