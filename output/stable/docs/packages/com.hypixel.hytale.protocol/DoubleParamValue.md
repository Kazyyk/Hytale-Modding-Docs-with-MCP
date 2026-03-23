---
title: "DoubleParamValue"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.DoubleParamValue"
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
public class DoubleParamValue extends ParamValue
```

A typed parameter value (type ID 2) carrying a double-precision float.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `double` | `value` | No |  |

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
public static DoubleParamValue deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `DoubleParamValue` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `DoubleParamValue` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `DoubleParamValue` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BoolParamValue](BoolParamValue.md)
- [IntParamValue](IntParamValue.md)
