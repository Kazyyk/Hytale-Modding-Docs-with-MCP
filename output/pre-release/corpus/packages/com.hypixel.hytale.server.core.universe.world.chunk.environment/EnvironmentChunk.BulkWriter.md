# EnvironmentChunk.BulkWriter

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.environment

public static class BulkWriter

## Fields

- private final EnvironmentChunk.BulkWriter.ColumnWriter[] columnWriters

## Methods

- public BulkWriter()
- public EnvironmentChunk.BulkWriter.ColumnWriter getColumnWriter(int x, int z)
- public void write(@Nonnull EnvironmentChunk environmentChunk)
- private static void transferCounts(@Nonnull Int2LongMap from, @Nonnull Int2LongMap into)
- public void write(@Nonnull EnvironmentColumn environmentColumn)
- public void count(int environmentId, int count)
- public void intake(@Nonnull Int2IntFunction dataSource)
