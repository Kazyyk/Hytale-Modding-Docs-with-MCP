# LayerOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class LayerOperation extends SequenceBrushOperation

Places blocks in horizontal layers within the brush area. Each layer can have a different block pattern and thickness. Used for creating stratified terrain features.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, ClearRotationOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, HeightmapLayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation (and 3 more)

Complete API:
  public boolean modifyBlocks(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, BrushConfigEditStore edit, int x, int y, int z, ComponentAccessor<EntityStore> componentAccessor)
  private String resolveBlockPattern(LayerEntryCodec entry, Map<String,Object> toolArgs, BrushConfig brushConfig)
  private Map<String,Object> getToolArgs(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<LayerOperation> CODEC
private List<LayerEntryCodec> layerArgs
