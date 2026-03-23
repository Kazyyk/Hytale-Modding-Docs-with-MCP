# BuilderSensorHasTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders | Extends: BuilderSensorBase

public class BuilderSensorHasTask extends BuilderSensorBase

## Fields

- protected final StringArrayHolder tasksById

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public Sensor build(BuilderSupport builderSupport)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Sensor> readConfig(JsonElement data)
- @Nullable public String[] getTasksById(BuilderSupport support)

Also in this package: BuilderActionCompleteTask, BuilderActionStartObjective

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public String[] getTasksById(BuilderSupport support)

Fields:
protected final StringArrayHolder tasksById
