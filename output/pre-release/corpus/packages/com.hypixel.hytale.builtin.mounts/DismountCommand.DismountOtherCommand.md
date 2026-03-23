# DismountCommand.DismountOtherCommand

Type: class | Package: com.hypixel.hytale.builtin.mounts.commands | Extends: CommandBase

private static class DismountOtherCommand extends CommandBase

Usage variant of DismountCommand that dismounts a specific player by name. Takes a required `player` argument of type `ArgTypes.PLAYER_REF`.

## Constructor


DismountOtherCommand()

Creates the variant with description key `"server.commands.dismount.other.desc"`.

## Behavior


@Override
protected void executeSync(@Nonnull CommandContext context)

Resolves the target player reference, validates it is in a world, then executes on the world thread:
1. Reads the target's `Player` component.
2. Removes the MountedComponent from the target entity.
3. Sends a `"server.commands.dismount.dismountOther"` message with the target username.

If the player reference is invalid or the player is not in a world, sends an error message.

## Related Types

- DismountCommand -- enclosing command
