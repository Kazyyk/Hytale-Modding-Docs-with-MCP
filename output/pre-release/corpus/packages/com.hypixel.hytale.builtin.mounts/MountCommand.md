# MountCommand

Type: class | Package: com.hypixel.hytale.builtin.mounts.commands | Extends: AbstractCommandCollection

public class MountCommand extends AbstractCommandCollection

Top-level `/mount` command collection. Registered by MountPlugin.setup(). Groups the mount-related subcommands under the `mount` namespace with the translation key `"server.commands.mount"`.

## Constructor


public MountCommand()

Creates the collection with name `"mount"` and registers two subcommands:
- DismountCommand (`/mount dismount`)
- MountCheckCommand (`/mount check`)

## Related Types

- DismountCommand -- dismount subcommand
- MountCheckCommand -- mount status check subcommand
- MountPlugin -- registers this command

Also in this package: DismountCommand, DismountOtherCommand, MountCheckCommand
