# BuilderToolArgUpdate

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolArgUpdate implements Packet, ToServerPacket

Updates a builder tool argument value by token, section, slot, and group.

## Packet Info

- Packet ID | 400
- Direction | client-to-server
- Channel | Default

## Fields

- token | int
- section | int
- slot | int
- group | BuilderToolArgGroup
- id | String
- value | String

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolArgUpdate | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`400`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default
