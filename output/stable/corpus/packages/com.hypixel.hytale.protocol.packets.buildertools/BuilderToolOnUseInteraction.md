# BuilderToolOnUseInteraction

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolOnUseInteraction implements Packet, ToServerPacket

Sent when the player uses a builder tool interaction at a block position. Includes interaction type, position, paint mode offsets, and modifier key states.

## Packet Info

- Packet ID | 413
- Direction | client-to-server
- Channel | Default

## Fields

- type | InteractionType
- x | int
- y | int
- z | int
- offsetForPaintModeX | int
- offsetForPaintModeY | int
- offsetForPaintModeZ | int
- isAltPlaySculptBrushModDown | boolean
- isHoldDownInteraction | boolean
- isDoServerRaytraceForPosition | boolean

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolOnUseInteraction | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`413`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
