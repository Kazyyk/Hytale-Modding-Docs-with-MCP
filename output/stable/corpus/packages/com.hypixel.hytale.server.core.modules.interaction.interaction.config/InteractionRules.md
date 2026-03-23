# InteractionRules

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.InteractionRules>

public class InteractionRules implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionRules>

Defines blocking, interruption, and bypass rules that control when interactions can start or must stop.

## Constants

- BuilderCodec<InteractionRules> CODEC

## Key Methods

- public boolean validateInterrupts(@Nonnull InteractionType type, @Nonnull Int2ObjectMap<IntSet> selfTags, @Nonnull InteractionType otherType, @Nonnull Int2ObjectMap<IntSet> otherTags, @Nonnull InteractionRules otherRules)
- public boolean validateBlocked(@Nonnull InteractionType type, @Nonnull Int2ObjectMap<IntSet> selfTags, @Nonnull InteractionType otherType, @Nonnull Int2ObjectMap<IntSet> otherTags, @Nonnull InteractionRules otherRules)
- public com.hypixel.hytale.protocol.InteractionRules toPacket()
- public String toString()
