# SpawnBlockParticleSystem

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class SpawnBlockParticleSystem implements Packet, ToClientPacket

Packet that spawns a block-related particle system at a position.

## Protocol Constants

- PACKET_ID | 153
- IS_COMPRESSED | false
- NetworkChannel | Default

## Fields

- public int blockId
- @Nonnull public BlockParticleEvent particleType
- @Nullable public Position position

## Methods

- @Nonnull public static SpawnBlockParticleSystem deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
