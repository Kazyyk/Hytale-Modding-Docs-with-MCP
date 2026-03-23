# SolidMaterial

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.material

public class SolidMaterial

## Fields

- @Nonnull private final MaterialCache materialCache
- public final int blockId
- public final int support
- public final int rotation
- public final int filler
- @Nullable public final Holder<ChunkStore> holder

## Constructors

- SolidMaterial(@Nonnull MaterialCache materialCache, int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder)

## Methods

- @Override public boolean equals(Object o)
- @Override public int hashCode()
- public static int contentHash(int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder)
- @Nonnull @Override public String toString()
