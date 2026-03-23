# Model

Type: class | Package: com.hypixel.hytale.protocol

public class Model

Protocol data structure in the Model/Rendering group.

## Fields

- String assetId
- String path
- String texture
- String gradientSet
- String gradientId
- CameraSettings camera
- float scale
- float eyeHeight
- float crouchOffset
- float sittingOffset
- float sleepingOffset
- Map<``String``, `AnimationSet`> animationSets
- ModelAttachment`[] attachments
- Hitbox hitbox
- ModelParticle`[] particles
- ModelTrail`[] trails
- ColorLight light
- Map<String, DetailBox[]> detailBoxes
- Phobia phobia
- Model phobiaModel

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 51
- VARIABLE_FIELD_COUNT | 12
- VARIABLE_BLOCK_START | 99
- MAX_SIZE | 1,677,721,600

Binary layout: 2 null-bit bytes + 51 bytes of fixed fields + 12 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Model deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Model` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Model` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Model` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AnimationSet
- CameraSettings
- ColorLight
- DetailBox
- Hitbox
- ModelAttachment
- ModelParticle
- ModelTrail
- Phobia
