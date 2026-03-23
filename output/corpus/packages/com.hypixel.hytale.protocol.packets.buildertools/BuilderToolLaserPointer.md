# BuilderToolLaserPointer

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, C, l, i, e, n, t, P, a, c, k, e, t

public class BuilderToolLaserPointer implements Packet, ToClientPacket

Renders a laser pointer line between two 3D points for a player with configurable color and duration.

## Packet Info

- Packet ID | 419
- Direction | server-to-client
- Channel | Default

## Fields

- playerNetworkId | int
- startX | float
- startY | float
- startZ | float
- endX | float
- endY | float
- endZ | float
- color | int
- durationMs | int

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolLaserPointer | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`419`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
