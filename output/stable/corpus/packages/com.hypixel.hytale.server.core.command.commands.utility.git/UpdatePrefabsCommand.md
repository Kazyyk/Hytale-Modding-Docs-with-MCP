# UpdatePrefabsCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.git | Extends: AbstractCommandCollection

public class UpdatePrefabsCommand extends AbstractCommandCollection

Server command collection for managing prefab data via git. Supports git submodule-aware operations on the server's prefab repository. Provides five sub-commands:

- **status** -- runs `git status` on the prefabs repo and all submodules
- **commit** -- stages all changes and commits with the sender's name
- **pull** -- pulls latest changes including submodules
- **push** -- pushes to origin including submodules
- **all** -- runs commit, pull, and push in sequence for both submodules and the root repository

All operations run asynchronously. Commit messages include the executing player's display name for attribution.

## Related Types

- GitCommand -- parent command collection
- UpdateAssetsCommand -- equivalent commands for assets

Also in this package: GitCommand, UpdateAssetsCommand, UpdateAssetsGitCommand, UpdateAssetsPullCommand, UpdateAssetsResetCommand, UpdateAssetsStatusCommand, UpdatePrefabsAllCommand, UpdatePrefabsCommitCommand, UpdatePrefabsGitCommand, UpdatePrefabsPullCommand, UpdatePrefabsPushCommand, UpdatePrefabsStatusCommand
