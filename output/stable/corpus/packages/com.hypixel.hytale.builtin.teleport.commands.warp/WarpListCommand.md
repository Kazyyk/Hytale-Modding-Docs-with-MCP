# WarpListCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.warp | Extends: CommandBase

public class WarpListCommand extends CommandBase

Console command handling WarpList operations.

## Constants

- private static final int WARPS_PER_LIST_PAGE
- private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED
- private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
- private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_NO_WARPS
- private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_PAGE_NUM_TOO_HIGH

## Fields

- @Nonnull private final OptionalArg<Integer> pageArg

## Methods

- public WarpListCommand()
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: WarpCommand, WarpGoCommand, WarpGoVariantCommand, WarpReloadCommand, WarpRemoveCommand, WarpSetCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final int WARPS_PER_LIST_PAGE
private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_NO_WARPS
private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_PAGE_NUM_TOO_HIGH
private final OptionalArg<Integer> pageArg
