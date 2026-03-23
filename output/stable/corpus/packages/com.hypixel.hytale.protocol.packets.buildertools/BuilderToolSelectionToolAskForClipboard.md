# BuilderToolSelectionToolAskForClipboard

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolSelectionToolAskForClipboard implements Packet, ToServerPacket

Requests the server to send the current clipboard data. Contains no fields.

## Packet Info

- Packet ID | 410
- Direction | client-to-server
- Channel | Default

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSelectionToolAskForClipboard | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`410`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
