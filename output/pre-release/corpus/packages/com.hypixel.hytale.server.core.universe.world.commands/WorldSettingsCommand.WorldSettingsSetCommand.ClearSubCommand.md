# WorldSettingsCommand.WorldSettingsSetCommand.ClearSubCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands | Extends: AbstractWorldCommand

private class WorldSettingsSetCommand.ClearSubCommand extends AbstractWorldCommand

Inner class of `WorldSettingsSetCommand` that clears all values from a set-valued world setting. Reports whether the set was already empty.

## Methods

- execute(CommandContext, World, Store<EntityStore>) | void | Clears the set by replacing it with `Set.of()`, or reports the set is already empty.
