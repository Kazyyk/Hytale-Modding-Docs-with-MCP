---
title: "FloatRange"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FloatRange"
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
public class FloatRange
```

Defines an inclusive floating-point range with min and max bounds.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `inclusiveMin` | No |  |
| `float` | `inclusiveMax` | No |  |

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
public static FloatRange deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `FloatRange` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `FloatRange` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `FloatRange` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ClampConfig](ClampConfig.md)
