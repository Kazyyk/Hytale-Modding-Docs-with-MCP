# BuilderSensorFlockCombatDamage

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents.builders | Extends: BuilderSensorBase

public class BuilderSensorFlockCombatDamage extends BuilderSensorBase

NPC behavior sensor builder for SensorFlockCombatDamage functionality.

## Fields

- protected boolean leaderOnly

## Methods

- @Nonnull public SensorFlockCombatDamage build(BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public boolean isLeaderOnly()

Also in this package: BuilderActionFlockBeacon, BuilderActionFlockJoin, BuilderActionFlockLeave, BuilderActionFlockSetTarget, BuilderActionFlockState, BuilderBodyMotionFlock, BuilderEntityFilterFlock, BuilderSensorFlockLeader, BuilderSensorInflictedDamage

Complete API:
  public SensorFlockCombatDamage build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public boolean isLeaderOnly()

Fields:
protected boolean leaderOnly
