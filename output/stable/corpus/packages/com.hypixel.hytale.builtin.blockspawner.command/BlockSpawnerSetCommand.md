# BlockSpawnerSetCommand

Type: class | Package: com.hypixel.hytale.builtin.blockspawner.command | Extends: AbstractWorldCommand

public class BlockSpawnerSetCommand extends AbstractWorldCommand

Abstract base for related commands.

## Constructors

- BlockSpawnerSetCommand() | Creates a new BlockSpawnerSetCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.

Also in this package: BlockSpawnerCommand, BlockSpawnerGetCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_GENERAL_BLOCK_TARGET_NOT_IN_RANGE
private static final Message MESSAGE_COMMANDS_ERRORS_PROVIDE_POSITION
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private static final SingleArgumentType<BlockSpawnerTable> BLOCK_SPAWNER_ASSET_TYPE
private final RequiredArg<BlockSpawnerTable> blockSpawnerIdArg
private final OptionalArg<RelativeIntPosition> positionArg
private final FlagArg ignoreChecksFlag
