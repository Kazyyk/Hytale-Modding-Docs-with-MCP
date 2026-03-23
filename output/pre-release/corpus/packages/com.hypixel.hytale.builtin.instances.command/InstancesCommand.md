# InstancesCommand

Type: class | Package: com.hypixel.hytale.builtin.instances.command | Extends: AbstractPlayerCommand

public class InstancesCommand extends AbstractPlayerCommand

Server command implementation.

## Methods

- super("instances", "server.commands.instances.desc")
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)
- public InstancesEditCommand()
- super("edit", "server.commands.instances.edit.desc")

Also in this package: InstanceEditCopyCommand, InstanceEditListCommand, InstanceEditLoadCommand, InstanceEditNewCommand, InstanceExitCommand, InstanceExitOtherCommand, InstanceMigrateCommand, InstanceSpawnCommand, InstancesEditCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
