# BuilderToolSetEntityLight

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolSetEntityLight implements Packet, ToServerPacket

Sets light properties on an entity.

## Packet Info

- Packet ID | 424
- Direction | client-to-server
- Channel | Default

## Fields

- entityId | int
- lightR | float
- lightG | float
- lightB | float
- lightRadius | float

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSetEntityLight | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`424`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
