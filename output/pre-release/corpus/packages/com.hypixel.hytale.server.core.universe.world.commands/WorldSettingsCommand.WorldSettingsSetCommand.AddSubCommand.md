# WorldSettingsCommand.WorldSettingsSetCommand.AddSubCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands | Extends: AbstractWorldCommand

private class WorldSettingsSetCommand.AddSubCommand extends AbstractWorldCommand

Inner class of `WorldSettingsSetCommand` that adds a string value to a set-valued world setting. If the value is already present, reports that it already exists; otherwise adds it and confirms.

## Fields

- valueArg | RequiredArg<String> | The required string argument for the value to add.

## Methods

- execute(CommandContext, World, Store<EntityStore>) | void | Adds the specified value to the set, reporting success or duplicate.
