# BuilderEntityFilterInsideBlock

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterInsideBlock extends BuilderEntityFilterBase

NPC entity filter builder: Matches if the entity is inside any of the blocks in the BlockSet.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterInsideBlock(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public int getBlockSet(@Nonnull BuilderSupport support)
- throw new IllegalArgumentException("Unknown key! " + key)
