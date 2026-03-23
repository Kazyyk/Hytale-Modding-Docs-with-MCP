---
title: "ChainFlagInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ChainFlagInteraction"
api_surface: false
extends: "SimpleInteraction"
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
public class ChainFlagInteraction extends SimpleInteraction
```

An interaction (type ID 37) that sets a flag on an interaction chain. Extends SimpleInteraction.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `chainId` | Yes |  |
| `String` | `flag` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 19 |
| `VARIABLE_FIELD_COUNT` | 7 |
| `VARIABLE_BLOCK_START` | 47 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 19 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ChainFlagInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ChainFlagInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ChainFlagInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ChainFlagInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ChainingInteraction](ChainingInteraction.md)
- [Interaction](Interaction.md)
