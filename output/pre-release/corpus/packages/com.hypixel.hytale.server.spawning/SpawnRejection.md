# SpawnRejection

Type: enum | Package: com.hypixel.hytale.server.spawning

public enum SpawnRejection

Reasons why a spawn attempt was rejected during position validation.

## Enum Constants

- OUTSIDE_LIGHT_RANGE | Block light level outside configured range
- INVALID_SPAWN_BLOCK | Ground block not in the allowed spawn block set
- INVALID_POSITION | Position failed collision validation
- NO_POSITION | No valid spawn position found in the column
- NOT_BREATHABLE | NPC cannot breathe at the spawn position
- OTHER | Rejection for an unspecified reason

## Static Fields

- VALUES | SpawnRejection[] | Cached array of all enum constants

Also in this package: ISpawnable, ISpawnableWithModel, LegacySpawnSuppressorEntityMigration, LoadedNPCEvent, NPCSpawningConfig, SpawnSpan, SpawnTestResult, SpawningContext, SpawningPlugin

Fields:
public static final SpawnRejection[] VALUES
