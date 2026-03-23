---
title: "Tint"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Tint"
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
public class Tint
```

Protocol data structure in the Model/Rendering group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `top` | No | |
| `int` | `bottom` | No | |
| `int` | `front` | No | |
| `int` | `back` | No | |
| `int` | `left` | No | |
| `int` | `right` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 24 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 24 |
| `MAX_SIZE` | 24 |

Binary layout: 24 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Tint deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Tint` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Tint` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Tint` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
