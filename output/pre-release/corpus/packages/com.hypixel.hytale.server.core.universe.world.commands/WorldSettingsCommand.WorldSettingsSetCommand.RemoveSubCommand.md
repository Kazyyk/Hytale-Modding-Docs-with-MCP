# WorldSettingsCommand.WorldSettingsSetCommand.RemoveSubCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands | Extends: AbstractWorldCommand

private class WorldSettingsSetCommand.RemoveSubCommand extends AbstractWorldCommand

Inner class of `WorldSettingsSetCommand` that removes a specific value from a set-valued world setting. Reports whether the value was found and removed.

## Fields

- valueArg | RequiredArg<String> | The required string argument for the value to remove.

## Methods

- execute(CommandContext, World, Store<EntityStore>) | void | Removes the specified value from the set, reporting success or not-found.
