# BreakpointOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class BreakpointOperation extends SequenceBrushOperation

Pauses brush execution at this point in the sequence. Used for debugging scripted brush operations by allowing the operator to inspect intermediate state.

Also in this package: BlockPatternOperation, ClearOperationMaskOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation, ShapeOperation (and 2 more)

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor executor, ComponentAccessor<EntityStore> componentAccessor)
  private boolean shouldSendToChat(BrushConfigCommandExecutor.DebugOutputTarget target)
  private boolean shouldSendToConsole(BrushConfigCommandExecutor.DebugOutputTarget target)

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<BreakpointOperation> CODEC
private String label
private Boolean printMessage
private Boolean printState
private Boolean enterStepMode
private JumpIfCompareOperation.BrushConfigIntegerComparison condition
