# LoadIntFromToolArgOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class LoadIntFromToolArgOperation extends SequenceBrushOperation

Loads an integer value from a named tool argument and stores it in the brush config. Used to parameterize subsequent operations with user-specified numeric values.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, ClearRotationOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation (and 3 more)

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<LoadIntFromToolArgOperation> CODEC
public String argNameArg
public LoadIntFromToolArgOperation.TargetField targetFieldArg
public boolean relativeArg
public boolean negateArg
