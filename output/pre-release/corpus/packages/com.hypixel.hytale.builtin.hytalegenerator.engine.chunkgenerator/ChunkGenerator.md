# ChunkGenerator

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator

public interface ChunkGenerator

Defines the contract for chunk generation in the Hytale world generator. Implementations produce a `GeneratedChunk` from a ChunkRequest.Arguments and provide spawn positions via a `PositionProvider`. Known implementations: StagedChunkGenerator and FallbackGenerator.

## Methods

- @Nullable GeneratedChunk generate(@Nonnull ChunkRequest.Arguments var1)
- @Nonnull PositionProvider getSpawnPositions()

Known implementors: FallbackGenerator, StagedChunkGenerator

Also in this package: Arguments, Builder, ChunkRequest, FallbackGenerator, GeneratorProfile, StagedChunkGenerator

Complete API:
  GeneratedChunk generate(ChunkRequest.Arguments var1)
  PositionProvider getSpawnPositions()
