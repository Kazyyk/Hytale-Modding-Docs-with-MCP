# WorldConfig

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class WorldConfig

Configuration for a single world. Controls all per-world settings including UUID, display name, seed, spawn provider, world gen, world map, chunk storage, ticking, PvP, fall damage, game time, weather, game mode, NPC spawning, chunk saving/unloading, compass, and plugin-specific configuration. Supports versioned codec serialization (version 4) with documentation annotations for each field.

## Inner Types

- `WorldConfig.ChunkConfig` -- nested config for pregenerate and keep-loaded regions
