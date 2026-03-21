---
title: "Direction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Direction"
api_surface: true
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
public class Direction
```

Euler angle rotation with yaw, pitch, and roll components in floating point.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `yaw` | No |  |
| `float` | `pitch` | No |  |
| `float` | `roll` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 12 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 12 |
| `MAX_SIZE` | 12 |

Binary layout: 12 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Direction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Direction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Direction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Direction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockPosition](BlockPosition.md)
- [InteractionCamera](InteractionCamera.md)
- [InteractionSyncData](InteractionSyncData.md)
