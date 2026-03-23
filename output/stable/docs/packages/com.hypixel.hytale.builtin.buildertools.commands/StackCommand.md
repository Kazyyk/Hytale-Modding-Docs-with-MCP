---
title: "StackCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.StackCommand"
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
public class StackCommand extends AbstractPlayerCommand
```

Stacks the current selection in a direction, repeating it the specified number of times. Without arguments, stacks 1 time in the look direction. Supports `--empty` (include air) and `--spacing` (gap between repeats) options. Variants accept a count, or a direction plus count.

## Command Registration

- **Name:** `stack`
- **Game Mode:** Creative

## Arguments

Flags: empty. Optional: spacing (Integer). Variants: count (Integer); direction (RelativeDirection) + count (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
