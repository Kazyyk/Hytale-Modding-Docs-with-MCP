---
title: "InteractionCamera"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionCamera"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "interaction"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class InteractionCamera
```

Defines a camera keyframe within an interaction sequence, with time, position, and rotation.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `time` | No |  |
| [Vector3f](Vector3f.md) | `position` | Yes |  |
| [Direction](Direction.md) | `rotation` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 29 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 29 |
| `MAX_SIZE` | 29 |

Binary layout: 1 null-bit byte + 29 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InteractionCamera deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InteractionCamera` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InteractionCamera` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InteractionCamera` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Direction](Direction.md)
- [InteractionCameraSettings](InteractionCameraSettings.md)
