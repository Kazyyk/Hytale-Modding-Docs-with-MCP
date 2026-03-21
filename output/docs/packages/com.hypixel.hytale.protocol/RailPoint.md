---
title: "RailPoint"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RailPoint"
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
public class RailPoint
```

Protocol data structure in the Rail System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Vector3f](Vector3f.md) | `point` | Yes | |
| [Vector3f](Vector3f.md) | `normal` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 25 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 25 |
| `MAX_SIZE` | 25 |

Binary layout: 1 null-bit byte + 25 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static RailPoint deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `RailPoint` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `RailPoint` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `RailPoint` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Vector3f](Vector3f.md)
