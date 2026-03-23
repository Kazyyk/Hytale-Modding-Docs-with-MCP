---
title: "CameraShakeConfig"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CameraShakeConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "camera"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class CameraShakeConfig
```

Detailed camera shake parameters including duration, timing, easing curves, and noise generators for offset and rotation.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `duration` | No |  |
| `float` | `startTime` | No |  |
| `boolean` | `continuous` | No |  |
| [EasingConfig](EasingConfig.md) | `easeIn` | Yes |  |
| [EasingConfig](EasingConfig.md) | `easeOut` | Yes |  |
| [OffsetNoise](OffsetNoise.md) | `offset` | Yes |  |
| [RotationNoise](RotationNoise.md) | `rotation` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 20 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 28 |
| `MAX_SIZE` | 565,248,084 |

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static CameraShakeConfig deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `CameraShakeConfig` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `CameraShakeConfig` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `CameraShakeConfig` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EasingConfig](EasingConfig.md)
- [CameraShake](CameraShake.md)
