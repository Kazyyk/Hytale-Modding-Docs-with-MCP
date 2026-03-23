---
title: "BlockConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockConditionInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
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
public class BlockConditionInteraction extends SimpleBlockInteraction
```

An interaction (type ID 14) that checks conditions against targeted blocks using block matchers. Extends SimpleBlockInteraction.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [BlockMatcher](BlockMatcher.md)`[]` | `matchers` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 20 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 44 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockConditionInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockConditionInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockConditionInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockMatcher](BlockMatcher.md)
- [Interaction](Interaction.md)
