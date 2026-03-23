# BuilderSensorInteractionContext

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction.builders | Extends: BuilderSensorBase

public class BuilderSensorInteractionContext extends BuilderSensorBase

NPC behavior tree builder for a sensor node. Configures detection or query logic.

## Methods

- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- build(@Nonnull BuilderSupport builderSupport) | Sensor | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | Builder<Sensor> | public method.
- getInteractionContext(@Nonnull BuilderSupport support) | String | public method.

Also in this package: BuilderActionLockOnInteractionTarget, BuilderActionSetInteractable, BuilderSensorCanInteract, BuilderSensorHasInteracted

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public String getInteractionContext(BuilderSupport support)

Fields:
protected final StringHolder interactionContext
