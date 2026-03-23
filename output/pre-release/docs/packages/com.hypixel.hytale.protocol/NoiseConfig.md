---
title: "NoiseConfig"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.NoiseConfig"
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
public class NoiseConfig
```

Protocol data structure in the World/Environment group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `seed` | No | |
| [NoiseType](NoiseType.md) | `type` | No | Default: `NoiseType.Sin`. |
| `float` | `frequency` | No | |
| `float` | `amplitude` | No | |
| [ClampConfig](ClampConfig.md) | `clamp` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 23 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 23 |
| `MAX_SIZE` | 23 |

Binary layout: 1 null-bit byte + 23 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static NoiseConfig deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `NoiseConfig` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `NoiseConfig` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `NoiseConfig` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ClampConfig](ClampConfig.md)
- [NoiseType](NoiseType.md)
