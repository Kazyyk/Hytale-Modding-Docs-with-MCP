# BuilderEntityFilterInventory

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterInventory extends BuilderEntityFilterBase

NPC entity filter builder: Test various conditions relating to entity inventory.

## Constants

- public static final int[] DEFAULT_FREE_SLOT_RANGE
- public static final int[] DEFAULT_ITEM_COUNT_RANGE
- public static final String[] DEFAULT_ITEM_PATTERNS

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterInventory(this, builderSupport)
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nullable public String[] getItems(@Nonnull BuilderSupport support)
- public int[] getCount(@Nonnull BuilderSupport support)
- public int[] getFreeSlotsRange(@Nonnull BuilderSupport support)
