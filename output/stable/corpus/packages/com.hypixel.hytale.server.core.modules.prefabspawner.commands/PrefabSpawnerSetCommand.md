# PrefabSpawnerSetCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner.commands | Extends: TargetPrefabSpawnerCommand

public class PrefabSpawnerSetCommand extends TargetPrefabSpawnerCommand

Server command extending `TargetPrefabSpawnerCommand`.

## Constructors

- PrefabSpawnerSetCommand() | Creates a new PrefabSpawnerSetCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull WorldChunk chunk, @Nonnull PrefabSpawnerState prefabSpawner) | void | protected method.
- getOrDefault(@Nonnull OptionalArg<Boolean> arg, @Nonnull CommandContext context, boolean defaultValue) | boolean | static protected method.

Also in this package: PrefabSpawnerCommand, PrefabSpawnerGetCommand, PrefabSpawnerWeightCommand, TargetPrefabSpawnerCommand

Complete API:
  protected void execute(CommandContext context, WorldChunk chunk, PrefabSpawnerState prefabSpawner)
  protected static boolean getOrDefault(OptionalArg<Boolean> arg, CommandContext context, boolean defaultValue)

Fields:
private static final Message MESSAGE_COMMANDS_PREFAB_SPAWNER_SET
protected final RequiredArg<String> prefabPathArg
protected final OptionalArg<Boolean> fitHeightmapArg
protected final OptionalArg<Boolean> inheritSeedArg
protected final OptionalArg<Boolean> inheritHeightCheckArg
protected final OptionalArg<Double> defaultWeightArg
