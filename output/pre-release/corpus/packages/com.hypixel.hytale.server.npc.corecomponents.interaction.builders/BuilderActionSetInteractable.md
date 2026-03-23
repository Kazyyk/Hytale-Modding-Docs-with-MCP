# BuilderActionSetInteractable

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction.builders | Extends: BuilderActionBase

public class BuilderActionSetInteractable extends BuilderActionBase

NPC behavior tree builder for an action node. Configures execution logic.

## Fields

- hint | String | String field.
- showPrompt | boolean | boolean field.

## Methods

- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- build(@Nonnull BuilderSupport builderSupport) | Action | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | BuilderActionSetInteractable | public method.
- getSetTo(@Nonnull BuilderSupport support) | boolean | public method.
- getHint() | String | public method.
- getShowPrompt() | boolean | public method.

Also in this package: BuilderActionLockOnInteractionTarget, BuilderSensorCanInteract, BuilderSensorHasInteracted, BuilderSensorInteractionContext

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Action build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionSetInteractable readConfig(JsonElement data)
  public boolean getSetTo(BuilderSupport support)
  public String getHint()
  public boolean getShowPrompt()

Fields:
protected final BooleanHolder setTo
protected String hint
protected boolean showPrompt
