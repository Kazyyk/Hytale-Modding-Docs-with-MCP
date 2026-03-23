---
title: "Vector3d"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Vector3d"
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
public class Vector3d
```

Protocol data structure in the Spatial/Math Primitives group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `double` | `x` | No | |
| `double` | `y` | No | |
| `double` | `z` | No | |

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
public static Vector3d deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Vector3d` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Vector3d` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Vector3d` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
