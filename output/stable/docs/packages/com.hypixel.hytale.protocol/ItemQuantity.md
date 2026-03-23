---
title: "ItemQuantity"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemQuantity"
api_surface: true
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
public class ItemQuantity
```

Pairs an item ID with a quantity count. Used in recipes, drops, and inventory operations.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `itemId` | Yes |  |
| `int` | `quantity` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 5 |
| `MAX_SIZE` | 16,384,010 |

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemQuantity deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemQuantity` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemQuantity` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemQuantity` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [CraftingRecipe](CraftingRecipe.md)
- [ExtraResources](ExtraResources.md)
