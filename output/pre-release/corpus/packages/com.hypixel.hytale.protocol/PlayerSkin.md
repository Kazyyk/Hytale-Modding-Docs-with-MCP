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

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static PlayerSkin deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public PlayerSkin clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String bodyCharacteristic
public String underwear
public String face
public String eyes
public String ears
public String mouth
public String facialHair
public String haircut
public String eyebrows
public String pants
public String overpants
public String undertop
public String overtop
public String shoes
public String headAccessory
public String faceAccessory
public String earAccessory
public String skinFeature
public String gloves
public String cape
