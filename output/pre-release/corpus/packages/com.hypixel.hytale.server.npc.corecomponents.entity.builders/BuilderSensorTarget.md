# BuilderSensorTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorWithEntityFilters

public class BuilderSensorTarget extends BuilderSensorWithEntityFilters

Extends `BuilderSensorWithEntityFilters`.

## Methods

- @Nonnull public SensorTarget build(@Nonnull BuilderSupport builderSupport)
- return new SensorTarget(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public double getRange(@Nonnull BuilderSupport support)
- public boolean getAutoUnlockTarget(@Nonnull BuilderSupport support)
- public int getTargetSlot(@Nonnull BuilderSupport builderSupport)

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf

Complete API:
  public SensorTarget build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public Builder<Sensor> readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public double getRange(BuilderSupport support)
  public boolean getAutoUnlockTarget(BuilderSupport support)
  public int getTargetSlot(BuilderSupport builderSupport)

Fields:
protected final DoubleHolder range
protected final BooleanHolder autoUnlockTarget
protected final StringHolder targetSlot
