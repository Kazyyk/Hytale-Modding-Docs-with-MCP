# BuilderEntityFilterStat

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterStat extends BuilderEntityFilterBase

NPC entity filter builder: Match stat values of the entity.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterStat(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public int getStat(@Nonnull BuilderSupport support)
- public EntityFilterStat.EntityStatTarget getStatTarget(@Nonnull BuilderSupport support)
- public int getRelativeTo(@Nonnull BuilderSupport support)
- public EntityFilterStat.EntityStatTarget getRelativeToTarget(@Nonnull BuilderSupport support)
- public double[] getValueRange(@Nonnull BuilderSupport support)
