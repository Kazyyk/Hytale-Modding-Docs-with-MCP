---
title: "WorldSettingsCommand.WorldSettingsSetCommand.RemoveSubCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.WorldSettingsCommand.WorldSettingsSetCommand.RemoveSubCommand"
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
private class WorldSettingsSetCommand.RemoveSubCommand extends AbstractWorldCommand
```

Inner class of `WorldSettingsSetCommand` that removes a specific value from a set-valued world setting. Reports whether the value was found and removed.

## Fields

| Field | Type | Description |
|---|---|---|
| `valueArg` | `RequiredArg<String>` | The required string argument for the value to remove. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(CommandContext, World, Store<EntityStore>)` | `void` | Removes the specified value from the set, reporting success or not-found. |
