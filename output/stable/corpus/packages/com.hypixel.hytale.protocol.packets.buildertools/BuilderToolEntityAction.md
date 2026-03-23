# BuilderToolEntityAction

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolEntityAction implements Packet, ToServerPacket

Sends an entity tool action (remove, duplicate, copy) for a specific entity.

## Packet Info

- Packet ID | 401
- Direction | client-to-server
- Channel | Default

## Fields

- entityId | int
- action | EntityToolAction

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolEntityAction | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`401`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
