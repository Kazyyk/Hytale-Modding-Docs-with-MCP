# SequenceBrushOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system | Extends: BrushOperation

public abstract class SequenceBrushOperation extends BrushOperation

## Fields

- private final boolean doesOperateOnBlocks

## Constructors

- public SequenceBrushOperation(String name, String description, boolean doesOperateOnBlocks)

## Methods

- public boolean modifyBlocks(Ref<EntityStore> ref,
        BrushConfig brushConfig,
        BrushConfigCommandExecutor brushConfigCommandExecutor,
        BrushConfigEditStore edit,
        int x,
        int y,
        int z,
        ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `beginIterationIndex(int iterationIndex)` |
| `public` | `int` | `getNumModifyBlockIterations()` |
| `public` | `boolean` | `doesOperateOnBlocks()` |

Known subclasses: AppendMaskFromToolArgOperation, AppendMaskOperation, BlockPatternOperation, BreakpointOperation, CircleOffsetAndLoopOperation, CircleOffsetFromArgOperation, ClearOperationMaskOperation, ClearRotationOperation, DeleteOperation, DimensionsOperation, EchoOnceOperation, EchoOperation, ErodeOperation, ExitOperation, HeightmapLayerOperation, HistoryMaskOperation, JumpIfBlockTypeOperation, JumpIfClickType, JumpIfCompareOperation, JumpIfStringMatchOperation, JumpIfToolArgOperation, JumpToIndexOperation, JumpToRandomIndex, LayerOperation, LiftOperation, LoadBrushConfigOperation, LoadIntFromToolArgOperation, LoadLoopFromToolArgOperation, LoadMaterialFromToolArgOperation, LoadOperationsFromAssetOperation, LoopOperation, LoopRandomOperation, MaskOperation, MaterialOperation, MeltOperation, OffsetOperation, PastePrefabOperation, PersistentDataOperation, RandomOffsetOperation, RandomizeDimensionsOperation, ReplaceOperation, RotateOperation, RunCommandOperation, SaveBrushConfigOperation, SaveIndexOperation, SetDensity, SetOperation, ShapeOperation, SmoothOperation, UseBrushMaskOperation, UseOperationMaskOperation

Also in this package: BrushOperation, BrushOperationSetting, GlobalBrushOperation

Complete API:
  public boolean modifyBlocks(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, BrushConfigEditStore edit, int x, int y, int z, ComponentAccessor<EntityStore> componentAccessor)
  public void beginIterationIndex(int iterationIndex)
  public int getNumModifyBlockIterations()
  public boolean doesOperateOnBlocks()

Fields:
private final boolean doesOperateOnBlocks
