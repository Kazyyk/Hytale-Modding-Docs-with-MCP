# DynamicLightUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class DynamicLightUpdate extends ComponentUpdate

A component update (type ID 13) that synchronizes an entity's dynamic light emission color and radius.

## Fields

- ColorLight dynamicLight

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 4
- MAX_SIZE | 4

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static DynamicLightUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `DynamicLightUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `DynamicLightUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `DynamicLightUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ColorLight
- ComponentUpdate
- EntityUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static DynamicLightUpdate deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public DynamicLightUpdate clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public ColorLight dynamicLight
