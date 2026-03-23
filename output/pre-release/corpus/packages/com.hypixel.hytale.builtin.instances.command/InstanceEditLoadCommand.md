# InstanceEditLoadCommand

Type: class | Package: com.hypixel.hytale.builtin.instances.command | Extends: AbstractAsyncCommand

public class InstanceEditLoadCommand extends AbstractAsyncCommand

Server command implementation.

## Methods

- super("load", "server.commands.instances.edit.load.desc")
- @Override public CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)

Also in this package: InstanceEditCopyCommand, InstanceEditListCommand, InstanceEditNewCommand, InstanceExitCommand, InstanceExitOtherCommand, InstanceMigrateCommand, InstanceSpawnCommand, InstancesCommand, InstancesEditCommand

Complete API:
  public CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private final RequiredArg<String> instanceNameArg
