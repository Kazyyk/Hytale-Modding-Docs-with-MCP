# ModelVFX

Type: class | Package: com.hypixel.hytale.protocol

public class ModelVFX

Protocol data structure in the Model/Rendering group.

## Fields

- String id
- SwitchTo switchTo
- EffectDirection effectDirection
- float animationDuration
- Vector2f animationRange
- LoopOption loopOption
- CurveType curveType
- Color highlightColor
- float highlightThickness
- boolean useBloomOnHighlight
- boolean useProgessiveHighlight
- Vector2f noiseScale
- Vector2f noiseScrollSpeed
- Color postColor
- float postColorOpacity

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 49
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 49
- MAX_SIZE | 16,384,054

Binary layout: 1 null-bit byte + 49 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ModelVFX deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ModelVFX` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ModelVFX` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ModelVFX` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color
- CurveType
- EffectDirection
- LoopOption
- SwitchTo
- Vector2f
