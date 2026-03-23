# MountCheckCommand

Type: class | Package: com.hypixel.hytale.builtin.mounts.commands | Extends: AbstractTargetPlayerCommand

public class MountCheckCommand extends AbstractTargetPlayerCommand

Abstract base for related commands.

## Constructors

- MountCheckCommand() | Creates a new MountCheckCommand instance.

Also in this package: DismountCommand, DismountOtherCommand, MountCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_CHECK_NO_COMPONENT
private static final Message MESSAGE_COMMANDS_CHECK_MOUNTED_TO_ENTITY
private static final Message MESSAGE_COMMANDS_CHECK_MOUNTED_TO_BLOCK
private static final Message MESSAGE_COMMANDS_CHECK_UNKNOWN_STATUS
