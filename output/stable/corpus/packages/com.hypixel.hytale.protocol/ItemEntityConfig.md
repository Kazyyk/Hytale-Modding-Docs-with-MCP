# ItemEntityConfig

Type: class | Package: com.hypixel.hytale.protocol

public class ItemEntityConfig

Visual configuration for an item when it exists as a world entity (dropped item).

## Fields

- String particleSystemId
- Color particleColor
- boolean showItemParticles

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 16,384,010

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemEntityConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemEntityConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemEntityConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemEntityConfig` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color
- ItemBase

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static ItemEntityConfig deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ItemEntityConfig clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String particleSystemId
public Color particleColor
public boolean showItemParticles
