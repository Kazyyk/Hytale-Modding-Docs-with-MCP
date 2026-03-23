# BlockBulkFindCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.block.bulk | Extends: AbstractWorldCommand

public class BlockBulkFindCommand extends AbstractWorldCommand

## Fields

- @Nonnull private static final Message MESSAGE_COMMANDS_BLOCK_FIND_TIME_OUT
- @Nonnull private static final Message MESSAGE_COMMANDS_BLOCK_FIND_DONE
- @Nonnull private final RequiredArg<IntCoord> chunkXArg
- @Nonnull private final RequiredArg<IntCoord> chunkZArg
- @Nonnull private final RequiredArg<String> blockTypeArg
- @Nonnull private final RequiredArg<Integer> countArg
- @Nonnull private final RequiredArg<Integer> timeoutArg

## Constructors

- public BlockBulkFindCommand()

## Methods

- @Override protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)
