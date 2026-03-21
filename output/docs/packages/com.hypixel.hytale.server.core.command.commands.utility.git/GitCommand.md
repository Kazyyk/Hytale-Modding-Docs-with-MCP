---
title: "GitCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.git"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.git.GitCommand"
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
public class GitCommand extends AbstractCommandCollection
```

Top-level server command collection for git-based asset and prefab management. Registers two sub-command groups: `assets` (via [UpdateAssetsCommand](UpdateAssetsCommand.md)) and `prefabs` (via [UpdatePrefabsCommand](UpdatePrefabsCommand.md)). Accessible as `/git assets ...` and `/git prefabs ...` in the server console.

## Related Types

- [UpdateAssetsCommand](UpdateAssetsCommand.md) -- sub-command collection for git operations on game assets
- [UpdatePrefabsCommand](UpdatePrefabsCommand.md) -- sub-command collection for git operations on prefabs
