# RaycastSelector

Type: class | Package: com.hypixel.hytale.protocol | Extends: Selector

public class RaycastSelector extends Selector

A targeting selector that extends `Selector`. Part of the target-selection system (type ID 2).

## Fields

- Vector3f offset
- int distance
- int blockTagIndex
- boolean ignoreFluids
- boolean ignoreEmptyCollisionMaterial

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 23
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 23
- MAX_SIZE | 23

Binary layout: 1 null-bit byte + 23 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RaycastSelector deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RaycastSelector` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RaycastSelector` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `RaycastSelector` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Selector
- Vector3f

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static RaycastSelector deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public RaycastSelector clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public Vector3f offset
public int distance
public int blockTagIndex
public boolean ignoreFluids
public boolean ignoreEmptyCollisionMaterial
