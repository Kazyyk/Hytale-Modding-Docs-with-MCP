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
