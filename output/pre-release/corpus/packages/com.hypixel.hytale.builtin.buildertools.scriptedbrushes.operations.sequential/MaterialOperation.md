# MaterialOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class MaterialOperation extends SequenceBrushOperation

Sets the brush material to a fixed block type key. Unlike `BlockPatternOperation` which supports weighted random patterns, this sets a single deterministic material.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, ClearRotationOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation (and 3 more)

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<MaterialOperation> CODEC
public String blockTypeArg
