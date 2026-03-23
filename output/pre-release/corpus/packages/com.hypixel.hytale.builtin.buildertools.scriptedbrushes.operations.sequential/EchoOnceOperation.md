# EchoOnceOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class EchoOnceOperation extends SequenceBrushOperation

Sends a text message to the brush operator exactly once per brush activation. Subsequent strokes in the same activation are suppressed. Used for one-time notifications in scripted brush sequences.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, ClearRotationOperation, DeleteOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation (and 3 more)

Complete API:
  public void resetInternalState()
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<EchoOnceOperation> CODEC
private String messageArg
private boolean hasBeenExecuted
