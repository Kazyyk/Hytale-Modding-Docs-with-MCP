---
title: "Equipment"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Equipment"
api_surface: false
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
public class Equipment
```

Carries an entity's visible equipment: armor slots and held items.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String``[]` | `armorIds` | Yes |  |
| `String` | `rightHandItemId` | Yes |  |
| `String` | `leftHandItemId` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Equipment deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Equipment` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Equipment` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Equipment` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EquipmentUpdate](EquipmentUpdate.md)
- [ItemWithAllMetadata](ItemWithAllMetadata.md)
