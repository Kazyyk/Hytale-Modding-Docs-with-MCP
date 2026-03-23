# LookBlocksBelowProvider

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders | Extends: WorldLocationProvider

public class LookBlocksBelowProvider extends WorldLocationProvider

## Fields

- protected String[] blockTags
- protected int count
- protected int minRange
- protected int maxRange
- private int[] blockTagsIndexes

## Constructors

- public LookBlocksBelowProvider(@Nonnull String[] blockTags, int count, int minRange, int maxRange)
- protected LookBlocksBelowProvider()

## Methods

- @Nullable @Override public Vector3i runCondition(@Nonnull World world, @Nonnull Vector3i position)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()
