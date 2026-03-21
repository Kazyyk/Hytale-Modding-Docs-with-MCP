---
title: "com.hypixel.hytale.server.core.command.commands.utility.git"
kind: "package"
package: "com.hypixel.hytale.server.core.command.commands.utility.git"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "command"
  - "utility"
  - "git"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.utility.git`

Server console commands for managing game assets and prefabs via git. These commands allow server operators to pull, push, commit, and check status of the asset and prefab git repositories directly from the game server console. Operations execute asynchronously and support git submodules.

## Types

| Type | Kind | Description |
|---|---|---|
| [GitCommand](GitCommand.md) | class | Top-level `/git` command collection. |
| [UpdateAssetsCommand](UpdateAssetsCommand.md) | class | Git status/reset/pull for game assets. |
| [UpdatePrefabsCommand](UpdatePrefabsCommand.md) | class | Git status/commit/pull/push/all for prefabs with submodule support. |
