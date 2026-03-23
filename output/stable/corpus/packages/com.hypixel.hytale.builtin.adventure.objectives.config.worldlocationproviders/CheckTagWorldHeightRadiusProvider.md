# CheckTagWorldHeightRadiusProvider

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders | Extends: WorldLocationProvider

public class CheckTagWorldHeightRadiusProvider extends WorldLocationProvider

## Fields

- protected String[] blockTags
- protected int radius
- private int[] blockTagsIndexes

## Constructors

- public CheckTagWorldHeightRadiusProvider(@Nonnull String[] blockTags, int radius)
- protected CheckTagWorldHeightRadiusProvider()

## Methods

- @Nullable @Override public Vector3i runCondition(@Nonnull World world, @Nonnull Vector3i position)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()
