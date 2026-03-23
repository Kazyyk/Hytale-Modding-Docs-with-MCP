# BuilderActionRemove

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders | Extends: BuilderActionBase

public class BuilderActionRemove extends BuilderActionBase

NPC behavior action builder for ActionRemove functionality.

## Fields

- protected final BooleanHolder useTarget

## Methods

- @Nonnull public Action build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Action> readConfig(@Nonnull JsonElement data)
- public boolean getUseTarget(@Nonnull BuilderSupport support)

Also in this package: BuilderActionDelayDespawn, BuilderActionDespawn, BuilderActionDie, BuilderActionRole, BuilderActionSpawn, BuilderSensorAge

Complete API:
  public Action build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Action> readConfig(JsonElement data)
  public boolean getUseTarget(BuilderSupport support)

Fields:
protected final BooleanHolder useTarget
