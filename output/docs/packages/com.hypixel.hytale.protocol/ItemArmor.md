---
title: "ItemArmor"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemArmor"
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
public class ItemArmor
```

Armor-specific item configuration with slot assignment and cosmetic hiding rules.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [ItemArmorSlot](ItemArmorSlot.md) | `armorSlot` | No |  Default: `ItemArmorSlot.Head`. |
| [Cosmetic](Cosmetic.md)`[]` | `cosmeticsToHide` | Yes |  |
| `Map``<``Integer, Modifier[]``>` | `statModifiers` | Yes |  |
| `double` | `baseDamageResistance` | No |  |
| `Map``<``String, Modifier[]``>` | `damageResistance` | Yes |  |
| `Map``<``String, Modifier[]``>` | `damageEnhancement` | Yes |  |
| `Map``<``String, Modifier[]``>` | `damageClassEnhancement` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 10 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 30 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 10 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemArmor deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemArmor` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemArmor` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemArmor` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemArmorSlot](ItemArmorSlot.md)
- [Cosmetic](Cosmetic.md)
- [ItemBase](ItemBase.md)
