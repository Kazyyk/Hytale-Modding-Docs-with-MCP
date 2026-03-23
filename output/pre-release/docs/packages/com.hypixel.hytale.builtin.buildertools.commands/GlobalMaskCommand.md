---
title: "GlobalMaskCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.GlobalMaskCommand"
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
public class GlobalMaskCommand extends AbstractPlayerCommand
```

Manages the global block mask applied to all editing operations. Without arguments, displays the current mask. A `set` usage variant accepts a `BlockMask` argument. The `clear` subcommand (aliases: `disable`, `c`) removes the mask.

## Command Registration

- **Name:** `gmask`
- **Game Mode:** Creative

## Arguments

Variant: mask (BlockMask). Subcommand: clear

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
