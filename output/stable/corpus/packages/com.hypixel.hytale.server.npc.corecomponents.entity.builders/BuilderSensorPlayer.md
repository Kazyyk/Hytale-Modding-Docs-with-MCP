# BuilderSensorPlayer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorEntityBase

public class BuilderSensorPlayer extends BuilderSensorEntityBase

NPC sensor builder: Test if player matching specific attributes and filters is in range.

## Methods

- @Nonnull public SensorPlayer build(@Nonnull BuilderSupport builderSupport)
- return new SensorPlayer(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public SensorPlayer build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
