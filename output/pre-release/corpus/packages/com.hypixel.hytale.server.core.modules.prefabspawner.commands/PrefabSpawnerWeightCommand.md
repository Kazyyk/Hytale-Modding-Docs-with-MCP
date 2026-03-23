# PrefabSpawnerWeightCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner.commands | Extends: TargetPrefabSpawnerCommand

public class PrefabSpawnerWeightCommand extends TargetPrefabSpawnerCommand

Server command extending `TargetPrefabSpawnerCommand`.

## Constructors

- PrefabSpawnerWeightCommand() | Creates a new PrefabSpawnerWeightCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull WorldChunk chunk, @Nonnull PrefabSpawnerState prefabSpawner) | void | protected method.

Also in this package: PrefabSpawnerCommand, PrefabSpawnerGetCommand, PrefabSpawnerSetCommand, TargetPrefabSpawnerCommand

Complete API:
  protected void execute(CommandContext context, WorldChunk chunk, PrefabSpawnerBlock prefabSpawner)

Fields:
private final RequiredArg<String> prefabArg
private final RequiredArg<Float> weightArg
