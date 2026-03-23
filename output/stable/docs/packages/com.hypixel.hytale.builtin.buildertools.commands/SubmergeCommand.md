---
title: "SubmergeCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.SubmergeCommand"
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
public class SubmergeCommand extends AbstractPlayerCommand
```

Submerges the current selection in a specified fluid. Validates that the given block type key is a fluid item via `FluidPatternHelper.isFluidItem()`. Delegates to `BuilderState.set()` with the parsed fluid pattern.

## Command Registration

- **Name:** `submerge`
- **Game Mode:** Creative

## Aliases

`flood`

## Arguments

fluid-item (String/BlockTypeKey, required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
