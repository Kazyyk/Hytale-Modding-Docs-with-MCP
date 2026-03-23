# RootInteraction

Type: class | Package: com.hypixel.hytale.protocol

public class RootInteraction

Top-level interaction entry point (not in Interaction hierarchy)

## Fields

- String id
- int``[] interactions
- InteractionCooldown cooldown
- Map<`GameMode`, `RootInteractionSettings`> settings
- InteractionRules rules
- int``[] tags
- float clickQueuingTimeout
- boolean requireNewClick

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 30
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RootInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RootInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RootInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RootInteraction` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- GameMode
- InteractionCooldown
- InteractionRules
- RootInteractionSettings

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static RootInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public RootInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public int[] interactions
public InteractionCooldown cooldown
public Map<GameMode,RootInteractionSettings> settings
public InteractionRules rules
public int[] tags
public float clickQueuingTimeout
public boolean requireNewClick
