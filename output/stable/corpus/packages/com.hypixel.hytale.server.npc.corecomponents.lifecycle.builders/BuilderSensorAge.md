# BuilderSensorAge

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders | Extends: BuilderSensorBase

public class BuilderSensorAge extends BuilderSensorBase

NPC behavior sensor builder for SensorAge functionality.

## Constants

- public static final TemporalAmount MIN_TIME
- public static final TemporalAmount MAX_TIME

## Fields

- protected final TemporalArrayHolder ageRange

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public Sensor build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- @Nonnull public Instant[] getAgeRange(@Nonnull BuilderSupport support)

Also in this package: BuilderActionDelayDespawn, BuilderActionDespawn, BuilderActionDie, BuilderActionRemove, BuilderActionRole, BuilderActionSpawn

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public Instant[] getAgeRange(BuilderSupport support)

Fields:
public static final TemporalAmount MIN_TIME
public static final TemporalAmount MAX_TIME
protected final TemporalArrayHolder ageRange
