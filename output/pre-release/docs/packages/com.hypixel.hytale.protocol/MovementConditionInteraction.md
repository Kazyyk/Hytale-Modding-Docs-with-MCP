---
title: "MovementConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MovementConditionInteraction"
api_surface: false
extends: "SimpleInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "interaction"
  - "movement"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class MovementConditionInteraction extends SimpleInteraction
```

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 15).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `forward` | No | |
| `int` | `back` | No | |
| `int` | `left` | No | |
| `int` | `right` | No | |
| `int` | `forwardLeft` | No | |
| `int` | `forwardRight` | No | |
| `int` | `backLeft` | No | |
| `int` | `backRight` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 51 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 71 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 51 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static MovementConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `MovementConditionInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `MovementConditionInteraction` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `MovementConditionInteraction` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Interaction](Interaction.md)
- [SimpleInteraction](SimpleInteraction.md)
