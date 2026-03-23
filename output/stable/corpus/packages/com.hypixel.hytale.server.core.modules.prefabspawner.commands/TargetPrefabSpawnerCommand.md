# TargetPrefabSpawnerCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner.commands | Extends: AbstractWorldCommand

public abstract class TargetPrefabSpawnerCommand extends AbstractWorldCommand

Abstract base for related commands.

## Constructors

- TargetPrefabSpawnerCommand(@Nonnull String name, @Nonnull String description) | Creates a new TargetPrefabSpawnerCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.
- execute(@Nonnull CommandContext var1, @Nonnull WorldChunk var2, @Nonnull PrefabSpawnerState var3) | void | protected method.

Known subclasses: PrefabSpawnerGetCommand, PrefabSpawnerSetCommand, PrefabSpawnerWeightCommand

Also in this package: PrefabSpawnerCommand, PrefabSpawnerGetCommand, PrefabSpawnerSetCommand, PrefabSpawnerWeightCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  protected abstract void execute(CommandContext var1, WorldChunk var2, PrefabSpawnerState var3)

Fields:
private static final Message MESSAGE_GENERAL_BLOCK_TARGET_NOT_IN_RANGE
private static final Message MESSAGE_COMMANDS_ERRORS_PROVIDE_POSITION
protected final OptionalArg<RelativeIntPosition> positionArg
