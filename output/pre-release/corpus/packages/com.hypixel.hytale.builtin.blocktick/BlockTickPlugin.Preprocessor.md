# BlockTickPlugin.Preprocessor

Type: class | Package: com.hypixel.hytale.builtin.blocktick

public static final class BlockTickPlugin.Preprocessor

Thread-local helper used by `BlockTickPlugin.discoverTickingBlocks` to collect block type IDs that have a tick procedure and then find all block indices matching those IDs within a section. Avoids per-call allocation by storing instances in a `ThreadLocal`.

## Fields

- public static final ThreadLocal<BlockTickPlugin.Preprocessor> LOCAL
- public final IntList tickingIds
- public final IntList tickingIndices
- public final IntConsumer typeCollector
- public final IntConsumer indexCollector

## Methods

- public void clear()

## Behavior

- `typeCollector` checks each block ID against `BlockType.getAssetMap()` and adds the ID to `tickingIds` if the block type has a non-null `TickProcedure`.
- `indexCollector` adds matching block indices to `tickingIndices`.
- `clear()` empties both `tickingIds` and `tickingIndices` lists for reuse.
- Accessed via `LOCAL.get()` to obtain the thread-local instance.

## Related Types

- BlockTickPlugin -- the enclosing plugin that uses this preprocessor

Also in this package: BlockTickPlugin

Complete API:
  public void clear()
  private void collectType(int value)
  private void collectIndex(int index)

Fields:
public static final ThreadLocal<BlockTickPlugin.Preprocessor> LOCAL
public final IntList tickingIds
public final IntList tickingIndices
public final IntConsumer typeCollector
public final IntConsumer indexCollector
