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
