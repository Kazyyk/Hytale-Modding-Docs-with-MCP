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

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterEntityEffect, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public EntityFilterItemInHand build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public String[] getItems(BuilderSupport support)
  public EntityFilterItemInHand.WieldingHand getHand(BuilderSupport support)

Fields:
protected final AssetArrayHolder items
protected final EnumHolder<EntityFilterItemInHand.WieldingHand> hand
