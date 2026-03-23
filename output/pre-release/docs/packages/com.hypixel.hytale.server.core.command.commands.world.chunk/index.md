---
title: "com.hypixel.hytale.server.core.command.commands.world.chunk"
kind: "package"
package: "com.hypixel.hytale.server.core.command.commands.world.chunk"
fqcn: "com.hypixel.hytale.server.core.command.commands.world.chunk"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "command"
  - "chunk"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.world.chunk`

Server commands for chunk management under the `/chunk` command collection.

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [ChunkCommand](ChunkCommand.md) | class | internal | Command collection for `/chunk` with alias `/chunks`. Registers all chunk sub-commands. |
| [ChunkFixHeightMapCommand](ChunkFixHeightMapCommand.md) | class | internal | Recalculates a chunk's heightmap and invalidates lighting at the specified chunk coordinates. |
| [ChunkForceTickCommand](ChunkForceTickCommand.md) | class | internal | Forces all blocks in a chunk to enter ticking state. |
| [ChunkInfoCommand](ChunkInfoCommand.md) | class | internal | Displays detailed chunk information including flags, section data types, block counts, and entity counts. |
| [ChunkLightingCommand](ChunkLightingCommand.md) | class | internal | Dumps the lighting octree data for a block position to the server log. |
| [ChunkLoadCommand](ChunkLoadCommand.md) | class | internal | Loads a chunk at the specified coordinates, with optional mark-dirty flag. |
| [ChunkLoadedCommand](ChunkLoadedCommand.md) | class | internal | Displays the list of loaded chunks for a player's chunk tracker. |
| [ChunkMarkSaveCommand](ChunkMarkSaveCommand.md) | class | internal | Marks a chunk as needing to be saved, loading it first if necessary. |
| [ChunkMaxSendRateCommand](ChunkMaxSendRateCommand.md) | class | internal | Gets or sets the maximum chunk send rate (per second and per tick) for a player. |
| [ChunkRegenerateCommand](ChunkRegenerateCommand.md) | class | internal | Regenerates a chunk at the specified coordinates. |
| [ChunkResendCommand](ChunkResendCommand.md) | class | internal | Unloads all tracked chunks for a player, forcing resend. Optionally clears cached chunk section data. |
| [ChunkTintCommand](ChunkTintCommand.md) | class | internal | Applies a color tint to a chunk with optional Gaussian blur across neighboring chunks. Includes a UI page variant. |
| [ChunkTrackerCommand](ChunkTrackerCommand.md) | class | internal | Displays chunk tracker statistics including send rates, loaded/loading counts, and radius settings. |
| [ChunkUnloadCommand](ChunkUnloadCommand.md) | class | internal | Unloads a chunk at the specified coordinates. |
