---
title: "RedoCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.RedoCommand"
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
public class RedoCommand extends AbstractPlayerCommand
```

Redoes previously undone edits. Without arguments, redoes 1 step. A variant accepts a count argument. Delegates to `BuilderState.redo()`.

## Command Registration

- **Name:** `redo`
- **Game Mode:** Creative

## Aliases

`r`

## Permission

`hytale.editor.history`

## Arguments

Optional: count (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
