---
title: "WorldSettingsCommand.WorldSettingsSetCommand.AddSubCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.WorldSettingsCommand.WorldSettingsSetCommand.AddSubCommand"
api_surface: false
extends: "AbstractWorldCommand"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "commands"
  - "world-settings"
  - "inner-class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.commands`

```java
private class WorldSettingsSetCommand.AddSubCommand extends AbstractWorldCommand
```

Inner class of `WorldSettingsSetCommand` that adds a string value to a set-valued world setting. If the value is already present, reports that it already exists; otherwise adds it and confirms.

## Fields

| Field | Type | Description |
|---|---|---|
| `valueArg` | `RequiredArg<String>` | The required string argument for the value to add. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(CommandContext, World, Store<EntityStore>)` | `void` | Adds the specified value to the set, reporting success or duplicate. |
