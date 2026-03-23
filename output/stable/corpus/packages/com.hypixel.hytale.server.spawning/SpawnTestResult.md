# SpawnTestResult

Type: enum | Package: com.hypixel.hytale.server.spawning

public enum SpawnTestResult

Result codes returned by SpawningContext spawn validation methods.

## Enum Constants

- TEST_OK | Spawn position is valid
- FAIL_NO_POSITION | No valid position found
- FAIL_INVALID_POSITION | Position failed collision check
- FAIL_INTERSECT_ENTITY | Position overlaps an existing entity
- FAIL_NO_MOTION_CONTROLLERS | NPC has no motion controllers configured
- FAIL_NOT_SPAWNABLE | Entity is not spawnable at the context
- FAIL_NOT_BREATHABLE | NPC cannot breathe at the position

Also in this package: ISpawnable, ISpawnableWithModel, LegacySpawnSuppressorEntityMigration, LoadedNPCEvent, NPCSpawningConfig, SpawnRejection, SpawnSpan, SpawningContext, SpawningPlugin
