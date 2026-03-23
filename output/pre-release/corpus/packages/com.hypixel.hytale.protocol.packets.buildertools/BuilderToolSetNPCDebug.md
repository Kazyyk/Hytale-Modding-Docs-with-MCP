# BuilderToolSetNPCDebug

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolSetNPCDebug implements Packet, ToServerPacket

Toggles NPC debug mode for a specific entity.

## Packet Info

- Packet ID | 422
- Direction | client-to-server
- Channel | Default

## Fields

- entityId | int
- debugEnabled | boolean

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSetNPCDebug | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`422`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
