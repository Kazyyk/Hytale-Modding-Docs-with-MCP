# PermTestCommand

Type: class | Package: com.hypixel.hytale.server.core.permissions.commands | Extends: CommandBase

public class PermTestCommand extends CommandBase

Command registered under `perm test` that checks whether the command sender has one or more permission nodes. Outputs the result for each node.

## Constructor


public PermTestCommand()

Registered under `"test"` with description key `"server.commands.testperm.desc"`.

## Methods

- protected void executeSync(@Nonnull CommandContext context)

Also in this package: PermCommand, PermGroupAddCommand, PermGroupCommand, PermGroupListCommand, PermGroupRemoveCommand, PermUserAddCommand, PermUserCommand, PermUserGroupAddCommand, PermUserGroupCommand, PermUserGroupListCommand, PermUserGroupRemoveCommand, PermUserListCommand, PermUserRemoveCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private final RequiredArg<List<String>> nodesArg
