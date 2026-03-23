# FormattedMessage

Type: class | Package: com.hypixel.hytale.protocol

public class FormattedMessage

Rich text message with recursive children, color, bold/italic/monospace/underlined formatting, and hyperlink support. Used for chat and UI text.

## Fields

- String rawText
- String messageId
- FormattedMessage`[] children
- Map<``String``, `ParamValue`> params
- Map<``String``, `FormattedMessage`> messageParams
- String color
- MaybeBool bold
- MaybeBool italic
- MaybeBool monospace
- MaybeBool underlined
- String link
- boolean markupEnabled

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 7
- VARIABLE_BLOCK_START | 34
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FormattedMessage deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FormattedMessage` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FormattedMessage` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FormattedMessage` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static FormattedMessage deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public FormattedMessage clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String rawText
public String messageId
public FormattedMessage[] children
public Map<String,ParamValue> params
public Map<String,FormattedMessage> messageParams
public String color
public MaybeBool bold
public MaybeBool italic
public MaybeBool monospace
public MaybeBool underlined
public String link
public boolean markupEnabled
public FormattedMessageImage image
