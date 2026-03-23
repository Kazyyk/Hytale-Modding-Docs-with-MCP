# BuilderSensorCount

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorBase

public class BuilderSensorCount extends BuilderSensorBase

NPC sensor builder: Check if there is a certain number of NPCs or players within a specific range.

## Fields

- protected String[] includeGroups
- protected String[] excludeGroups

## Methods

- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public SensorCount build(@Nonnull BuilderSupport builderSupport)
- return new SensorCount(this, builderSupport)
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public int[] getCount(@Nonnull BuilderSupport builderSupport)
- public double[] getRange(@Nonnull BuilderSupport builderSupport)
- public int[] getIncludeGroups()
- public int[] getExcludeGroups()

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorEntity, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public SensorCount build(BuilderSupport builderSupport)
  public Builder<Sensor> readConfig(JsonElement data)
  public int[] getCount(BuilderSupport builderSupport)
  public double[] getRange(BuilderSupport builderSupport)
  public int[] getIncludeGroups()
  public int[] getExcludeGroups()

Fields:
protected final NumberArrayHolder count
protected final NumberArrayHolder range
protected String[] includeGroups
protected String[] excludeGroups
