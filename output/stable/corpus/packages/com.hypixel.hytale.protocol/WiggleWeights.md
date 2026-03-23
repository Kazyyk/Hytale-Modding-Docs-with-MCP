# WiggleWeights

Type: class | Package: com.hypixel.hytale.protocol

public class WiggleWeights

Protocol data structure in the Camera/View group.

## Fields

- float x
- float xDeceleration
- float y
- float yDeceleration
- float z
- float zDeceleration
- float roll
- float rollDeceleration
- float pitch
- float pitchDeceleration

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 40
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 40
- MAX_SIZE | 40

Binary layout: 40 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static WiggleWeights deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `WiggleWeights` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `WiggleWeights` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `WiggleWeights` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static WiggleWeights deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public WiggleWeights clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float x
public float xDeceleration
public float y
public float yDeceleration
public float z
public float zDeceleration
public float roll
public float rollDeceleration
public float pitch
public float pitchDeceleration
