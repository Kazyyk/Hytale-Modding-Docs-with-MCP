# SetFlyCameraMode

Type: class | Package: com.hypixel.hytale.protocol.packets.camera | Implements: Packet, ToClientPacket

public class SetFlyCameraMode implements Packet, ToClientPacket

Implementation of `Packet, ToClientPacket`.

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

- SetFlyCameraMode() | Creates a new SetFlyCameraMode instance.
- SetFlyCameraMode(boolean entering) | Creates a new SetFlyCameraMode instance.
- SetFlyCameraMode(@Nonnull SetFlyCameraMode other) | Creates a new SetFlyCameraMode instance.

## Methods

- getId() | int | public method.
- getChannel() | NetworkChannel | public method.
- deserialize(@Nonnull ByteBuf buf, int offset) | SetFlyCameraMode | static public method.
- computeBytesConsumed(@Nonnull ByteBuf buf, int offset) | int | static public method.
- serialize(@Nonnull ByteBuf buf) | void | public method.
- computeSize() | int | public method.
- validateStructure(@Nonnull ByteBuf buffer, int offset) | ValidationResult | static public method.
- clone() | SetFlyCameraMode | public method.
- equals(Object obj) | boolean | public method.
- hashCode() | int | public method.
