# InteractionCameraSettings

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.InteractionCameraSettings>

public class InteractionCameraSettings implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionCameraSettings>

Configures first-person and third-person camera keyframe sequences during an interaction.

## Constants

- BuilderCodec<InteractionCameraSettings> CODEC
- BuilderCodec<InteractionCameraSettings.InteractionCamera> CODEC

## Key Methods

- public com.hypixel.hytale.protocol.InteractionCameraSettings toPacket()
- public String toString()

Also in this package: Interaction, InteractionCamera, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionPriorityCodec, InteractionRules, InteractionTypeUtils, RootInteraction, SimpleInstantInteraction, SimpleInteraction

Complete API:
  private static LegacyValidator<InteractionCameraSettings.InteractionCamera[]> getInteractionCameraValidator()
  public com.hypixel.hytale.protocol.InteractionCameraSettings toPacket()
  public String toString()

Fields:
public static final BuilderCodec<InteractionCameraSettings> CODEC
private InteractionCameraSettings.InteractionCamera[] firstPerson
private InteractionCameraSettings.InteractionCamera[] thirdPerson
