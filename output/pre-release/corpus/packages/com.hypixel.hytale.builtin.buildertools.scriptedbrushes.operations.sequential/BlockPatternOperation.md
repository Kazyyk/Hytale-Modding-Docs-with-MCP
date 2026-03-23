# BlockPatternOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class BlockPatternOperation extends SequenceBrushOperation

Change the material of the brush to a pattern of blocks. Reads a `BlockPattern` from the tool argument and applies it to the brush config.

Also in this package: BreakpointOperation, ClearOperationMaskOperation, ClearRotationOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation (and 3 more)

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<BlockPatternOperation> CODEC
public BlockPattern blockPatternArg
