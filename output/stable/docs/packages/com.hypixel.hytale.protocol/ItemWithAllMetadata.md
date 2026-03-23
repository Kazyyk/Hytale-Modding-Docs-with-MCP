---
title: "ItemWithAllMetadata"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemWithAllMetadata"
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
public class ItemWithAllMetadata
```

Pairs an item ID with arbitrary metadata string. Used in inventory slots and equipment references.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `itemId` | No |  Default: `""`. |
| `int` | `quantity` | No |  |
| `double` | `durability` | No |  |
| `double` | `maxDurability` | No |  |
| `boolean` | `overrideDroppedItemAnimation` | No |  |
| `String` | `metadata` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 22 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 30 |
| `MAX_SIZE` | 32,768,040 |

Binary layout: 1 null-bit byte + 22 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemWithAllMetadata deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemWithAllMetadata` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemWithAllMetadata` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemWithAllMetadata` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemUpdate](ItemUpdate.md)
- [InventorySection](InventorySection.md)
- [Equipment](Equipment.md)
