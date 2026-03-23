# BuilderActionSetMarkedTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionSetMarkedTarget extends BuilderActionBase

NPC action builder: Explicitly sets a marked target in a given slot..

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- return new ActionSetMarkedTarget(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public int getTargetSlot(@Nonnull BuilderSupport support)

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionSetMarkedTarget readConfig(JsonElement data)
  public int getTargetSlot(BuilderSupport support)

Fields:
protected final StringHolder targetSlot
