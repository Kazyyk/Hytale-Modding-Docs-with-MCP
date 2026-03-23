# NameplateUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class NameplateUpdate extends ComponentUpdate

An entity component update sent from server to client. Extends `ComponentUpdate` (type ID 0).

## Fields

- String text

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 16,384,005

Binary layout: 0 null-bit byte + 0 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static NameplateUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `NameplateUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `NameplateUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `NameplateUpdate` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static NameplateUpdate deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public NameplateUpdate clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String text
