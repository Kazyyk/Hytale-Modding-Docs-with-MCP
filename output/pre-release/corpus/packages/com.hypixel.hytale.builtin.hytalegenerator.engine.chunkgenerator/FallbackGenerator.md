# FallbackGenerator

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator | Implements: ChunkGenerator

public class FallbackGenerator implements ChunkGenerator

A ChunkGenerator that produces empty chunks with no blocks, block states, or entities. Used as a fallback when the primary staged generator is unavailable. Provides an `EmptyPositionProvider` for spawn positions. Accessed via the static `INSTANCE` singleton.

## Fields

- @Nonnull public static final FallbackGenerator INSTANCE

## Methods

- @Nullable @Override public GeneratedChunk generate(@Nonnull ChunkRequest.Arguments arguments)
- @Override public PositionProvider getSpawnPositions()
