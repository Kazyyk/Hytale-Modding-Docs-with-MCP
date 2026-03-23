---
title: "ForkedChainId"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ForkedChainId"
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
public class ForkedChainId
```

Recursive identifier for forked interaction chains, enabling nested chain branching.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `entryIndex` | No |  |
| `int` | `subIndex` | No |  |
| [ForkedChainId](ForkedChainId.md) | `forkedId` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 1,033 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ForkedChainId deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ForkedChainId` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ForkedChainId` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ForkedChainId` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [InteractionChainData](InteractionChainData.md)
- [ChainingInteraction](ChainingInteraction.md)
