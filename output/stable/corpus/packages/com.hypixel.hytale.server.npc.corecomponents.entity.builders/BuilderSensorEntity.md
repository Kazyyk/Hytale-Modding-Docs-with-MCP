# BuilderSensorEntity

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.builders | Extends: BuilderSensorEntityBase

public class BuilderSensorEntity extends BuilderSensorEntityBase

NPC sensor builder: Test if entity matching specific attributes and filters is in range.

## Methods

- @Nonnull public SensorEntity build(@Nonnull BuilderSupport builderSupport)
- return new SensorEntity(this, builderSupport)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public boolean isGetPlayers(@Nonnull BuilderSupport support)
- public boolean isGetNPCs(@Nonnull BuilderSupport support)
- public boolean isExcludeOwnType(@Nonnull BuilderSupport support)

Also in this package: BuilderActionBeacon, BuilderActionIgnoreForAvoidance, BuilderActionNotify, BuilderActionOverrideAttitude, BuilderActionReleaseTarget, BuilderActionSetMarkedTarget, BuilderActionSetStat, BuilderHeadMotionWatch, BuilderSensorBeacon, BuilderSensorCount, BuilderSensorEntityBase, BuilderSensorKill, BuilderSensorPlayer, BuilderSensorSelf, BuilderSensorTarget

Complete API:
  public SensorEntity build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public boolean isGetPlayers(BuilderSupport support)
  public boolean isGetNPCs(BuilderSupport support)
  public boolean isExcludeOwnType(BuilderSupport support)

Fields:
protected final BooleanHolder getPlayers
protected final BooleanHolder getNPCs
protected final BooleanHolder excludeOwnType
