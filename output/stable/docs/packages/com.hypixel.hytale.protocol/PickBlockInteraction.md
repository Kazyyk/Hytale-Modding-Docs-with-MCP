---
title: "PickBlockInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PickBlockInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "interaction"
  - "block"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class PickBlockInteraction extends SimpleBlockInteraction
```

A block-targeting interaction type that extends `SimpleBlockInteraction`. Part of the interaction/ability system (type ID 34).

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 20 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 40 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static PickBlockInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `PickBlockInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `PickBlockInteraction` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `PickBlockInteraction` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Interaction](Interaction.md)
- [SimpleBlockInteraction](SimpleBlockInteraction.md)
- [SimpleInteraction](SimpleInteraction.md)
