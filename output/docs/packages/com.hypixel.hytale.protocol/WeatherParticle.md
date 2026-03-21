---
title: "WeatherParticle"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.WeatherParticle"
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
public class WeatherParticle
```

Protocol data structure in the World/Environment group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `systemId` | Yes | |
| [Color](Color.md) | `color` | Yes | |
| `float` | `scale` | No | |
| `boolean` | `isOvergroundOnly` | No | |
| `float` | `positionOffsetMultiplier` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 13 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 16,384,018 |

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static WeatherParticle deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `WeatherParticle` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `WeatherParticle` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `WeatherParticle` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
