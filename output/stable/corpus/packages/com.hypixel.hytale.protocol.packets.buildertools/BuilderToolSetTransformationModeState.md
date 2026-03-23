# BuilderToolSetTransformationModeState

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolSetTransformationModeState implements Packet, ToServerPacket

Sets transformation mode state for the builder tool.

## Packet Info

- Packet ID | 420
- Direction | client-to-server
- Channel | Default

## Fields

- enabled | boolean

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSetTransformationModeState | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`420`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
