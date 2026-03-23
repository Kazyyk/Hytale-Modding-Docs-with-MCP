---
title: "ConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ConditionInteraction"
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
public class ConditionInteraction extends SimpleInteraction
```

An interaction (type ID 12) that checks player state conditions (game mode, jumping, swimming, crouching, running, flying). Extends SimpleInteraction.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [GameMode](GameMode.md) | `requiredGameMode` | Yes |  |
| `Boolean` | `jumping` | Yes |  |
| `Boolean` | `swimming` | Yes |  |
| `Boolean` | `crouching` | Yes |  |
| `Boolean` | `running` | Yes |  |
| `Boolean` | `flying` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 26 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 46 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 2 null-bit bytes + 26 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ConditionInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ConditionInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ConditionInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [GameMode](GameMode.md)
- [Interaction](Interaction.md)
