# BuilderEntityFilterNPCGroup

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterNPCGroup extends BuilderEntityFilterBase

NPC entity filter builder: Returns whether the entity matches one of the provided NPCGroups.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public IEntityFilter build(@Nonnull BuilderSupport builderSupport)
- return new EntityFilterNPCGroup(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public int[] getIncludeGroups(@Nonnull BuilderSupport builderSupport)
- public int[] getExcludeGroups(@Nonnull BuilderSupport builderSupport)

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterEntityEffect, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterMovementState, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public IEntityFilter build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public int[] getIncludeGroups(BuilderSupport builderSupport)
  public int[] getExcludeGroups(BuilderSupport builderSupport)

Fields:
protected final AssetArrayHolder includeGroups
protected final AssetArrayHolder excludeGroups
