# BufferBundle.Tracker

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle | Implements: MemInstrument

public static class BufferBundle.Tracker implements MemInstrument

Tracks which generation stage last wrote to a buffer column. Used by `StagedChunkGenerator` to determine whether a buffer column's data is already up to date for a given stage, enabling cache-based skipping of redundant generation work.

## Fields

- public final int INITIAL_STAGE_INDEX
- public int stageIndex

## Methods

- @Nonnull @Override public MemInstrument.Report getMemoryUsage()
