---
title: "HalfFloatPosition"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.HalfFloatPosition"
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
public class HalfFloatPosition
```

Compact 3D position using 16-bit half-float precision for bandwidth-efficient transmission.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `short` | `x` | No |  |
| `short` | `y` | No |  |
| `short` | `z` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 6 |
| `MAX_SIZE` | 6 |

Binary layout: 6 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static HalfFloatPosition deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `HalfFloatPosition` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `HalfFloatPosition` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `HalfFloatPosition` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
