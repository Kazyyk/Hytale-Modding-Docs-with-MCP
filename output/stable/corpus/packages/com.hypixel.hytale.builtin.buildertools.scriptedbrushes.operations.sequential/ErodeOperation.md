# ErodeOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential | Extends: SequenceBrushOperation

public class ErodeOperation extends SequenceBrushOperation

Applies an erosion pass to the brush area. Removes blocks that have fewer solid neighbors than the configured threshold, simulating natural weathering. Supports configurable iteration count and neighbor threshold.

Also in this package: BlockPatternOperation, BreakpointOperation, ClearOperationMaskOperation, DeleteOperation, EchoOnceOperation, EchoOperation, ErodePreset, HeightmapLayerOperation, LayerOperation, LiftOperation, LoadIntFromToolArgOperation, LoadMaterialFromToolArgOperation, MaterialOperation, MeltOperation, PastePrefabOperation, ReplaceOperation, RunCommandOperation, SetDensity, SetOperation, ShapeOperation (and 2 more)

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)
  public boolean modifyBlocks(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, BrushConfigEditStore edit, int x, int y, int z, ComponentAccessor<EntityStore> componentAccessor)
  public void beginIterationIndex(int iterationIndex)
  public int getNumModifyBlockIterations()
  private void iterateFill(BrushConfigEditStore edit, int x, int y, int z)
  private void iterateErosion(BrushConfigEditStore edit, int x, int y, int z)

Fields:
public static final BuilderCodec<ErodeOperation> CODEC
private ErodeOperation.ErodePreset erodePresetArg
private static final Vector3i[] FACES_TO_CHECK
int iterationIndex
