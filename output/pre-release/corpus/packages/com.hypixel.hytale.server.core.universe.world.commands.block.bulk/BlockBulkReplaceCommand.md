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

Also in this package: BlockBulkCommand, BlockBulkFindCommand, BlockBulkFindHereCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  protected static IntList getBlockIdList(int blockId)
  private static IntList createNESWRotationLists(BlockType block, IntList blockIdList)

Fields:
private final RequiredArg<String> findArg
private final RequiredArg<String> replaceArg
private final RequiredArg<Integer> radiusArg
