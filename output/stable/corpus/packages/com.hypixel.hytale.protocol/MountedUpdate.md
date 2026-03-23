# MountedUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class MountedUpdate extends ComponentUpdate

An entity component update sent from server to client. Extends `ComponentUpdate` (type ID 22).

## Fields

- int mountedToEntity
- Vector3f attachmentOffset
- MountController controller
- BlockMount block

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 48
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 48
- MAX_SIZE | 48

Binary layout: 1 null-bit byte + 48 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MountedUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MountedUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MountedUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `MountedUpdate` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockMount
- ComponentUpdate
- MountController
- Vector3f
