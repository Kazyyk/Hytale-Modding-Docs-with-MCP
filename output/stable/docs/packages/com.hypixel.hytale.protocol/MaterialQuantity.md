---
title: "MaterialQuantity"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MaterialQuantity"
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
public class MaterialQuantity
```

Protocol data structure in the Block/Connected Block Rules group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `itemId` | Yes | |
| `int` | `itemTag` | No | |
| `String` | `resourceTypeId` | Yes | |
| `int` | `quantity` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 17 |
| `MAX_SIZE` | 32,768,027 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static MaterialQuantity deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `MaterialQuantity` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `MaterialQuantity` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `MaterialQuantity` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
