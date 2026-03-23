---
title: "WorldParticle"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.WorldParticle"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "particle"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class WorldParticle
```

Protocol data structure in the World/Environment group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `systemId` | Yes | |
| `float` | `scale` | No | |
| [Color](Color.md) | `color` | Yes | |
| [Vector3f](Vector3f.md) | `positionOffset` | Yes | |
| [Direction](Direction.md) | `rotationOffset` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 32 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 32 |
| `MAX_SIZE` | 16,384,037 |

Binary layout: 1 null-bit byte + 32 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static WorldParticle deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `WorldParticle` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `WorldParticle` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `WorldParticle` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
- [Direction](Direction.md)
- [Vector3f](Vector3f.md)
