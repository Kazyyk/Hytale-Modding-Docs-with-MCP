---
title: "DetailBox"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.DetailBox"
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
public class DetailBox
```

Defines a positioned bounding box used for detail collision or selection.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Vector3f](Vector3f.md) | `offset` | Yes |  |
| [Hitbox](Hitbox.md) | `box` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 37 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 37 |
| `MAX_SIZE` | 37 |

Binary layout: 1 null-bit byte + 37 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static DetailBox deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `DetailBox` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `DetailBox` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `DetailBox` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Hitbox](Hitbox.md)
