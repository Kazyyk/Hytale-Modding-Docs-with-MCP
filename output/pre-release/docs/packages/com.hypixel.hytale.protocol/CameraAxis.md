---
title: "CameraAxis"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CameraAxis"
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
public class CameraAxis
```

Defines constraints and target tracking for a single camera rotation axis, including angle range limits and node targets.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Rangef](Rangef.md) | `angleRange` | Yes |  |
| [CameraNode](CameraNode.md)`[]` | `targetNodes` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 4,096,014 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static CameraAxis deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `CameraAxis` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `CameraAxis` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `CameraAxis` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [CameraNode](CameraNode.md)
- [CameraSettings](CameraSettings.md)
