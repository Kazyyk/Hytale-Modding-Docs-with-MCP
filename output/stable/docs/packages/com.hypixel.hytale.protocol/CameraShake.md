---
title: "CameraShake"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CameraShake"
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
public class CameraShake
```

Defines camera shake effects with separate configurations for first-person and third-person views.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [CameraShakeConfig](CameraShakeConfig.md) | `firstPerson` | Yes |  |
| [CameraShakeConfig](CameraShakeConfig.md) | `thirdPerson` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 1,130,496,177 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static CameraShake deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `CameraShake` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `CameraShake` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `CameraShake` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [CameraShakeConfig](CameraShakeConfig.md)
