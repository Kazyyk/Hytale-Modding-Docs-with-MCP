# BuilderSensorCanInteract

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.interaction.builders | Extends: BuilderSensorBase

public class BuilderSensorCanInteract extends BuilderSensorBase

NPC behavior tree builder for a sensor node. Configures detection or query logic.

## Methods

- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- build(@Nonnull BuilderSupport builderSupport) | Sensor | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | Builder<Sensor> | public method.
- getViewSectorRadians(@Nonnull BuilderSupport builderSupport) | float | public method.
- getAttitudes(@Nonnull BuilderSupport support) | EnumSet<Attitude> | public method.

Also in this package: BuilderActionLockOnInteractionTarget, BuilderActionSetInteractable, BuilderSensorHasInteracted, BuilderSensorInteractionContext

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public float getViewSectorRadians(BuilderSupport builderSupport)
  public EnumSet<Attitude> getAttitudes(BuilderSupport support)

Fields:
protected final FloatHolder viewSector
protected final EnumSetHolder<Attitude> attitudes
