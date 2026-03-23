# Trail

Type: class | Package: com.hypixel.hytale.protocol

public class Trail

Protocol data structure in the Particle/VFX System group.

## Fields

- String id
- String texture
- int lifeSpan
- float roll
- Edge start
- Edge end
- float lightInfluence
- FXRenderMode renderMode
- IntersectionHighlight intersectionHighlight
- boolean smooth
- Vector2i frameSize
- Range frameRange
- int frameLifeSpan

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 61
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 69
- MAX_SIZE | 32,768,079

Binary layout: 1 null-bit byte + 61 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Trail deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Trail` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Trail` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Trail` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Edge
- FXRenderMode
- IntersectionHighlight
- Range
- Vector2i

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static Trail deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public Trail clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public String texture
public int lifeSpan
public float roll
public Edge start
public Edge end
public float lightInfluence
public FXRenderMode renderMode
public IntersectionHighlight intersectionHighlight
public boolean smooth
public Vector2i frameSize
public Range frameRange
public int frameLifeSpan
