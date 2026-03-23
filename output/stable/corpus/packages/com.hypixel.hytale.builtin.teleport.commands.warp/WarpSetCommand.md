# WarpSetCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.warp | Extends: AbstractPlayerCommand

public class WarpSetCommand extends AbstractPlayerCommand

Console command handling WarpSet operations.

## Constants

- @Nonnull private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED
- @Nonnull private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_RESERVED_KEYWORD

## Fields

- @Nonnull private final RequiredArg<String> nameArg

## Methods

- public WarpSetCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)
