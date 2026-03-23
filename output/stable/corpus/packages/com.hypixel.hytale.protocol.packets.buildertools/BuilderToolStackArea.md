# BuilderToolStackArea

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolStackArea implements Packet, ToServerPacket

Stacks the selection in a direction by a count.

## Packet Info

- Packet ID | 415
- Direction | client-to-server
- Channel | Default

## Fields

- xDirection | int
- yDirection | int
- zDirection | int
- count | int

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolStackArea | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`415`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
