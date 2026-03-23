# Animation

Type: class | Package: com.hypixel.hytale.protocol

public class Animation

Defines a single animation with playback parameters including speed, blending, looping, weight, and associated sound/footstep events.

## Fields

- String name
- float speed
- float blendingDuration
- boolean looping
- float weight
- int``[] footstepIntervals
- int soundEventIndex
- int passiveLoopCount

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 22
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 30
- MAX_SIZE | 32,768,040

Binary layout: 1 null-bit byte + 22 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Animation deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Animation` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Animation` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Animation` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AnimationSet
- AnimationSlot
