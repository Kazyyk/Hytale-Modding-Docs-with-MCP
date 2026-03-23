# HitboxCollisionConfig

Type: class | Package: com.hypixel.hytale.protocol

public class HitboxCollisionConfig

Configuration for hitbox-based collision detection behavior.

## Fields

- CollisionType collisionType
- float softCollisionOffsetRatio

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 5

Binary layout: 5 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static HitboxCollisionConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `HitboxCollisionConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `HitboxCollisionConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `HitboxCollisionConfig` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Hitbox
- HitboxCollisionUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static HitboxCollisionConfig deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public HitboxCollisionConfig clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public CollisionType collisionType
public float softCollisionOffsetRatio
