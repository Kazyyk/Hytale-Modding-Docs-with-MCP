---
title: "CameraSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CameraSettings"
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
public class CameraSettings
```

Camera configuration with position offset and per-axis (yaw/pitch) rotation settings.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Vector3f](Vector3f.md) | `positionOffset` | Yes |  |
| [CameraAxis](CameraAxis.md) | `yaw` | Yes |  |
| [CameraAxis](CameraAxis.md) | `pitch` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 13 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 21 |
| `MAX_SIZE` | 8,192,049 |

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static CameraSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `CameraSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `CameraSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `CameraSettings` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [CameraAxis](CameraAxis.md)
- [ItemPlayerAnimations](ItemPlayerAnimations.md)
