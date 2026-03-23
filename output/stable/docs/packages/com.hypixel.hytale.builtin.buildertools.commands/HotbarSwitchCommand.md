---
title: "HotbarSwitchCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.HotbarSwitchCommand"
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
public class HotbarSwitchCommand extends AbstractPlayerCommand
```

Saves or loads a hotbar slot configuration. Takes a hotbar slot index (0-9, validated) and a `--save` flag to switch between save and load mode. Delegates to `HotbarManager.saveHotbar()` or `loadHotbar()`.

## Command Registration

- **Name:** `hotbar`
- **Game Mode:** Creative

## Arguments

hotbarSlot (Integer, 0-9, required). Flag: save

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
