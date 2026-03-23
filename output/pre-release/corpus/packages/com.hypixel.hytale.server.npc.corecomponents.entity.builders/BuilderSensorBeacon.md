# BuilderSensorBeacon

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorBase

public class BuilderSensorBeacon extends BuilderSensorBase

NPC sensor builder: Checks to see if any messages have been broadcasted by nearby NPCs.

## Fields

- protected String targetSlot
- protected boolean consume

## Methods

- @Nonnull public SensorBeacon build(@Nonnull BuilderSupport builderSupport)
- return new SensorBeacon(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public int getMessageSlot(@Nonnull BuilderSupport builderSupport)
- public double getRange(@Nonnull BuilderSupport builderSupport)
- public int getTargetSlot(@Nonnull BuilderSupport support)
- public boolean isConsume()

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public SensorBeacon build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public int getMessageSlot(BuilderSupport builderSupport)
  public double getRange(BuilderSupport builderSupport)
  public int getTargetSlot(BuilderSupport support)
  public boolean isConsume()

Fields:
protected final StringHolder message
protected final DoubleHolder range
protected String targetSlot
protected boolean consume
