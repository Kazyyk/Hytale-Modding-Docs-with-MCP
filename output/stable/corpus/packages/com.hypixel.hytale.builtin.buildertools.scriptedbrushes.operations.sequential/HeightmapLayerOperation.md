# HeightmapLayerOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class HeightmapLayerOperation extends SequenceBrushOperation

Places blocks in vertical layers based on heightmap data within the brush area. Used for terrain painting operations that respect the existing surface contour.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ErodePreset, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation, ShapeOperation (and 2 more)

Complete API:
  public boolean modifyBlocks(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, BrushConfigEditStore edit, int x, int y, int z, ComponentAccessor<EntityStore> componentAccessor)
  private int resolveBlockId(LayerEntryCodec entry, Map<String,Object> toolArgs, BrushConfig brushConfig)
  private Map<String,Object> getToolArgs(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<HeightmapLayerOperation> CODEC
private List<LayerEntryCodec> layerArgs
