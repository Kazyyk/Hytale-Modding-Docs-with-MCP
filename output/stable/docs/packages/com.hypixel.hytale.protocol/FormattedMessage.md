---
title: "FormattedMessage"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FormattedMessage"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class FormattedMessage
```

Rich text message with recursive children, color, bold/italic/monospace/underlined formatting, and hyperlink support. Used for chat and UI text.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `rawText` | Yes |  |
| `String` | `messageId` | Yes |  |
| [FormattedMessage](FormattedMessage.md)`[]` | `children` | Yes |  |
| `Map<``String``, `[ParamValue](ParamValue.md)`>` | `params` | Yes |  |
| `Map<``String``, `[FormattedMessage](FormattedMessage.md)`>` | `messageParams` | Yes |  |
| `String` | `color` | Yes |  |
| [MaybeBool](MaybeBool.md) | `bold` | No |  Default: `MaybeBool.Null`. |
| [MaybeBool](MaybeBool.md) | `italic` | No |  Default: `MaybeBool.Null`. |
| [MaybeBool](MaybeBool.md) | `monospace` | No |  Default: `MaybeBool.Null`. |
| [MaybeBool](MaybeBool.md) | `underlined` | No |  Default: `MaybeBool.Null`. |
| `String` | `link` | Yes |  |
| `boolean` | `markupEnabled` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 7 |
| `VARIABLE_BLOCK_START` | 34 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static FormattedMessage deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `FormattedMessage` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `FormattedMessage` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `FormattedMessage` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
