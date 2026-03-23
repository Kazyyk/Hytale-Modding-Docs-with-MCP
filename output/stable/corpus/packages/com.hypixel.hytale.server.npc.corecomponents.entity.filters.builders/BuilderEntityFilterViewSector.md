# BuilderEntityFilterViewSector

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterViewSector extends BuilderEntityFilterBase

NPC entity filter builder: Matches entities within the given view sector.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterViewSector(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public float getViewSectorRadians(@Nonnull BuilderSupport builderSupport)

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public IEntityFilter build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public float getViewSectorRadians(BuilderSupport builderSupport)

Fields:
protected final FloatHolder viewSector
