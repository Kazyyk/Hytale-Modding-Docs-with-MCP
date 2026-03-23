# BuilderSensorKill

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorBase

public class BuilderSensorKill extends BuilderSensorBase

NPC sensor builder: Test if NPC made a kill.

## Methods

- @Nonnull public SensorKill build(@Nonnull BuilderSupport builderSupport)
- return new SensorKill(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public int getTargetSlot(@Nonnull BuilderSupport support)

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public SensorKill build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public int getTargetSlot(BuilderSupport support)

Fields:
protected final StringHolder targetSlot
