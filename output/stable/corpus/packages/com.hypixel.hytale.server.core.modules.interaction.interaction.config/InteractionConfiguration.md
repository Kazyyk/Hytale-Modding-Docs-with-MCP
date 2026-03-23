# InteractionConfiguration

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.InteractionConfiguration>

public class InteractionConfiguration implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionConfiguration>

Configuration for interaction display settings including outlines, use distance per game mode, and priority mapping.

## Constants

- InteractionConfiguration DEFAULT
- InteractionConfiguration DEFAULT_WEAPON
- BuilderCodec<InteractionConfiguration> CODEC

## Key Methods

- public int getPriorityFor(InteractionType interactionType, PrioritySlot slot)
- public float getUseDistance(GameMode mode)
- public com.hypixel.hytale.protocol.InteractionConfiguration toPacket()

Also in this package: Interaction, InteractionCamera, InteractionCameraSettings, InteractionEffects, InteractionPriority, InteractionPriorityCodec, InteractionRules, InteractionTypeUtils, RootInteraction, SimpleInstantInteraction, SimpleInteraction

Complete API:
  public int getPriorityFor(InteractionType interactionType, PrioritySlot slot)
  public float getUseDistance(GameMode mode)
  public com.hypixel.hytale.protocol.InteractionConfiguration toPacket()

Fields:
public static final InteractionConfiguration DEFAULT
public static final InteractionConfiguration DEFAULT_WEAPON
private static final Object2FloatMap<GameMode> DEFAULT_USE_DISTANCE
public static final BuilderCodec<InteractionConfiguration> CODEC
protected boolean displayOutlines
protected boolean debugOutlines
protected Object2FloatMap<GameMode> useDistance
protected boolean allEntities
protected Map<InteractionType,InteractionPriority> priorities
