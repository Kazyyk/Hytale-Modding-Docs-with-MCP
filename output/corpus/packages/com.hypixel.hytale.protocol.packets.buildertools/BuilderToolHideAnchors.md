# BuilderToolHideAnchors

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, C, l, i, e, n, t, P, a, c, k, e, t

public class BuilderToolHideAnchors implements Packet, ToClientPacket

Instructs the client to hide all builder tool anchors. Contains no fields.

## Packet Info

- Packet ID | 416
- Direction | server-to-client
- Channel | Default

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolHideAnchors | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`416`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
