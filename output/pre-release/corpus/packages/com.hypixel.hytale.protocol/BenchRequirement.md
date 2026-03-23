# BenchRequirement

Type: class | Package: com.hypixel.hytale.protocol

public class BenchRequirement

Specifies the bench type, identifier, categories, and minimum tier level required to craft a recipe.

## Fields

- BenchType type
- String id
- String``[] categories
- int requiredTierLevel

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 14
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BenchRequirement deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BenchRequirement` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BenchRequirement` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BenchRequirement` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BenchType
- CraftingRecipe
