# EntityUIComponent

Type: class | Package: com.hypixel.hytale.protocol

public class EntityUIComponent

Defines an entity UI overlay component configuration for stat bars or combat text display.

## Fields

- EntityUIType type
- Vector2f hitboxOffset
- boolean unknown
- int entityStatIndex
- RangeVector2f combatTextRandomPositionOffsetRange
- float combatTextViewportMargin
- float combatTextDuration
- float combatTextHitAngleModifierStrength
- float combatTextFontSize
- Color combatTextColor
- CombatTextEntityUIComponentAnimationEvent`[] combatTextAnimationEvents

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 51
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 51
- MAX_SIZE | 139,264,056

Binary layout: 1 null-bit byte + 51 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityUIComponent deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityUIComponent` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityUIComponent` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityUIComponent` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EntityUIType
- CombatTextEntityUIComponentAnimationEvent

Known subclasses: CombatTextUIComponent, EntityStatUIComponent, Unknown

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static EntityUIComponent deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public EntityUIComponent clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public EntityUIType type
public Vector2f hitboxOffset
public boolean unknown
public int entityStatIndex
public RangeVector2f combatTextRandomPositionOffsetRange
public float combatTextViewportMargin
public float combatTextDuration
public float combatTextHitAngleModifierStrength
public float combatTextFontSize
public Color combatTextColor
public CombatTextEntityUIComponentAnimationEvent[] combatTextAnimationEvents
