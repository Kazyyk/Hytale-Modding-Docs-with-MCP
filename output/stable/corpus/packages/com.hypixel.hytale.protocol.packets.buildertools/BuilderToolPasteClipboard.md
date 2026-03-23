# BuilderToolPasteClipboard

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolPasteClipboard implements Packet, ToServerPacket

Pastes the clipboard contents at the specified position.

## Packet Info

- Packet ID | 407
- Direction | client-to-server
- Channel | Default

## Fields

- x | int
- y | int
- z | int

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolPasteClipboard | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`407`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
