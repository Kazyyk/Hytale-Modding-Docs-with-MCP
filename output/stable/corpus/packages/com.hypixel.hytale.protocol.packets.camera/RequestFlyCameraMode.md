# RequestFlyCameraMode

Type: class | Package: com.hypixel.hytale.protocol.packets.camera | Implements: Packet, ToServerPacket

public class RequestFlyCameraMode implements Packet, ToServerPacket

Implementation of `Packet, ToServerPacket`.

## Fields

- PACKET_ID | int | Static final int field.
- IS_COMPRESSED | boolean | Static final boolean field.
- NULLABLE_BIT_FIELD_SIZE | int | Static final int field.
- FIXED_BLOCK_SIZE | int | Static final int field.
- VARIABLE_FIELD_COUNT | int | Static final int field.
- VARIABLE_BLOCK_START | int | Static final int field.
- MAX_SIZE | int | Static final int field.
- entering | boolean | boolean field.

## Constructors

- RequestFlyCameraMode() | Creates a new RequestFlyCameraMode instance.
- RequestFlyCameraMode(boolean entering) | Creates a new RequestFlyCameraMode instance.
- RequestFlyCameraMode(@Nonnull RequestFlyCameraMode other) | Creates a new RequestFlyCameraMode instance.

## Methods

- getId() | int | public method.
- getChannel() | NetworkChannel | public method.
- deserialize(@Nonnull ByteBuf buf, int offset) | RequestFlyCameraMode | static public method.
- computeBytesConsumed(@Nonnull ByteBuf buf, int offset) | int | static public method.
- serialize(@Nonnull ByteBuf buf) | void | public method.
- computeSize() | int | public method.
- validateStructure(@Nonnull ByteBuf buffer, int offset) | ValidationResult | static public method.
- clone() | RequestFlyCameraMode | public method.
- equals(Object obj) | boolean | public method.
- hashCode() | int | public method.
