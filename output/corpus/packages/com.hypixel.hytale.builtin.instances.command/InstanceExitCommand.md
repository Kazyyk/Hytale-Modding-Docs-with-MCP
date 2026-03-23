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
