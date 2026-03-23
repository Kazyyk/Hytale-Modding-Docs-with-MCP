# BuilderToolSetEntityTransform

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolSetEntityTransform implements Packet, ToServerPacket

Sets the full transform (position and rotation) of an entity.

## Packet Info

- Packet ID | 421
- Direction | client-to-server
- Channel | Default

## Fields

- entityId | int
- x | float
- y | float
- z | float
- yaw | float
- pitch | float
- roll | float

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSetEntityTransform | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`421`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
