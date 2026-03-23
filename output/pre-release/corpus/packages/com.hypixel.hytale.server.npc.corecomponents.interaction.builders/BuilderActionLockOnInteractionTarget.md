# BuilderActionLockOnInteractionTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction.builders | Extends: BuilderActionBase

public class BuilderActionLockOnInteractionTarget extends BuilderActionBase

NPC behavior tree builder for an action node. Configures execution logic.

## Methods

- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- build(@Nonnull BuilderSupport builderSupport) | Action | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | BuilderActionLockOnInteractionTarget | public method.
- getTargetSlot(@Nonnull BuilderSupport support) | int | public method.

Also in this package: BuilderActionSetInteractable, BuilderSensorCanInteract, BuilderSensorHasInteracted, BuilderSensorInteractionContext

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionLockOnInteractionTarget readConfig(JsonElement data)
  public int getTargetSlot(BuilderSupport support)

Fields:
protected final StringHolder targetSlot
