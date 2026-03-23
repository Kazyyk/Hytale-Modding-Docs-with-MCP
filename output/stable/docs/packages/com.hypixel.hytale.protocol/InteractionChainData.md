---
title: "InteractionChainData"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.InteractionChainData"
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
public class InteractionChainData
```

Contextual data for interaction chain execution including proxy entity, hit location, block position, and hit normal.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `entityId` | No |  Default: `-1`. |
| `UUID` | `proxyId` | No |  Default: `new UUID(0L, 0L)`. |
| [Vector3f](Vector3f.md) | `hitLocation` | Yes |  |
| `String` | `hitDetail` | Yes |  |
| [BlockPosition](BlockPosition.md) | `blockPosition` | Yes |  |
| `int` | `targetSlot` | No |  Default: `Integer.MIN_VALUE`. |
| [Vector3f](Vector3f.md) | `hitNormal` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 61 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 61 |
| `MAX_SIZE` | 16,384,066 |

Binary layout: 1 null-bit byte + 61 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static InteractionChainData deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `InteractionChainData` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `InteractionChainData` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `InteractionChainData` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockPosition](BlockPosition.md)
- [ForkedChainId](ForkedChainId.md)
