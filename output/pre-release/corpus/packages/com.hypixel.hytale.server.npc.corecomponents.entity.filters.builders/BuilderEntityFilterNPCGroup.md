# BuilderEntityFilterNPCGroup

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterNPCGroup extends BuilderEntityFilterBase

NPC entity filter builder: Returns whether the entity matches one of the provided NPCGroups.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterNPCGroup(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public int[] getIncludeGroups(@Nonnull BuilderSupport builderSupport)
- public int[] getExcludeGroups(@Nonnull BuilderSupport builderSupport)
