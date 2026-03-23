# SpawnParticleSystem

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class SpawnParticleSystem implements Packet, ToClientPacket

Packet that spawns a generic particle system.

## Protocol Constants

- PACKET_ID | 152
- IS_COMPRESSED | false
- NetworkChannel | Default

## Methods

- @Nonnull public static SpawnParticleSystem deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
