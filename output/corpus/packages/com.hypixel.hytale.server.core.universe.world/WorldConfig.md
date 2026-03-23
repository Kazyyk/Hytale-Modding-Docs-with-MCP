# WorldConfig

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class WorldConfig

Comprehensive configuration for a single world, serialized via `BuilderCodec` (versioned, version 4). Controls world generation, chunk storage, spawn, ticking, PvP, weather, game mode, NPC spawning, day/night cycle, compass, saving behavior, and plugin configuration. Loaded from and saved to `config.json` (formerly `config.bson`).

## Constants

- VERSION | int | 4 | Current codec version.
- INITIAL_GAME_DAY_START_HOUR | int | 5 | Default game-day start hour.
- INITIAL_GAME_DAY_START_MINS | int | 30 | Default game-day start minutes.

## Key Accessors

- getUuid() | UUID | UUID | Unique world identifier.
- getDisplayName() | String | DisplayName | Player-facing world name.
- getSeed() | long | Seed | World generation seed.
- getSpawnProvider() | ISpawnProvider | SpawnProvider | Spawn location provider.
- getWorldGenProvider() | IWorldGenProvider | WorldGen | World generator provider.
- getChunkStorageProvider() | IChunkStorageProvider<?> | ChunkStorage | Chunk persistence backend.
- getChunkConfig() | ChunkConfig | ChunkConfig | Pregenerate/keep-loaded region settings.
- isTicking() | boolean | IsTicking | Whether chunks tick in this world.
- isBlockTicking() | boolean | IsBlockTicking | Whether blocks tick.
- isPvpEnabled() | boolean | IsPvpEnabled | PvP toggle.
- isFallDamageEnabled() | boolean | IsFallDamageEnabled | Fall damage toggle.
- isGameTimePaused() | boolean | IsGameTimePaused | Whether day/night cycle is paused.
- getGameTime() | Instant | GameTime | Current in-game time of day.
- getForcedWeather() | String | ForcedWeather | Forced weather type, or null.
- getClientEffects() | ClientEffectWorldSettings | ClientEffects | Client-side visual effect settings.
- getGameMode() | GameMode | GameMode | Default game mode.
- isSpawningNPC() | boolean | IsSpawningNPC | NPC spawning toggle.
- getGameplayConfig() | String | GameplayConfig | Gameplay configuration asset ID.
- canSaveChunks() | boolean | IsSavingChunks | Whether chunk data can be saved.
- canUnloadChunks() | boolean | IsUnloadingChunks | Whether chunks can unload.
- isDeleteOnRemove() | boolean | DeleteOnRemove | Whether to delete world data on removal.

## Static Methods

- load(Path) | CompletableFuture<WorldConfig> | Loads config from a JSON file asynchronously.
- save(Path, WorldConfig) | CompletableFuture<Void> | Saves config to a JSON file asynchronously.
- formatDisplayName(String) | String | Formats a camelCase/underscore name into a display string with spaces.

## Inner Types

### ChunkConfig (class)

Nested configuration for chunk pregeneration and keep-loaded regions.

- getPregenerateRegion() | Box2D | Region to pregenerate on world start, or null.
- setPregenerateRegion(Box2D) | void | Sets the pregeneration region.
- getKeepLoadedRegion() | Box2D | Region that never unloads, or null.
- setKeepLoadedRegion(Box2D) | void | Sets the keep-loaded region.

## See Also

- World
- ClientEffectWorldSettings
- WorldConfigProvider
