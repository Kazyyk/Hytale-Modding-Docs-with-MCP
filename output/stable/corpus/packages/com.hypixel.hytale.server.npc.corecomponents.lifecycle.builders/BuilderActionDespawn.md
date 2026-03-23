# BuilderActionDespawn

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders | Extends: BuilderActionBase

public class BuilderActionDespawn extends BuilderActionBase

NPC behavior action builder for ActionDespawn functionality.

## Fields

- protected boolean force

## Methods

- @Nonnull public ActionDespawn build(BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionDespawn readConfig(@Nonnull JsonElement data)
- public boolean isForced()

Also in this package: BuilderActionDelayDespawn, BuilderActionDie, BuilderActionRemove, BuilderActionRole, BuilderActionSpawn, BuilderSensorAge

Complete API:
  public ActionDespawn build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionDespawn readConfig(JsonElement data)
  public boolean isForced()

Fields:
protected boolean force
