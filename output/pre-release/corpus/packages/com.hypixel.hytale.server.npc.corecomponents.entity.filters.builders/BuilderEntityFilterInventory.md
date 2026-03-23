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

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterEntityEffect, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public IEntityFilter build(BuilderSupport builderSupport)
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public String[] getItems(BuilderSupport support)
  public int[] getCount(BuilderSupport support)
  public int[] getFreeSlotsRange(BuilderSupport support)

Fields:
public static final int[] DEFAULT_FREE_SLOT_RANGE
public static final int[] DEFAULT_ITEM_COUNT_RANGE
public static final String[] DEFAULT_ITEM_PATTERNS
protected final AssetArrayHolder items
protected final NumberArrayHolder count
protected final NumberArrayHolder freeSlots
