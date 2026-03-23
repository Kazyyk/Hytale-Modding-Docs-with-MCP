# BuilderToolGeneralAction

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolGeneralAction implements Packet, ToServerPacket

Sends a general builder tool action (selection, copy, undo/redo, tool mode toggle).

## Packet Info

- Packet ID | 412
- Direction | client-to-server
- Channel | Default

## Fields

- action | BuilderToolAction

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolGeneralAction | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`412`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
