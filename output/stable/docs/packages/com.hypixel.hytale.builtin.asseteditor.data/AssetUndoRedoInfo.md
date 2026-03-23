---
title: "AssetUndoRedoInfo"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.data"
fqcn: "com.hypixel.hytale.builtin.asseteditor.data.AssetUndoRedoInfo"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "data"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.data`

```java
public class AssetUndoRedoInfo
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public final` | `Deque<JsonUpdateCommand>` | `undoStack` |
| `public final` | `Deque<JsonUpdateCommand>` | `redoStack` |
