---
title: "WorldSettingsCommand.WorldSettingsSetCommand.ClearSubCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.WorldSettingsCommand.WorldSettingsSetCommand.ClearSubCommand"
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
private class WorldSettingsSetCommand.ClearSubCommand extends AbstractWorldCommand
```

Inner class of `WorldSettingsSetCommand` that clears all values from a set-valued world setting. Reports whether the set was already empty.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(CommandContext, World, Store<EntityStore>)` | `void` | Clears the set by replacing it with `Set.of()`, or reports the set is already empty. |
