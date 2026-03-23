# ChunkRequest.GeneratorProfile

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator

public static final class ChunkRequest.GeneratorProfile

Identifies a world generation profile by its world structure name, seed, and world counter. Used to determine whether a cached generator can be reused or a new one must be constructed. Supports cloning and equality comparison.

## Fields

- @Nonnull private final String worldStructureName
- private int seed
- private int worldCounter

## Constructors

- public GeneratorProfile(@Nonnull String worldStructureName, int seed, int worldCounter)

## Methods

- @Nonnull public String worldStructureName()
- public int seed()
- public void setSeed(int seed)
- @Override public boolean equals(Object o)
- @Override public int hashCode()
- public ChunkRequest.GeneratorProfile clone()
- @Nonnull @Override public String toString()
