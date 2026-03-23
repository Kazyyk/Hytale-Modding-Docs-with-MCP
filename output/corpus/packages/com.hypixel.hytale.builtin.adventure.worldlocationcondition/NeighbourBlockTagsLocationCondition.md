# NeighbourBlockTagsLocationCondition

Type: class | Package: com.hypixel.hytale.builtin.adventure.worldlocationcondition | Extends: WorldLocationCondition

public class NeighbourBlockTagsLocationCondition extends WorldLocationCondition

## Fields

- @Nonnull public static final BuilderCodec<NeighbourBlockTagsLocationCondition> CODEC
- protected String tagPatternId
- protected NeighbourBlockTagsLocationCondition.NeighbourDirection neighbourDirection
- protected IntRange support

## Methods

- @Override public boolean test(@Nonnull World world, int worldX, int worldY, int worldZ)
- private boolean checkBlockHasTag(int x, int y, int z, @Nullable BlockAccessor worldChunk)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()

## Inner Types

- `NeighbourBlockTagsLocationCondition.NeighbourDirection`
