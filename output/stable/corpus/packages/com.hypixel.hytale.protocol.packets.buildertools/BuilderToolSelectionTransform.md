# BuilderToolSelectionTransform

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolSelectionTransform implements Packet, ToServerPacket

Applies a transform (rotation and translation) to the current selection.

## Packet Info

- Packet ID | 405
- Direction | client-to-server
- Channel | Default

## Fields

- rotation | Quatf
- translationOffset | BlockPosition
- initialSelectionMin | BlockPosition
- initialSelectionMax | BlockPosition

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSelectionTransform | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`405`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
