# BuilderEntityFilterHeightDifference

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterHeightDifference extends BuilderEntityFilterBase

NPC entity filter builder: Matches entities within the given height range.

## Constants

- public static final double[] DEFAULT_HEIGHT_DIFFERENCE_RANGE

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterHeightDifference(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public double[] getHeightDifference(@Nonnull BuilderSupport support)
- public boolean isUseEyePosition(@Nonnull BuilderSupport support)
