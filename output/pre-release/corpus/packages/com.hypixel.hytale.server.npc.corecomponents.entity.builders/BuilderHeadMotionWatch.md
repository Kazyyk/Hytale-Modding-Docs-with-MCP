# BuilderHeadMotionWatch

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderHeadMotionBase

public class BuilderHeadMotionWatch extends BuilderHeadMotionBase

NPC head motion builder: Rotate to target.

## Methods

- @Nonnull public HeadMotionWatch build(@Nonnull BuilderSupport builderSupport)
- return new HeadMotionWatch(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public double getRelativeTurnSpeed(@Nonnull BuilderSupport support)

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public HeadMotionWatch build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderHeadMotionWatch readConfig(JsonElement data)
  public double getRelativeTurnSpeed(BuilderSupport support)

Fields:
protected final DoubleHolder relativeTurnSpeed
