# BuilderActionBeacon

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionBeacon extends BuilderActionBase

NPC action builder: Send Beacon Message.

## Fields

- protected double range
- protected double expirationTime
- protected int sendCount

## Methods

- @Nonnull public ActionBeacon build(@Nonnull BuilderSupport builderSupport)
- return new ActionBeacon(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public void registerTags(@Nonnull Set<String> tags)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public String getMessage(@Nonnull BuilderSupport support)
- public double getRange()
- public int[] getTargetGroups(@Nonnull BuilderSupport support)
- public double getExpirationTime()
- public int getSendCount()
- public int getTargetToSendSlot(@Nonnull BuilderSupport support)

Also in this package: BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public ActionBeacon build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public void registerTags(Set<String> tags)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionBeacon readConfig(JsonElement data)
  public String getMessage(BuilderSupport support)
  public double getRange()
  public int[] getTargetGroups(BuilderSupport support)
  public double getExpirationTime()
  public int getSendCount()
  public int getTargetToSendSlot(BuilderSupport support)

Fields:
protected final StringHolder message
protected double range
protected final AssetArrayHolder targetGroups
protected final StringHolder targetToSendSlot
protected double expirationTime
protected int sendCount
