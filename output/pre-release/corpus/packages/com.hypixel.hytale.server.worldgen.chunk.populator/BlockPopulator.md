# BlockPopulator

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk.populator

public class BlockPopulator

Populates a chunk with terrain blocks by iterating over each column (32x32), evaluating height thresholds from the interpolator, placing filling blocks from the biome's `LayerContainer`, then applying dynamic/static layers and cover blocks. The `populate` method is the entry point called during world generation.

## Methods

- public static void populate(int seed, @Nonnull ChunkGeneratorExecution execution)

## Inner Classes

- LayerPopulator: Generates static layers (absolute Y ranges) and dynamic layers (relative to surface) for each column.
