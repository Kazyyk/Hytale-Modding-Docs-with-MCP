---
title: "IntParamValue"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.IntParamValue"
api_surface: false
extends: "ParamValue"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "param-value"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class IntParamValue extends ParamValue
```

A typed parameter value (type ID 3) carrying an integer.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `value` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 4 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 4 |
| `MAX_SIZE` | 4 |

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static IntParamValue deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `IntParamValue` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `IntParamValue` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `IntParamValue` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BoolParamValue](BoolParamValue.md)
- [DoubleParamValue](DoubleParamValue.md)
