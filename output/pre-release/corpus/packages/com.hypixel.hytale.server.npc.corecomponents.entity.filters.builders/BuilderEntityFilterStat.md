# BuilderEntityFilterStat

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterStat extends BuilderEntityFilterBase

NPC entity filter builder: Match stat values of the entity.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterStat(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public int getStat(@Nonnull BuilderSupport support)
- public EntityFilterStat.EntityStatTarget getStatTarget(@Nonnull BuilderSupport support)
- public int getRelativeTo(@Nonnull BuilderSupport support)
- public EntityFilterStat.EntityStatTarget getRelativeToTarget(@Nonnull BuilderSupport support)
- public double[] getValueRange(@Nonnull BuilderSupport support)

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterEntityEffect, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterViewSector

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public IEntityFilter build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public int getStat(BuilderSupport support)
  public EntityFilterStat.EntityStatTarget getStatTarget(BuilderSupport support)
  public int getRelativeTo(BuilderSupport support)
  public EntityFilterStat.EntityStatTarget getRelativeToTarget(BuilderSupport support)
  public double[] getValueRange(BuilderSupport support)

Fields:
protected final AssetHolder stat
protected final EnumHolder<EntityFilterStat.EntityStatTarget> statTarget
protected final AssetHolder relativeTo
protected final EnumHolder<EntityFilterStat.EntityStatTarget> relativeToTarget
protected final NumberArrayHolder valueRange
