---
title: "ClearEntitiesCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.ClearEntitiesCommand"
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
public class ClearEntitiesCommand extends AbstractPlayerCommand
```

Removes all copyable entities within the current selection bounds. Iterates entities via `BuilderToolsPlugin.forEachCopyableInSelection()` and removes each with `RemoveReason.REMOVE`. Reports the count of removed entities.

## Command Registration

- **Name:** `clearEntities`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

None

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.
