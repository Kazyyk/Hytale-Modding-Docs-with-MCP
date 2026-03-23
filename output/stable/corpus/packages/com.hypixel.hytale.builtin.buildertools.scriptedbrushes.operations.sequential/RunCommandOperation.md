# RunCommandOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class RunCommandOperation extends SequenceBrushOperation

Executes a server command string in the context of the brush operator. Used to trigger arbitrary server-side actions as part of a scripted brush sequence.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, SetDensity, SetOperation, ShapeOperation (and 2 more)

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<RunCommandOperation> CODEC
private String commandArg
private static final Pattern regexBracketPattern
