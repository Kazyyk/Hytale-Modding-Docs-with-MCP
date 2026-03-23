---
title: "Pos2Command"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.Pos2Command"
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
public class Pos2Command extends AbstractPlayerCommand
```

Sets selection position 2. When x/y/z arguments are provided, uses those coordinates; otherwise uses the player's current block position.

## Command Registration

- **Name:** `pos2`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.use`

## Arguments

x (Integer, optional), y (Integer, optional), z (Integer, optional)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
