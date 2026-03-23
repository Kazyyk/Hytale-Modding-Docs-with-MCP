# BuilderActionFlockState

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents.builders | Extends: BuilderActionBase

public class BuilderActionFlockState extends BuilderActionBase

NPC behavior action builder for ActionFlockState functionality.

## Fields

- protected final StringHolder state

## Methods

- @Nonnull public ActionFlockState build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionFlockState readConfig(@Nonnull JsonElement data)
- public String getState(@Nonnull BuilderSupport support)

Also in this package: BuilderActionFlockBeacon, BuilderActionFlockJoin, BuilderActionFlockLeave, BuilderActionFlockSetTarget, BuilderBodyMotionFlock, BuilderEntityFilterFlock, BuilderSensorFlockCombatDamage, BuilderSensorFlockLeader, BuilderSensorInflictedDamage

Complete API:
  public ActionFlockState build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionFlockState readConfig(JsonElement data)
  public String getState(BuilderSupport support)

Fields:
protected final StringHolder state
