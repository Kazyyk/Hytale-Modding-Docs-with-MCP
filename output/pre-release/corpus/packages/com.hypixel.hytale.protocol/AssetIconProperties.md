# AssetIconProperties

Type: class | Package: com.hypixel.hytale.protocol

public class AssetIconProperties

Defines visual transformation properties for rendering an asset as an icon, including scale, translation, and rotation.

## Fields

- float scale
- Vector2f translation
- Vector3f rotation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 25
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 25
- MAX_SIZE | 25

Binary layout: 1 null-bit byte + 25 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetIconProperties deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetIconProperties` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetIconProperties` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetIconProperties` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Asset
- ItemBase

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static AssetIconProperties deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AssetIconProperties clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float scale
public Vector2f translation
public Vector3f rotation
