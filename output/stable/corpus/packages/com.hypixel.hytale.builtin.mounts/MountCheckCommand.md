# MountCheckCommand

Type: class | Package: com.hypixel.hytale.builtin.mounts.commands | Extends: AbstractTargetPlayerCommand

public class MountCheckCommand extends AbstractTargetPlayerCommand

The `/mount check` subcommand. Reports the mount status of the target player.

## Constructor


public MountCheckCommand()

Creates the command with name `"check"` and description key `"server.commands.check.desc"`.

## Behavior


@Override
protected void execute(
    @Nonnull CommandContext context,
    @Nullable Ref<EntityStore> sourceRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull PlayerRef playerRef,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)

Reads the target player's MountedComponent and sends one of four messages:

- No `MountedComponent | server.commands.check.noComponent
- Mounted to entity | server.commands.check.mountedToEntity
- Mounted to block | server.commands.check.mountedToBlock
- Neither entity nor block | server.commands.check.unknownStatus

## Related Types

- MountCommand -- parent command collection
- MountedComponent -- the component being inspected

Also in this package: DismountCommand, DismountOtherCommand, MountCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_CHECK_NO_COMPONENT
private static final Message MESSAGE_COMMANDS_CHECK_MOUNTED_TO_ENTITY
private static final Message MESSAGE_COMMANDS_CHECK_MOUNTED_TO_BLOCK
private static final Message MESSAGE_COMMANDS_CHECK_UNKNOWN_STATUS
