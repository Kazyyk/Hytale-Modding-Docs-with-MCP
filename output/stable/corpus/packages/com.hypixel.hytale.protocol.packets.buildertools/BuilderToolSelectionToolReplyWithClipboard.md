# BuilderToolSelectionToolReplyWithClipboard

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, C, l, i, e, n, t, P, a, c, k, e, t

public class BuilderToolSelectionToolReplyWithClipboard implements Packet, ToClientPacket

Server response containing clipboard block and fluid change data. Compressed packet.

## Packet Info

- Packet ID | 411
- Direction | server-to-client
- Channel | Default

## Fields

- blocksChange | BlockChange[]
- fluidsChange | FluidChange[]

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSelectionToolReplyWithClipboard | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`411`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
