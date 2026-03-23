# ISpawnableWithModel

Type: interface | Package: com.hypixel.hytale.server.spawning | Extends: ISpawnable

public interface ISpawnableWithModel extends ISpawnable

Extension of ISpawnable that adds model-related spawn requirements. Provides methods for resolving the spawn model name, creating execution and modifier scopes for expression evaluation, and querying memory and translation metadata. Used by `SpawningContext` to resolve bounding boxes for spawn position validation.
