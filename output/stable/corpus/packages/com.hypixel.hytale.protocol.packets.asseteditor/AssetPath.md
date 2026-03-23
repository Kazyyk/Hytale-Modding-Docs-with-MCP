# AssetPath

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class AssetPath

Represents a path to an asset, consisting of a pack identifier and relative path.

## Fields

- String pack
- String path

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 32,768,019

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetPath deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetPath` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetPath` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetPath` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
