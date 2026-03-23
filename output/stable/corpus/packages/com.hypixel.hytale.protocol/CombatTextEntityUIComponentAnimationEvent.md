# CombatTextEntityUIComponentAnimationEvent

Type: class | Package: com.hypixel.hytale.protocol

public class CombatTextEntityUIComponentAnimationEvent

Defines a single animation keyframe for combat text display, including timing, scale, position offset, and opacity.

## Fields

- CombatTextEntityUIAnimationEventType type
- float startAt
- float endAt
- float startScale
- float endScale
- Vector2f positionOffset
- float startOpacity
- float endOpacity

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 34
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 34
- MAX_SIZE | 34

Binary layout: 1 null-bit byte + 34 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static CombatTextEntityUIComponentAnimationEvent deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `CombatTextEntityUIComponentAnimationEvent` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `CombatTextEntityUIComponentAnimationEvent` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `CombatTextEntityUIComponentAnimationEvent` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- CombatTextEntityUIAnimationEventType
- EntityUIComponent
