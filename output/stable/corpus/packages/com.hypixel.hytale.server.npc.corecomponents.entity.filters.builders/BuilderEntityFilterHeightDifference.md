# BuilderEntityFilterHeightDifference

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterHeightDifference extends BuilderEntityFilterBase

NPC entity filter builder: Matches entities within the given height range.

## Constants

- public static final double[] DEFAULT_HEIGHT_DIFFERENCE_RANGE

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterHeightDifference(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public double[] getHeightDifference(@Nonnull BuilderSupport support)
- public boolean isUseEyePosition(@Nonnull BuilderSupport support)

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public IEntityFilter build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public double[] getHeightDifference(BuilderSupport support)
  public boolean isUseEyePosition(BuilderSupport support)

Fields:
public static final double[] DEFAULT_HEIGHT_DIFFERENCE_RANGE
protected final BooleanHolder useEyePosition
protected final NumberArrayHolder heightDifference
