# BuilderEntityFilterLineOfSight

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterLineOfSight extends BuilderEntityFilterBase

NPC entity filter builder: Matches if there is line of sight to the target.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(BuilderSupport builderSupport)
- return new EntityFilterLineOfSight()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(JsonElement data)

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterEntityEffect, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public IEntityFilter build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
