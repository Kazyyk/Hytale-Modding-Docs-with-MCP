# BuilderToolShowAnchor

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, C, l, i, e, n, t, P, a, c, k, e, t

public class BuilderToolShowAnchor implements Packet, ToClientPacket

Shows a builder tool anchor at a position with a label.

## Packet Info

- Packet ID | 417
- Direction | server-to-client
- Channel | Default

## Fields

- x | float
- y | float
- z | float
- label | String

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolShowAnchor | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`417`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
