---
title: "WorldInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.WorldInteraction"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class WorldInteraction
```

Protocol data structure in the World/Environment group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `entityId` | No | |
| [BlockPosition](BlockPosition.md) | `blockPosition` | Yes | |
| [BlockRotation](BlockRotation.md) | `blockRotation` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 20 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 20 |
| `MAX_SIZE` | 20 |

Binary layout: 1 null-bit byte + 20 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static WorldInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `WorldInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `WorldInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `WorldInteraction` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockPosition](BlockPosition.md)
- [BlockRotation](BlockRotation.md)
