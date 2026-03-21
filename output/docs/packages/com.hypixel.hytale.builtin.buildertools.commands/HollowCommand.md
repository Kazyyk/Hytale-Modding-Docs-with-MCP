---
title: "HollowCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.HollowCommand"
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
public class HollowCommand extends AbstractPlayerCommand
```

Hollows out the current selection, replacing interior blocks with the specified block type. Supports configurable thickness (1-128, validated), and flags for including the floor (`--floor`/`--bottom`), roof (`--roof`/`--ceiling`/`--top`), and full perimeter (`--perimeter`/`--all`).

## Command Registration

- **Name:** `hollow`
- **Game Mode:** Creative

## Arguments

blockType (String, default Empty/Air), thickness (Integer, default 1). Flags: floor, roof, perimeter

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
