# ISpawnableWithModel

Type: interface | Package: com.hypixel.hytale.server.spawning | Extends: ISpawnable

public interface ISpawnableWithModel extends ISpawnable

Extension of ISpawnable that adds model-related spawn requirements. Provides methods for resolving the spawn model name, creating execution and modifier scopes for expression evaluation, and querying memory and translation metadata. Used by `SpawningContext` to resolve bounding boxes for spawn position validation.

Known implementors: SpawnableWithModelBuilder

Also in this package: ISpawnable, LegacySpawnSuppressorEntityMigration, LoadedNPCEvent, NPCSpawningConfig, SpawnRejection, SpawnSpan, SpawnTestResult, SpawningContext, SpawningPlugin

Complete API:
  String getSpawnModelName(ExecutionContext var1, Scope var2)
  default Scope createModifierScope(ExecutionContext executionContext)
  Scope createExecutionScope()
  void markNeedsReload()
  boolean isMemory(ExecutionContext var1, Scope var2)
  String getMemoriesCategory(ExecutionContext var1, Scope var2)
  String getMemoriesNameOverride(ExecutionContext var1, Scope var2)
  String getNameTranslationKey(ExecutionContext var1, Scope var2)
