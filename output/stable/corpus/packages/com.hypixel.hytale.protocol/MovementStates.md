# MovementStates

Type: class | Package: com.hypixel.hytale.protocol

public class MovementStates

Protocol data structure in the Movement/Physics group.

## Fields

- boolean idle
- boolean horizontalIdle
- boolean jumping
- boolean flying
- boolean walking
- boolean running
- boolean sprinting
- boolean crouching
- boolean forcedCrouching
- boolean falling
- boolean climbing
- boolean inFluid
- boolean swimming
- boolean swimJumping
- boolean onGround
- boolean mantling
- boolean sliding
- boolean mounting
- boolean rolling
- boolean sitting
- boolean gliding
- boolean sleeping

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 22
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 22
- MAX_SIZE | 22

Binary layout: 22 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MovementStates deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MovementStates` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MovementStates` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `MovementStates` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static MovementStates deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public MovementStates clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean idle
public boolean horizontalIdle
public boolean jumping
public boolean flying
public boolean walking
public boolean running
public boolean sprinting
public boolean crouching
public boolean forcedCrouching
public boolean falling
public boolean climbing
public boolean inFluid
public boolean swimming
public boolean swimJumping
public boolean onGround
public boolean mantling
public boolean sliding
public boolean mounting
public boolean rolling
public boolean sitting
public boolean gliding
public boolean sleeping
