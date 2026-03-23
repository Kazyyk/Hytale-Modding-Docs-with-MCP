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
