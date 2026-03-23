---
title: "SetToolHistorySizeCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.SetToolHistorySizeCommand"
api_surface: false
extends: "CommandBase"
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
public class SetToolHistorySizeCommand extends CommandBase
```

Changes the maximum undo/redo history size for the builder tools plugin. Validates the history length to the range 10-250. Executes synchronously (not queued).

## Command Registration

- **Name:** `setToolHistorySize`
- **Game Mode:** Creative

## Arguments

historyLength (Integer, 10-250, required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
