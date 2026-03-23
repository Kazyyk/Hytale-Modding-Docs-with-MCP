# BuilderSensorInflictedDamage

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents.builders | Extends: BuilderSensorBase

public class BuilderSensorInflictedDamage extends BuilderSensorBase

NPC behavior sensor builder for SensorInflictedDamage functionality.

## Fields

- protected SensorInflictedDamage.Target target
- protected boolean friendlyFire

## Methods

- @Nonnull public SensorInflictedDamage build(BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public boolean isFriendlyFire()
- public SensorInflictedDamage.Target getTarget()

Also in this package: BuilderActionFlockBeacon, BuilderActionFlockJoin, BuilderActionFlockLeave, BuilderActionFlockSetTarget, BuilderActionFlockState, BuilderBodyMotionFlock, BuilderEntityFilterFlock, BuilderSensorFlockCombatDamage, BuilderSensorFlockLeader

Complete API:
  public SensorInflictedDamage build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public boolean isFriendlyFire()
  public SensorInflictedDamage.Target getTarget()

Fields:
protected SensorInflictedDamage.Target target
protected boolean friendlyFire
