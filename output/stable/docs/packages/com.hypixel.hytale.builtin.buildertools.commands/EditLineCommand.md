---
title: "EditLineCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.EditLineCommand"
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
public class EditLineCommand extends AbstractPlayerCommand
```

Draws a line of blocks between two points with configurable brush parameters. Start and end positions are relative to the player. Supports material pattern, width, height, wall thickness, brush shape, brush origin, spacing, and density arguments.

## Command Registration

- **Name:** `editline`
- **Game Mode:** Creative

## Arguments

start (RelativeVector3i), end (RelativeVector3i), material (String), width (Integer, default 1), height (Integer, default 1), wallThickness (Integer, default 0), shape (String, default Cube), origin (String, default Center), spacing (Integer, default 1), density (Integer, default 100)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
