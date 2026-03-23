# BuilderEntityFilterCombat

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterCombat extends BuilderEntityFilterBase

NPC entity filter builder: Check the target's combat state.

## Constants

- public static final double MAX_ELAPSED_TIME
- public static final double[] DEFAULT_TIME_ELAPSED_RANGE

## Methods

- @Nonnull public EntityFilterCombat build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterCombat(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public String getSequence(@Nonnull BuilderSupport builderSupport)
- public EntityFilterCombat.Mode getCombatMode(@Nonnull BuilderSupport builderSupport)
- public double[] getTimeElapsedRange(@Nonnull BuilderSupport builderSupport)

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public EntityFilterCombat build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public String getSequence(BuilderSupport builderSupport)
  public EntityFilterCombat.Mode getCombatMode(BuilderSupport builderSupport)
  public double[] getTimeElapsedRange(BuilderSupport builderSupport)

Fields:
public static final double MAX_ELAPSED_TIME
public static final double[] DEFAULT_TIME_ELAPSED_RANGE
protected final AssetHolder sequence
protected final NumberArrayHolder elapsedTimeRange
protected final EnumHolder<EntityFilterCombat.Mode> mode
