# ClearOperationMaskOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class ClearOperationMaskOperation extends SequenceBrushOperation

Clears any active operation mask from the brush config, removing all block filtering constraints for subsequent operations.

Also in this package: BlockPatternOperation, BreakpointOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation, ShapeOperation (and 2 more)

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<ClearOperationMaskOperation> CODEC
