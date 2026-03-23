# BuilderToolExtrudeAction

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolExtrudeAction implements Packet, ToServerPacket

Extrudes a block face at a position along a normal direction.

## Packet Info

- Packet ID | 403
- Direction | client-to-server
- Channel | Default

## Fields

- x | int
- y | int
- z | int
- xNormal | int
- yNormal | int
- zNormal | int

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolExtrudeAction | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`403`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
