# AssetUndoRedoInfo

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.data

public class AssetUndoRedoInfo

Holds the undo and redo command stacks for a single asset. Each stack is an `ArrayDeque<JsonUpdateCommand>`. Managed by UndoRedoManager.

## Fields

- undoStack | Deque<JsonUpdateCommand> | Stack of undoable commands
- redoStack | Deque<JsonUpdateCommand> | Stack of redoable commands
