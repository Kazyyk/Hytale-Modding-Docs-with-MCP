---
title: "StringParamValue"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.StringParamValue"
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
public class StringParamValue extends ParamValue
```

A typed parameter value that extends `ParamValue`. Part of the parameter system (type ID 0).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `value` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 1 |
| `MAX_SIZE` | 16,384,006 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static StringParamValue deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `StringParamValue` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `StringParamValue` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `StringParamValue` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ParamValue](ParamValue.md)
