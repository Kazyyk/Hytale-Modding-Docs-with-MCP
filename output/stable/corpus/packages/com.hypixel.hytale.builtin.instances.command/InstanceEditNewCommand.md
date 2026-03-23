# InstanceEditNewCommand

Type: class | Package: com.hypixel.hytale.builtin.instances.command | Extends: AbstractAsyncCommand

public class InstanceEditNewCommand extends AbstractAsyncCommand

Server command implementation.

## Methods

- super("new", "server.commands.instances.edit.new.desc")
- @Override public CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- throw new IllegalArgumentException("Unknown asset pack: " + packId)

Also in this package: InstanceEditCopyCommand, InstanceEditListCommand, InstanceEditLoadCommand, InstanceExitCommand, InstanceExitOtherCommand, InstanceMigrateCommand, InstanceSpawnCommand, InstancesCommand, InstancesEditCommand

Complete API:
  public CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private static final Message MESSAGE_SERVER_COMMANDS_INSTANCES_EDIT_ASSETS_IMMUTABLE
private final RequiredArg<String> instanceNameArg
private final OptionalArg<String> packName
