# WorldSettingsCommand.WorldSettingsSetCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands | Extends: AbstractWorldCommand

private static class WorldSettingsCommand.WorldSettingsSetCommand<T> extends AbstractWorldCommand

Inner class of `WorldSettingsCommand` that manages set-valued world settings (collections). Provides add, remove, and clear operations for set-type world configuration properties. Used for settings like `disabledFluidTickers`.

## Fields

- display | String | Localization key for the setting display name.
- getter | Function<World, Set<T>> | Function to retrieve the current set value from the world.
- setter | BiConsumer<World, Set<T>> | Consumer to update the set value on the world.

## Constructor


public WorldSettingsSetCommand(@Nonnull String name, @Nonnull String description, @Nonnull String display, @Nonnull Function<World, Set<T>> getter, @Nonnull BiConsumer<World, Set<T>> setter)

Registers the `add`, `remove`, and `clear` sub-commands.

## Methods

- execute(CommandContext, World, Store<EntityStore>) | void | Displays the current set contents or indicates the set is empty.

## Inner Types

- AddSubCommand | Adds a value to the set.
- ClearSubCommand | Clears all values from the set.
- RemoveSubCommand | Removes a value from the set.

Also in this package: AddSubCommand, ClearSubCommand, RemoveSubCommand, ResetSubCommand, ResetSubCommand, SetSubCommand, SetSubCommand, SetTickingCommand, WorldSettingsBox2DCommand, WorldSettingsCommand, WorldSettingsSubCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final String display
private final Function<World,Set<T>> getter
private final BiConsumer<World,Set<T>> setter
