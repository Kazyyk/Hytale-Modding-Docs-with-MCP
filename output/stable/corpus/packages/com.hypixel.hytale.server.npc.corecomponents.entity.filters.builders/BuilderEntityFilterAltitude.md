# BuilderEntityFilterAltitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterAltitude extends BuilderEntityFilterBase

NPC entity filter builder: Matches targets if they're within the defined range above the ground.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterAltitude(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public double[] getAltitudeRange(@Nonnull BuilderSupport support)

Also in this package: BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public IEntityFilter build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public double[] getAltitudeRange(BuilderSupport support)

Fields:
protected final NumberArrayHolder altitudeRange
