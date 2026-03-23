# SetServerCamera

Type: class | Package: com.hypixel.hytale.protocol.packets.camera | Implements: Packet, ToClientPacket

public class SetServerCamera implements Packet, ToClientPacket

Implementation of `Packet, ToClientPacket`.

## Fields

- PACKET_ID | int | Static final int field.
- IS_COMPRESSED | boolean | Static final boolean field.
- NULLABLE_BIT_FIELD_SIZE | int | Static final int field.
- FIXED_BLOCK_SIZE | int | Static final int field.
- VARIABLE_FIELD_COUNT | int | Static final int field.
- VARIABLE_BLOCK_START | int | Static final int field.
- MAX_SIZE | int | Static final int field.
- clientCameraView | ClientCameraView | ClientCameraView field.
- isLocked | boolean | boolean field.
- cameraSettings | ServerCameraSettings | ServerCameraSettings field.

## Constructors

- SetServerCamera() | Creates a new SetServerCamera instance.
- SetServerCamera(@Nonnull ClientCameraView clientCameraView, boolean isLocked, @Nullable ServerCameraSettings cameraSettings) | Creates a new SetServerCamera instance.
- SetServerCamera(@Nonnull SetServerCamera other) | Creates a new SetServerCamera instance.

## Methods

- getId() | int | public method.
- getChannel() | NetworkChannel | public method.
- deserialize(@Nonnull ByteBuf buf, int offset) | SetServerCamera | static public method.
- computeBytesConsumed(@Nonnull ByteBuf buf, int offset) | int | static public method.
- serialize(@Nonnull ByteBuf buf) | void | public method.
- computeSize() | int | public method.
- validateStructure(@Nonnull ByteBuf buffer, int offset) | ValidationResult | static public method.
- clone() | SetServerCamera | public method.
- equals(Object obj) | boolean | public method.
- hashCode() | int | public method.
