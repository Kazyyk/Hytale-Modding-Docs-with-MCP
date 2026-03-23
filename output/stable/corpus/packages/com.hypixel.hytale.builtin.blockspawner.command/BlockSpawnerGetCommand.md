# BlockSpawnerGetCommand

Type: class | Package: com.hypixel.hytale.builtin.blockspawner.command | Extends: AbstractWorldCommand

public class BlockSpawnerGetCommand extends AbstractWorldCommand

Abstract base for related commands.

## Constructors

- BlockSpawnerGetCommand() | Creates a new BlockSpawnerGetCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.

Also in this package: BlockSpawnerCommand, BlockSpawnerSetCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_GENERAL_BLOCK_TARGET_NOT_IN_RANGE
private static final Message MESSAGE_COMMANDS_ERRORS_PROVIDE_POSITION
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private static final Message MESSAGE_COMMANDS_BLOCK_SPAWNER_NO_BLOCK_SPAWNER_SET
private final OptionalArg<RelativeIntPosition> positionArg
