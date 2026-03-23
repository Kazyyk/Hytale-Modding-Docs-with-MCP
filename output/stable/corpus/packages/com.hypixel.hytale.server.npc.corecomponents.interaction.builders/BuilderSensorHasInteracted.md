# BuilderSensorHasInteracted

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction.builders | Extends: BuilderSensorBase

public class BuilderSensorHasInteracted extends BuilderSensorBase

NPC behavior tree builder for a sensor node. Configures detection or query logic.

## Methods

- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- build(BuilderSupport builderSupport) | Sensor | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(JsonElement data) | Builder<Sensor> | public method.

Also in this package: BuilderActionLockOnInteractionTarget, BuilderActionSetInteractable, BuilderSensorCanInteract, BuilderSensorInteractionContext

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
