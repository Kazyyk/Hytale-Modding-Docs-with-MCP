# WorldSaveCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.world | Extends: AbstractAsyncCommand

public class WorldSaveCommand extends AbstractAsyncCommand

Console command handling WorldSave operations.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_SAVE_NO_WORLD_SPECIFIED
- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_SAVE_SAVING_ALL
- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_SAVE_SAVING_ALL_DONE

## Fields

- @Nonnull private final OptionalArg<World> worldArg
- @Nonnull private final FlagArg saveAllFlag

## Methods

- public WorldSaveCommand()
- @Nonnull @Override protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- @Nonnull private CompletableFuture<Void> saveAllWorlds(@Nonnull CommandContext context)
- @Nonnull private static CompletableFuture<Void> saveWorld(@Nonnull World world)
