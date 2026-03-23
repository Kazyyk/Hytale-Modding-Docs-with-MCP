# BuilderActionFlockJoin

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents.builders | Extends: BuilderActionBase

public class BuilderActionFlockJoin extends BuilderActionBase

NPC behavior action builder for ActionFlockJoin functionality.

## Fields

- protected boolean forceJoin

## Methods

- @Nonnull public ActionFlockJoin build(BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionFlockJoin readConfig(@Nonnull JsonElement data)
- public boolean isForceJoin()

Also in this package: BuilderActionFlockBeacon, BuilderActionFlockLeave, BuilderActionFlockSetTarget, BuilderActionFlockState, BuilderBodyMotionFlock, BuilderEntityFilterFlock, BuilderSensorFlockCombatDamage, BuilderSensorFlockLeader, BuilderSensorInflictedDamage

Complete API:
  public ActionFlockJoin build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionFlockJoin readConfig(JsonElement data)
  public boolean isForceJoin()

Fields:
protected boolean forceJoin
