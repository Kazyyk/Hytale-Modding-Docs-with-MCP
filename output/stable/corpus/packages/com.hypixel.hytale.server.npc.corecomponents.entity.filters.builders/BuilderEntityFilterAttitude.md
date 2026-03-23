# BuilderEntityFilterAttitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterAttitude extends BuilderEntityFilterBase

NPC entity filter builder: Matches the attitude towards the locked target.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterAttitude(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public EnumSet<Attitude> getAttitudes(@Nonnull BuilderSupport support)

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterCombat, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public IEntityFilter build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public EnumSet<Attitude> getAttitudes(BuilderSupport support)

Fields:
protected final EnumSetHolder<Attitude> attitudes
