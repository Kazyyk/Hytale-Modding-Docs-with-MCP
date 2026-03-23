# BuilderEntityFilterStandingOnBlock

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterStandingOnBlock extends BuilderEntityFilterBase

NPC entity filter builder: Matches the block directly beneath the entity against a BlockSet.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterStandingOnBlock(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public int getBlockSet(@Nonnull BuilderSupport support)
- throw new IllegalArgumentException("Unknown key! " + key)
