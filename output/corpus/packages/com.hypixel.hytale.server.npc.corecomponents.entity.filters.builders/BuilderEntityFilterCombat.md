# BuilderEntityFilterCombat

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterCombat extends BuilderEntityFilterBase

NPC entity filter builder: Check the target's combat state.

## Constants

- public static final double MAX_ELAPSED_TIME
- public static final double[] DEFAULT_TIME_ELAPSED_RANGE

## Methods

- @Nonnull public EntityFilterCombat build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterCombat(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public String getSequence(@Nonnull BuilderSupport builderSupport)
- public EntityFilterCombat.Mode getCombatMode(@Nonnull BuilderSupport builderSupport)
- public double[] getTimeElapsedRange(@Nonnull BuilderSupport builderSupport)
