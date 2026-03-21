---
title: "LongParamValue"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.LongParamValue"
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
public class LongParamValue extends ParamValue
```

A typed parameter value that extends `ParamValue`. Part of the parameter system (type ID 4).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `long` | `value` | No | |

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
public static LongParamValue deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `LongParamValue` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `LongParamValue` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `LongParamValue` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ParamValue](ParamValue.md)
