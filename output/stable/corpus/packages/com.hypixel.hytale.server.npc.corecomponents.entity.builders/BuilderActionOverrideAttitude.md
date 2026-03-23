# BuilderActionOverrideAttitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionOverrideAttitude extends BuilderActionBase

NPC action builder: Override this NPCs attitude towards the provided target for a given duration.

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- return new ActionOverrideAttitude(this, builderSupport)
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public Attitude getAttitude(@Nonnull BuilderSupport support)
- public double getDuration(@Nonnull BuilderSupport support)

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionOverrideAttitude readConfig(JsonElement data)
  public Attitude getAttitude(BuilderSupport support)
  public double getDuration(BuilderSupport support)

Fields:
protected final EnumHolder<Attitude> attitude
protected final DoubleHolder duration
