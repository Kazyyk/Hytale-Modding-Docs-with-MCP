---
title: "ChangeActiveSlotInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ChangeActiveSlotInteraction"
api_surface: false
extends: "Interaction"
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
public class ChangeActiveSlotInteraction extends Interaction
```

An interaction (type ID 24) that changes the player's active inventory slot. Extends Interaction directly.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `targetSlot` | No |  Default: `Integer.MIN_VALUE`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 15 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 35 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 15 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ChangeActiveSlotInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ChangeActiveSlotInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ChangeActiveSlotInteraction` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ChangeActiveSlotInteraction` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Interaction](Interaction.md)
