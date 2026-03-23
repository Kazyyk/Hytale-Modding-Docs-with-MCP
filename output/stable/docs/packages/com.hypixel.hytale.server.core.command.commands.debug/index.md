---
title: "com.hypixel.hytale.server.core.command.commands.debug"
kind: "package"
package: "com.hypixel.hytale.server.core.command.commands.debug"
fqcn: "com.hypixel.hytale.server.core.command.commands.debug"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "commands"
  - "debug"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.debug`

Debug commands for the Hytale server. Provides administrative and diagnostic commands for assets, logging, network statistics, player position debugging, and more.

## Types

| Type | Kind | Description |
|---|---|---|
| [AssetsCommand](AssetsCommand.md) | class | Command collection for asset inspection sub-commands |
| [AssetsDuplicatesCommand](AssetsDuplicatesCommand.md) | class | Scans common assets for duplicate files |
| [AssetTagsCommand](AssetTagsCommand.md) | class | Lists assets matching a tag pattern |
| [DebugPlayerPositionCommand](DebugPlayerPositionCommand.md) | class | Displays player position and teleport state |
| [HitDetectionCommand](HitDetectionCommand.md) | class | Toggles hit detection visual debug |
| [HudManagerTestCommand](HudManagerTestCommand.md) | class | Shows or hides HUD components for testing |
| [LogCommand](LogCommand.md) | class | Manages server log levels at runtime |
| [MessageTranslationTestCommand](MessageTranslationTestCommand.md) | class | Tests message translation with nested params |
| [PacketStatsCommand](PacketStatsCommand.md) | class | Displays network packet statistics |
| [PIDCheckCommand](PIDCheckCommand.md) | class | Checks process IDs for singleplayer mode |
| [PingCommand](PingCommand.md) | class | Displays latency statistics for a player |
| [ShowBuilderToolsHudCommand](ShowBuilderToolsHudCommand.md) | class | Shows builder tools legend HUD in creative |
| [StopNetworkChunkSendingCommand](StopNetworkChunkSendingCommand.md) | class | Toggles network chunk sending |
| [TagPatternCommand](TagPatternCommand.md) | class | Tests a tag pattern against a block type |
| [VersionCommand](VersionCommand.md) | class | Displays server version and patchline |
