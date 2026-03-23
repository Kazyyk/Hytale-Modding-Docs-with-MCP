---
title: "PrefabCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.PrefabCommand"
api_surface: false
extends: "AbstractCommandCollection"
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
public class PrefabCommand extends AbstractCommandCollection
```

Root command for prefab management. Contains subcommands `save`, `load`, `delete`, and `list`. The `load` subcommand supports loading by name from asset/server/worldgen stores with optional recursive child loading. The `save` subcommand supports direct save with flags for overwrite, entities, empty, player anchor, and clear support. The `list` subcommand supports asset/server/worldgen store types and a `--text` flag for text-only output.

## Command Registration

- **Name:** `prefab`
- **Game Mode:** Creative

## Aliases

`p`

## Arguments

Subcommands: save, load, delete, list

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
