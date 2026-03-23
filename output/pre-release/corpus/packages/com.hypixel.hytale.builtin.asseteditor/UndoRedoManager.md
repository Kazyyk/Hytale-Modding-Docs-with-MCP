# UndoRedoManager

Type: class | Package: com.hypixel.hytale.builtin.asseteditor

public class UndoRedoManager

Manages per-asset undo/redo stacks. Maps AssetPath keys to AssetUndoRedoInfo instances containing the undo and redo command deques.

## Key Methods

- AssetUndoRedoInfo getOrCreateUndoRedoStack(AssetPath) | Returns existing stack or creates a new one
- AssetUndoRedoInfo getUndoRedoStack(AssetPath) | Returns existing stack or null
- void putUndoRedoStack(AssetPath, AssetUndoRedoInfo) | Replaces the stack for an asset
- AssetUndoRedoInfo clearUndoRedoStack(AssetPath) | Removes and returns the stack for an asset
