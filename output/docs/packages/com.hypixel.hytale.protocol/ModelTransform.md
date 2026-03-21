---
title: "ModelTransform"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ModelTransform"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "model"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ModelTransform
```

Protocol data structure in the Spatial/Math Primitives group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Position](Position.md) | `position` | Yes | |
| [Direction](Direction.md) | `bodyOrientation` | Yes | |
| [Direction](Direction.md) | `lookOrientation` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 49 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 49 |
| `MAX_SIZE` | 49 |

Binary layout: 1 null-bit byte + 49 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ModelTransform deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ModelTransform` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ModelTransform` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ModelTransform` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Direction](Direction.md)
- [Position](Position.md)
