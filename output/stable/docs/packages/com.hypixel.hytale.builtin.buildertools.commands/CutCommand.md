---
title: "CutCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.CutCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "command"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.commands`

```java
public class CutCommand extends AbstractPlayerCommand
```

Cuts the current selection to the clipboard (copy then clear original). Uses settings bitflag `2` (cut flag) in addition to the same flags as CopyCommand. Supports an alternative coordinate-based variant.

## Command Registration

- **Name:** `cut`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

Flags: noEntities, onlyEntities, empty, keepanchors. Variant: xMin, yMin, zMin, xMax, yMax, zMax (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
