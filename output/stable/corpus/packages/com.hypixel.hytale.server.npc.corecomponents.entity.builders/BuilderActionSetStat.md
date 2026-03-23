# BuilderActionSetStat

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderActionBase

public class BuilderActionSetStat extends BuilderActionBase

NPC action builder: Sets (or adds to) an entity stat on the NPC..

## Methods

- @Nonnull public ActionSetStat build(@Nonnull BuilderSupport builderSupport)
- return new ActionSetStat(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- public int getStat(@Nonnull BuilderSupport support)
- public float getValue(@Nonnull BuilderSupport support)
- public boolean isAdd(@Nonnull BuilderSupport support)

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public ActionSetStat build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionSetStat readConfig(JsonElement data)
  public int getStat(BuilderSupport support)
  public float getValue(BuilderSupport support)
  public boolean isAdd(BuilderSupport support)

Fields:
protected final AssetHolder stat
protected final FloatHolder value
protected final BooleanHolder add
