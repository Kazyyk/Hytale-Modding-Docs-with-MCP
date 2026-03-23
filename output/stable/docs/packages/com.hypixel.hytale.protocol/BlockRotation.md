---
title: "BlockRotation"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockRotation"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "block"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class BlockRotation
```

Defines the rotation state of a placed block around yaw, pitch, and roll axes.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Rotation](Rotation.md) | `rotationYaw` | No |  Default: `Rotation.None`. |
| [Rotation](Rotation.md) | `rotationPitch` | No |  Default: `Rotation.None`. |
| [Rotation](Rotation.md) | `rotationRoll` | No |  Default: `Rotation.None`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 3 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 3 |
| `MAX_SIZE` | 3 |

Binary layout: 3 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockRotation deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockRotation` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockRotation` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockRotation` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockType](BlockType.md)
