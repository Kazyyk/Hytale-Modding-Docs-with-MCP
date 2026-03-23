# WarpRemoveCommand

Type: class | Package: com.hypixel.hytale.builtin.teleport.commands.warp | Extends: CommandBase

public class WarpRemoveCommand extends CommandBase

Console command handling WarpRemove operations.

## Constants

- private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED

## Fields

- @Nonnull private final RequiredArg<String> nameArg

## Methods

- public WarpRemoveCommand()
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: WarpCommand, WarpGoCommand, WarpGoVariantCommand, WarpListCommand, WarpReloadCommand, WarpSetCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_COMMANDS_TELEPORT_WARP_NOT_LOADED
private final RequiredArg<String> nameArg
