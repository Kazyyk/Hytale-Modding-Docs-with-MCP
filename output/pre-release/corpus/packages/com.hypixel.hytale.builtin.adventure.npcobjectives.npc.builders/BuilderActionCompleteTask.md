# BuilderActionCompleteTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.npc.builders | Extends: BuilderActionPlayAnimation

public class BuilderActionCompleteTask extends BuilderActionPlayAnimation

## Fields

- protected final BooleanHolder playAnimation

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public ActionCompleteTask build(BuilderSupport builderSupport)
- @Nonnull public BuilderActionCompleteTask readConfig(JsonElement data)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- public boolean isPlayAnimation(BuilderSupport support)

Also in this package: BuilderActionStartObjective, BuilderSensorHasTask

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public ActionCompleteTask build(BuilderSupport builderSupport)
  public BuilderActionCompleteTask readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean isPlayAnimation(BuilderSupport support)

Fields:
protected final BooleanHolder playAnimation
