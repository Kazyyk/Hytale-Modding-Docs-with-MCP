---
title: "InventorySection"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InventorySection"
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
public class InventorySection
```

A section of an inventory containing items mapped by slot index with a defined capacity.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `Map<``Integer``, `[ItemWithAllMetadata](ItemWithAllMetadata.md)`>` | `items` | Yes |  |
| `short` | `capacity` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 3 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 3 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 3 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InventorySection deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InventorySection` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InventorySection` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InventorySection` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemWithAllMetadata](ItemWithAllMetadata.md)
