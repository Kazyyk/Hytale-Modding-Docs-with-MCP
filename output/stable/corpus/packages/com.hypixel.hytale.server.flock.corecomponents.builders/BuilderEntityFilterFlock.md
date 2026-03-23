# BuilderEntityFilterFlock

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterFlock extends BuilderEntityFilterBase

NPC behavior filter builder for EntityFilterFlock functionality.

## Fields

- protected FlockMembershipType flockMembership
- protected FlockPlayerMembership flockPlayerMembership
- protected int[] size
- protected boolean checkCanJoin

## Methods

- @Nonnull public IEntityFilter build(BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public int[] getSize()
- public FlockMembershipType getFlockMembership()
- public FlockPlayerMembership getFlockPlayerMembership()
- public boolean isCheckCanJoin()

Also in this package: BuilderActionFlockBeacon, BuilderActionFlockJoin, BuilderActionFlockLeave, BuilderActionFlockSetTarget, BuilderActionFlockState, BuilderBodyMotionFlock, BuilderSensorFlockCombatDamage, BuilderSensorFlockLeader, BuilderSensorInflictedDamage

Complete API:
  public IEntityFilter build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<IEntityFilter> readConfig(JsonElement data)
  public int[] getSize()
  public FlockMembershipType getFlockMembership()
  public FlockPlayerMembership getFlockPlayerMembership()
  public boolean isCheckCanJoin()

Fields:
protected FlockMembershipType flockMembership
protected FlockPlayerMembership flockPlayerMembership
protected int[] size
protected boolean checkCanJoin
