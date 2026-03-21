---
title: "UpdatePrefabsCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.git"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.git.UpdatePrefabsCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "command"
  - "utility"
  - "git"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.utility.git`

```java
public class UpdatePrefabsCommand extends AbstractCommandCollection
```

Server command collection for managing prefab data via git. Supports git submodule-aware operations on the server's prefab repository. Provides five sub-commands:

- **status** -- runs `git status` on the prefabs repo and all submodules
- **commit** -- stages all changes and commits with the sender's name
- **pull** -- pulls latest changes including submodules
- **push** -- pushes to origin including submodules
- **all** -- runs commit, pull, and push in sequence for both submodules and the root repository

All operations run asynchronously. Commit messages include the executing player's display name for attribution.

## Related Types

- [GitCommand](GitCommand.md) -- parent command collection
- [UpdateAssetsCommand](UpdateAssetsCommand.md) -- equivalent commands for assets
