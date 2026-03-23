# BlockBulkReplaceCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands.block.bulk | Extends: AbstractPlayerCommand

public class BlockBulkReplaceCommand extends AbstractPlayerCommand

## Fields

- @Nonnull private final RequiredArg<String> findArg
- @Nonnull private final RequiredArg<String> replaceArg
- @Nonnull private final RequiredArg<Integer> radiusArg

## Constructors

- public BlockBulkReplaceCommand()

## Methods

- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)
- @Nonnull protected static IntList getBlockIdList(int blockId)
- @Nonnull private static IntList createNESWRotationLists(@Nonnull BlockType block, @Nonnull IntList blockIdList)
