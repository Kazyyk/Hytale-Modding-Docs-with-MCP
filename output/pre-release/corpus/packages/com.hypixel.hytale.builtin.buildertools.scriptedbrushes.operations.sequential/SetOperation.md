# SetOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class SetOperation extends SequenceBrushOperation

Sets all blocks within the brush area to the current brush material. The most basic placement operation -- fills the entire selection with the configured pattern.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, ClearRotationOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity (and 3 more)

Complete API:
  public boolean modifyBlocks(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, BrushConfigEditStore edit, int x, int y, int z, ComponentAccessor<EntityStore> componentAccessor)
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<SetOperation> CODEC
