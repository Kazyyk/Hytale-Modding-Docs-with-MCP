# HitEntity

Type: class | Package: com.hypixel.hytale.protocol

public class HitEntity

Defines entity hit resolution with a next-interaction branch and entity matchers for targeting.

## Fields

- int next
- EntityMatcher`[] matchers

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 8,192,010

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static HitEntity deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `HitEntity` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `HitEntity` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `HitEntity` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EntityMatcher
- DamageEntityInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static HitEntity deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public HitEntity clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int next
public EntityMatcher[] matchers
