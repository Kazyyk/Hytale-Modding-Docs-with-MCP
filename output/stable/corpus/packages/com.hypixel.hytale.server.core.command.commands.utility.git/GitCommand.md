# GitCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.git | Extends: AbstractCommandCollection

public class GitCommand extends AbstractCommandCollection

Top-level server command collection for git-based asset and prefab management. Registers two sub-command groups: `assets` (via UpdateAssetsCommand) and `prefabs` (via UpdatePrefabsCommand). Accessible as `/git assets ...` and `/git prefabs ...` in the server console.

## Related Types

- UpdateAssetsCommand -- sub-command collection for git operations on game assets
- UpdatePrefabsCommand -- sub-command collection for git operations on prefabs
