---
title: "RoofConnectedBlockRuleSet"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.RoofConnectedBlockRuleSet"
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
public class RoofConnectedBlockRuleSet
```

Protocol data structure in the Block/Connected Block Rules group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [StairConnectedBlockRuleSet](StairConnectedBlockRuleSet.md) | `regular` | Yes | |
| [StairConnectedBlockRuleSet](StairConnectedBlockRuleSet.md) | `hollow` | Yes | |
| `int` | `topperBlockId` | No | |
| `int` | `width` | No | |
| `String` | `materialName` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 21 |
| `MAX_SIZE` | 49,152,078 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static RoofConnectedBlockRuleSet deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `RoofConnectedBlockRuleSet` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `RoofConnectedBlockRuleSet` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `RoofConnectedBlockRuleSet` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [StairConnectedBlockRuleSet](StairConnectedBlockRuleSet.md)
