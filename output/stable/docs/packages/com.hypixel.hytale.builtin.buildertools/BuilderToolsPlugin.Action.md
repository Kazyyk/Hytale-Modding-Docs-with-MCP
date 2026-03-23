---
title: "BuilderToolsPlugin.Action"
kind: "enum"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.Action"
api_surface: false
extends: "java.lang.Enum"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "undo-redo"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public static enum Action
```

Enum of action types used by the undo/redo system in [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md). Each action type identifies the kind of editing operation that was performed, paired with its snapshots in an [ActionEntry](BuilderToolsPlugin.ActionEntry.md).

## Enum Constants

| Constant | Description |
|---|---|
| `EDIT` | A brush tool edit operation. |
| `EDIT_SELECTION` | An edit operation that modified the selection. |
| `EDIT_LINE` | A line drawing operation. |
| `CUT_COPY` | The copy phase of a cut operation. |
| `CUT_REMOVE` | The removal phase of a cut operation. |
| `COPY` | A clipboard copy operation. |
| `PASTE` | A clipboard paste operation. |
| `CLEAR` | A clear/delete operation. |
| `ROTATE` | A clipboard rotation operation. |
| `FLIP` | A clipboard flip/mirror operation. |
| `MOVE` | A move operation. |
| `STACK` | A stack operation. |
| `SET` | A set (fill all blocks) operation. |
| `REPLACE` | A replace operation. |
| `EXTRUDE` | An extrude/extend face operation. |
| `UPDATE_SELECTION` | A selection bounds update. |
| `WALLS` | A walls operation. |
| `HOLLOW` | A hollow operation. |
| `LAYER` | A layer operation. |

## Usage

The `ROTATE` action has special handling during undo/redo: entity refs from the previous rotation are cleaned up before restoring the snapshot. See [ActionEntry.restore()](BuilderToolsPlugin.ActionEntry.md) for details.

## Related Types

- [BuilderToolsPlugin.ActionEntry](BuilderToolsPlugin.ActionEntry.md) -- pairs an action with snapshots
- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- uses these actions in its undo/redo queues
