# BuilderEntityFilterItemInHand

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterItemInHand extends BuilderEntityFilterBase

NPC entity filter builder: Check if entity is holding an item.

## Methods

- @Nonnull public EntityFilterItemInHand build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterItemInHand(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- @Nullable public String[] getItems(@Nonnull BuilderSupport support)
- public EntityFilterItemInHand.WieldingHand getHand(@Nonnull BuilderSupport support)
