---
title: "Range"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Range"
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
public class Range
```

Protocol data structure in the Spatial/Math Primitives group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `min` | No | |
| `int` | `max` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 8 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 8 |
| `MAX_SIZE` | 8 |

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Range deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Range` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Range` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Range` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
