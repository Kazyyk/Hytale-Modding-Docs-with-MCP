---
title: "UpdateAssetsCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.git"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.git.UpdateAssetsCommand"
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
public class UpdateAssetsCommand extends AbstractCommandCollection
```

Server command collection for managing game assets via git. Provides three sub-commands that execute git operations on the assets directory:

- **status** -- runs `git status` on the assets repository
- **reset** -- runs `git reset --hard head` to discard local changes
- **pull** -- runs `git pull` (or an `updateAssets.sh` script if present)

All operations run asynchronously via `CompletableFuture`. Output is streamed line-by-line to the command sender.

## Related Types

- [GitCommand](GitCommand.md) -- parent command collection
- [UpdatePrefabsCommand](UpdatePrefabsCommand.md) -- equivalent commands for prefabs
