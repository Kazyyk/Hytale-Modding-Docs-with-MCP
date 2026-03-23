---
title: "ItemQuality"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemQuality"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "item"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ItemQuality
```

Defines an item quality tier with visual styling (tooltip texture, text color, localization).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `String` | `itemTooltipTexture` | Yes |  |
| `String` | `itemTooltipArrowTexture` | Yes |  |
| `String` | `slotTexture` | Yes |  |
| `String` | `blockSlotTexture` | Yes |  |
| `String` | `specialSlotTexture` | Yes |  |
| [Color](Color.md) | `textColor` | Yes |  |
| `String` | `localizationKey` | Yes |  |
| `boolean` | `visibleQualityLabel` | No |  |
| `boolean` | `renderSpecialSlot` | No |  |
| `boolean` | `hideFromSearch` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 7 |
| `VARIABLE_FIELD_COUNT` | 7 |
| `VARIABLE_BLOCK_START` | 35 |
| `MAX_SIZE` | 114,688,070 |

Binary layout: 1 null-bit byte + 7 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemQuality deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemQuality` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemQuality` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemQuality` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
