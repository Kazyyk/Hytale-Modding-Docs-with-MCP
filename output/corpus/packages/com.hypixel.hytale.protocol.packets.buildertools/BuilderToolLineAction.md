# BuilderToolLineAction

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolLineAction implements Packet, ToServerPacket

Draws a line of blocks between two positions.

## Packet Info

- Packet ID | 414
- Direction | client-to-server
- Channel | Default

## Fields

- xStart | int
- yStart | int
- zStart | int
- xEnd | int
- yEnd | int
- zEnd | int

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolLineAction | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`414`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
