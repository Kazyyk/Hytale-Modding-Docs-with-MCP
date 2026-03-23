# UpdateAssetsCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.git | Extends: AbstractCommandCollection

public class UpdateAssetsCommand extends AbstractCommandCollection

Server command collection for managing game assets via git. Provides three sub-commands that execute git operations on the assets directory:

- **status** -- runs `git status` on the assets repository
- **reset** -- runs `git reset --hard head` to discard local changes
- **pull** -- runs `git pull` (or an `updateAssets.sh` script if present)

All operations run asynchronously via `CompletableFuture`. Output is streamed line-by-line to the command sender.

## Related Types

- GitCommand -- parent command collection
- UpdatePrefabsCommand -- equivalent commands for prefabs
