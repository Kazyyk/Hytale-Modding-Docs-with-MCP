---
title: "LayerCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.LayerCommand"
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
public class LayerCommand extends AbstractPlayerCommand
```

Applies layered block patterns to the current selection in a specified direction. Accepts a direction string (up, down, north, south, east, west, or camera) and a list of layer entries, each specifying a thickness and block type.

## Command Registration

- **Name:** `layer`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

direction (String, required), layers (List<Pair<Integer, String>>, required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
