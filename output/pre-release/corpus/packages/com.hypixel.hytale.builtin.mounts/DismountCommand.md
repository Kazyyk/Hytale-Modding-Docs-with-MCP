# DismountCommand

Type: class | Package: com.hypixel.hytale.builtin.mounts.commands | Extends: AbstractPlayerCommand

public class DismountCommand extends AbstractPlayerCommand

The `/mount dismount` subcommand. Dismounts the executing player from any block-based mount by removing their MountedComponent. Also provides a variant to dismount another player by name.

## Constructor


public DismountCommand()

Creates the command with name `"dismount"` and description key `"server.commands.dismount.desc"`. Adds a DismountOtherCommand usage variant.

## Behavior


@Override
protected void execute(
    @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world
)

Removes the `MountedComponent` from the executing player's entity and sends the `"server.commands.dismount.dismountAttempted"` message.

## Inner Classes

- DismountOtherCommand -- variant targeting another player

## Related Types

- MountCommand -- parent command collection
- MountedComponent -- the component being removed
