# BuilderActionIgnoreForAvoidance

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionIgnoreForAvoidance extends BuilderActionBase

NPC action builder: Set the target slot of an entity that should be ignored during avoidance.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- return new ActionIgnoreForAvoidance(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public int getTargetSlot(@Nonnull BuilderSupport support)

Also in this package: BuilderActionBeacon, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionIgnoreForAvoidance readConfig(JsonElement data)
  public int getTargetSlot(BuilderSupport support)

Fields:
protected final StringHolder targetSlot
