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
