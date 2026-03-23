# BuilderEntityFilterMovementState

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterMovementState extends BuilderEntityFilterBase

NPC entity filter builder: Check if the entity is in the given movement state.

## Fields

- protected MovementState movementState

## Methods

- @Nonnull public EntityFilterMovementState build(BuilderSupport builderSupport)
- return new EntityFilterMovementState(this)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public MovementState getMovementState()

Also in this package: BuilderEntityFilterAltitude, BuilderEntityFilterAnd, BuilderEntityFilterAttitude, BuilderEntityFilterCombat, BuilderEntityFilterHeightDifference, BuilderEntityFilterInsideBlock, BuilderEntityFilterInventory, BuilderEntityFilterItemInHand, BuilderEntityFilterLineOfSight, BuilderEntityFilterMany, BuilderEntityFilterNPCGroup, BuilderEntityFilterNot, BuilderEntityFilterOr, BuilderEntityFilterSpotsMe, BuilderEntityFilterStandingOnBlock, BuilderEntityFilterStat, BuilderEntityFilterViewSector

Complete API:
  public EntityFilterMovementState build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public MovementState getMovementState()

Fields:
protected MovementState movementState
