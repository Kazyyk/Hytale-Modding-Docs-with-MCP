---
title: "StairConnectedBlockRuleSet"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.StairConnectedBlockRuleSet"
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
public class StairConnectedBlockRuleSet
```

Protocol data structure in the Block/Connected Block Rules group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `straightBlockId` | No | |
| `int` | `cornerLeftBlockId` | No | |
| `int` | `cornerRightBlockId` | No | |
| `int` | `invertedCornerLeftBlockId` | No | |
| `int` | `invertedCornerRightBlockId` | No | |
| `String` | `materialName` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 21 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 21 |
| `MAX_SIZE` | 16,384,026 |

Binary layout: 1 null-bit byte + 21 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static StairConnectedBlockRuleSet deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `StairConnectedBlockRuleSet` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `StairConnectedBlockRuleSet` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `StairConnectedBlockRuleSet` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
