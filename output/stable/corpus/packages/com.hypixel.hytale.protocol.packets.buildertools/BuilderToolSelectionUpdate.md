# BuilderToolSelectionUpdate

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolSelectionUpdate implements Packet, ToServerPacket

Updates the selection region bounds.

## Packet Info

- Packet ID | 409
- Direction | client-to-server
- Channel | Default

## Fields

- xMin | int
- yMin | int
- zMin | int
- xMax | int
- yMax | int
- zMax | int

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSelectionUpdate | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`409`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
