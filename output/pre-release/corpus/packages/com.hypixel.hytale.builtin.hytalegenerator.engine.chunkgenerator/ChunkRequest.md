# ChunkRequest

Type: record | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator

public record ChunkRequest(@Nonnull ChunkRequest.GeneratorProfile generatorProfile, @Nonnull ChunkRequest.Arguments arguments)

Pairs a ChunkRequest.GeneratorProfile with ChunkRequest.Arguments to represent a complete chunk generation request.

## Inner Types

- ChunkRequest.Arguments | record | Per-chunk generation parameters
- ChunkRequest.GeneratorProfile | class | World structure name, seed, and counter

## Components

- @Nonnull ChunkRequest.GeneratorProfile generatorProfile
- @Nonnull ChunkRequest.Arguments arguments
