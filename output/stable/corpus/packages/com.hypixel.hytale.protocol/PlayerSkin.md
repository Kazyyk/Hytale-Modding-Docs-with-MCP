# PlayerSkin

Type: class | Package: com.hypixel.hytale.protocol

public class PlayerSkin

Protocol data structure in the Model/Rendering group.

## Fields

- String bodyCharacteristic
- String underwear
- String face
- String eyes
- String ears
- String mouth
- String facialHair
- String haircut
- String eyebrows
- String pants
- String overpants
- String undertop
- String overtop
- String shoes
- String headAccessory
- String faceAccessory
- String earAccessory
- String skinFeature
- String gloves
- String cape

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 3
- FIXED_BLOCK_SIZE | 3
- VARIABLE_FIELD_COUNT | 20
- VARIABLE_BLOCK_START | 83
- MAX_SIZE | 327,680,183

Binary layout: 3 null-bit bytes + 3 bytes of fixed fields + 20 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static PlayerSkin deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `PlayerSkin` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `PlayerSkin` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `PlayerSkin` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
