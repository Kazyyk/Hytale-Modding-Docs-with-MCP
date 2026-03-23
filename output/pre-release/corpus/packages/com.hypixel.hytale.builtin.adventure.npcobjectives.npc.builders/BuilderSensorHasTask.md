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
