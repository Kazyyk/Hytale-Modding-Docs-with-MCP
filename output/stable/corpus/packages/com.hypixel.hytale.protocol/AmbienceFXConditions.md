# AmbienceFXConditions

Type: class | Package: com.hypixel.hytale.protocol

public class AmbienceFXConditions

Defines the environmental conditions that must be met for an ambience effect to activate. Supports filtering by environment, weather, fluid, altitude, light levels, time of day, and surrounding block types.

## Fields

- boolean never
- int``[] environmentIndices
- int``[] weatherIndices
- int``[] fluidFXIndices
- int environmentTagPatternIndex
- int weatherTagPatternIndex
- AmbienceFXBlockSoundSet`[] surroundingBlockSoundSets
- Range altitude
- Rangeb walls
- boolean roof
- int roofMaterialTagPatternIndex
- boolean floor
- Rangeb sunLightLevel
- Rangeb torchLightLevel
- Rangeb globalLightLevel
- Rangef dayTime

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 41
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 57
- MAX_SIZE | 102,400,077

Binary layout: 2 null-bit bytes + 41 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AmbienceFXConditions deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AmbienceFXConditions` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AmbienceFXConditions` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AmbienceFXConditions` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AmbienceFX
- AmbienceFXBlockSoundSet
