# InstanceExitCommand

Type: class | Package: com.hypixel.hytale.builtin.instances.command | Extends: AbstractPlayerCommand

public class InstanceExitCommand extends AbstractPlayerCommand

Server command implementation.

## Methods

- super("exit", "server.commands.instances.exit.desc")
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)
- InstanceExitOtherCommand()
- super("server.commands.instances.exit.other.desc")
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: InstanceEditCopyCommand, InstanceEditListCommand, InstanceEditLoadCommand, InstanceEditNewCommand, InstanceExitOtherCommand, InstanceMigrateCommand, InstanceSpawnCommand, InstancesCommand, InstancesEditCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_INSTANCES_EXIT_FAIL
private static final Message MESSAGE_COMMANDS_INSTANCES_EXIT_SUCCESS_SELF
