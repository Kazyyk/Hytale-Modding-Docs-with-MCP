# CameraInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class CameraInteraction extends SimpleInteraction

Protocol data type in the Hytale client-server protocol.

## Fields

- CameraActionType cameraAction
- CameraPerspectiveType cameraPerspective
- boolean cameraPersist
- float cameraInteractionTime

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 26
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 46
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 26 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static CameraInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `CameraInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `CameraInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `CameraInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
