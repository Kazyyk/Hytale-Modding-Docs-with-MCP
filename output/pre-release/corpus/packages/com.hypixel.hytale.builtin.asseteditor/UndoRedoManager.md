# UndoRedoManager

Type: class | Package: com.hypixel.hytale.builtin.asseteditor

public class UndoRedoManager

Manages per-asset undo/redo stacks. Maps AssetPath keys to AssetUndoRedoInfo instances containing the undo and redo command deques.

## Key Methods

- AssetUndoRedoInfo getOrCreateUndoRedoStack(AssetPath) | Returns existing stack or creates a new one
- AssetUndoRedoInfo getUndoRedoStack(AssetPath) | Returns existing stack or null
- void putUndoRedoStack(AssetPath, AssetUndoRedoInfo) | Replaces the stack for an asset
- AssetUndoRedoInfo clearUndoRedoStack(AssetPath) | Removes and returns the stack for an asset

Also in this package: AssetEditorGamePacketHandler, AssetEditorPacketHandler, AssetEditorPlugin, AssetPath, AssetSpecificFunctionality, AssetToDiscard, AssetTree, AssetTypeRegistry, DiscardResult, EditorClient, InitState, Messages, PlayerPreviewData

Complete API:
  public AssetUndoRedoInfo getOrCreateUndoRedoStack(AssetPath path)
  public AssetUndoRedoInfo getUndoRedoStack(AssetPath path)
  public void putUndoRedoStack(AssetPath path, AssetUndoRedoInfo undoRedoInfo)
  public AssetUndoRedoInfo clearUndoRedoStack(AssetPath path)

Fields:
private final Map<AssetPath,AssetUndoRedoInfo> assetUndoRedoInfo
