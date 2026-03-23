---
title: "SetCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.SetCommand"
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
public class SetCommand extends AbstractPlayerCommand
```

Sets all blocks in the current selection to the specified block pattern. Delegates to `BuilderState.set()`.

## Command Registration

- **Name:** `setBlocks`
- **Game Mode:** Creative

## Aliases

`set`

## Permission

`hytale.editor.selection.modify`

## Arguments

pattern (BlockPattern, required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
