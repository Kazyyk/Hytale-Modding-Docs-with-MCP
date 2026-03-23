# BuilderSensorSelf

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorWithEntityFilters

public class BuilderSensorSelf extends BuilderSensorWithEntityFilters

Extends `BuilderSensorWithEntityFilters`.

## Methods

- @Nonnull public SensorSelf build(@Nonnull BuilderSupport builderSupport)
- return new SensorSelf(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- @Override public BuilderDescriptorState getBuilderDescriptorState()

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorTarget

Complete API:
  public SensorSelf build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public Builder<Sensor> readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
