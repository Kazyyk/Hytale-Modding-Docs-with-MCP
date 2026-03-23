# ChunkRequest.Arguments

Type: record | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator

public record ChunkRequest.Arguments(int seed, long index, int x, int z, @Nullable LongPredicate stillNeeded)

Per-chunk generation parameters. Contains the world seed, chunk index, chunk coordinates (x, z), and an optional `stillNeeded` predicate that allows the generator to skip chunks that are no longer needed (e.g., if a player has moved away).

## Components

- int seed
- long index
- int x
- int z
- @Nullable LongPredicate stillNeeded
