# BlockModule.BlockEntityPreprocessor

Type: class | Package: com.hypixel.hytale.server.core.modules.block

public static final class BlockModule.BlockEntityPreprocessor

Thread-local utility for batch processing block types during chunk generation. Collects block type IDs that have block entities, then finds matching blocks in sections and clones their entity holders into the chunk component map.

## Relationships

- Inner class of BlockModule

Also in this package: BlockEntity, BlockModule, BlockReplaceEvent, BlockStateInfo, BlockStateInfoNeedRebuild, BlockStateInfoRefSystem, ItemContainerStateRefSystem, MigrateItemContainer, MigrateLaunchPad, MigrationSystem

Complete API:
  public void clear()
  private void collectType(int value)
  private void collectBlock(int index, int blockId)

Fields:
public static final ThreadLocal<BlockModule.BlockEntityPreprocessor> LOCAL
public final IntList ids
public final Int2ObjectMap<Holder<ChunkStore>> blockEntities
public final IntList indices
public final IntList blockIds
public final IntConsumer typeCollector
public final BiIntConsumer blockCollector
