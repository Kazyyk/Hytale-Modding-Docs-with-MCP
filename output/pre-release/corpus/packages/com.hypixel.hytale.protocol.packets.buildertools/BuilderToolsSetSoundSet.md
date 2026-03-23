# BuilderToolsSetSoundSet

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolsSetSoundSet implements Packet, ToServerPacket

Sets the sound set for builder tool operations by entity ID.

## Packet Info

- Packet ID | 418
- Direction | client-to-server
- Channel | Default

## Fields

- entityId | int
- soundSet | String

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolsSetSoundSet | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`418`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
