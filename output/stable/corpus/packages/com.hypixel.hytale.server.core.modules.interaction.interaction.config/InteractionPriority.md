# InteractionPriority

Type: record | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config

public record InteractionPriority(@Nullable Map<PrioritySlot, Integer> values) implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionPriority>

Record holding per-slot priority values for interaction type precedence when multiple items are equipped.

## Record Components


@Nullable Map<PrioritySlot, Integer> values

## Constants

- Codec<InteractionPriority> CODEC

## Key Methods

- public record InteractionPriority(@Nullable Map<PrioritySlot, Integer> values)
- public int getPriority(PrioritySlot slot)
- public com.hypixel.hytale.protocol.InteractionPriority toPacket()
