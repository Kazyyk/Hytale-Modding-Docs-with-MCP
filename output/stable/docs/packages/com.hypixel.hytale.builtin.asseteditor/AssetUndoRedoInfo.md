---
title: "AssetUndoRedoInfo"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.data"
fqcn: "com.hypixel.hytale.builtin.asseteditor.data.AssetUndoRedoInfo"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "data"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.data`

```java
public class AssetUndoRedoInfo
```

Holds the undo and redo command stacks for a single asset. Each stack is an `ArrayDeque<JsonUpdateCommand>`. Managed by [UndoRedoManager](UndoRedoManager.md).

## Fields

| Field | Type | Description |
|---|---|---|
| `undoStack` | `Deque<JsonUpdateCommand>` | Stack of undoable commands |
| `redoStack` | `Deque<JsonUpdateCommand>` | Stack of redoable commands |
