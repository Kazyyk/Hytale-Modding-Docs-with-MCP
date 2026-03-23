# WorldRemoveCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.world | Extends: CommandBase

public class WorldRemoveCommand extends CommandBase

Console command handling WorldRemove operations.

## Constants

- public static final Message MESSAGE_UNIVERSE_REMOVE_WORLD_NOT_FOUND
- public static final Message MESSAGE_UNIVERSE_REMOVE_WORLD_ONLY_ONE_WORLD_LOADED
- public static final Message MESSAGE_UNIVERSE_REMOVE_WORLD_CHANGE_DEFAULT_WORLD

## Fields

- @Nonnull private final RequiredArg<String> nameArg

## Methods

- public WorldRemoveCommand()
- @Override protected void executeSync(@Nonnull CommandContext context)
