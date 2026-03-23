---
title: "WorldSettingsCommand.WorldSettingsSetCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.WorldSettingsCommand.WorldSettingsSetCommand"
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
private static class WorldSettingsCommand.WorldSettingsSetCommand<T> extends AbstractWorldCommand
```

Inner class of `WorldSettingsCommand` that manages set-valued world settings (collections). Provides add, remove, and clear operations for set-type world configuration properties. Used for settings like `disabledFluidTickers`.

## Fields

| Field | Type | Description |
|---|---|---|
| `display` | `String` | Localization key for the setting display name. |
| `getter` | `Function<World, Set<T>>` | Function to retrieve the current set value from the world. |
| `setter` | `BiConsumer<World, Set<T>>` | Consumer to update the set value on the world. |

## Constructor

```java
public WorldSettingsSetCommand(@Nonnull String name, @Nonnull String description, @Nonnull String display, @Nonnull Function<World, Set<T>> getter, @Nonnull BiConsumer<World, Set<T>> setter)
```

Registers the `add`, `remove`, and `clear` sub-commands.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(CommandContext, World, Store<EntityStore>)` | `void` | Displays the current set contents or indicates the set is empty. |

## Inner Types

| Type | Description |
|---|---|
| [AddSubCommand](WorldSettingsCommand.WorldSettingsSetCommand.AddSubCommand.md) | Adds a value to the set. |
| [ClearSubCommand](WorldSettingsCommand.WorldSettingsSetCommand.ClearSubCommand.md) | Clears all values from the set. |
| [RemoveSubCommand](WorldSettingsCommand.WorldSettingsSetCommand.RemoveSubCommand.md) | Removes a value from the set. |
