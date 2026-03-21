---
title: "UndoRedoManager"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor"
fqcn: "com.hypixel.hytale.builtin.asseteditor.UndoRedoManager"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor`

```java
public class UndoRedoManager
```

Manages per-asset undo/redo stacks. Maps [AssetPath](AssetPath.md) keys to [AssetUndoRedoInfo](AssetUndoRedoInfo.md) instances containing the undo and redo command deques.

## Key Methods

| Method | Description |
|---|---|
| `AssetUndoRedoInfo getOrCreateUndoRedoStack(AssetPath)` | Returns existing stack or creates a new one |
| `AssetUndoRedoInfo getUndoRedoStack(AssetPath)` | Returns existing stack or null |
| `void putUndoRedoStack(AssetPath, AssetUndoRedoInfo)` | Replaces the stack for an asset |
| `AssetUndoRedoInfo clearUndoRedoStack(AssetPath)` | Removes and returns the stack for an asset |
