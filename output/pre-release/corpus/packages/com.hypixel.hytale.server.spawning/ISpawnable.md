# ISpawnable

Type: interface | Package: com.hypixel.hytale.server.spawning

public interface ISpawnable

Contract for entities that can be spawned via the spawning system. Requires an identifier and a spawn validation method that tests whether the entity can spawn at a given `SpawningContext`.

Known implementors: BuilderBaseWithType, BuilderMotionControllerMap, ISpawnableWithModel

Also in this package: ISpawnableWithModel, LegacySpawnSuppressorEntityMigration, LoadedNPCEvent, NPCSpawningConfig, SpawnRejection, SpawnSpan, SpawnTestResult, SpawningContext, SpawningPlugin

Complete API:
  String getIdentifier()
  SpawnTestResult canSpawn(SpawningContext var1)
