# InstanceEditCopyCommand

Type: class | Package: com.hypixel.hytale.builtin.instances.command | Extends: AbstractAsyncCommand

public class InstanceEditCopyCommand extends AbstractAsyncCommand

Server command implementation.

## Methods

- super("copy", "server.commands.instances.edit.copy.desc")
- @Override protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)

Also in this package: InstanceEditListCommand, InstanceEditLoadCommand, InstanceEditNewCommand, InstanceExitCommand, InstanceExitOtherCommand, InstanceMigrateCommand, InstanceSpawnCommand, InstancesCommand, InstancesEditCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private final RequiredArg<String> originNameArg
private final RequiredArg<String> destinationNameArg
