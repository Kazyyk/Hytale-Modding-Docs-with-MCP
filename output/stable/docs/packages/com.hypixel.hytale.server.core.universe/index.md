---
title: "com.hypixel.hytale.server.core.universe"
package: "com.hypixel.hytale.server.core.universe"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.server.core.universe`

This package contains the core universe and player reference types. The `Universe` singleton manages worlds and player connections, while `PlayerRef` represents a connected player's server-side state.

## Classes

| Type | Description |
|---|---|
| [PlayerRef](PlayerRef.md) | Connected player reference bridging network, entity, and game systems |
| [Universe](Universe.md) | Central singleton managing worlds, players, and server lifecycle |
| [WorldLoadCancelledException](WorldLoadCancelledException.md) | Thrown when world loading is cancelled |
