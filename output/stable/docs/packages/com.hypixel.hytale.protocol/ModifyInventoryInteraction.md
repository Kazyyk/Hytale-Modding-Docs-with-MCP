---
title: "ModifyInventoryInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ModifyInventoryInteraction"
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
public class ModifyInventoryInteraction extends SimpleInteraction
```

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 23).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [GameMode](GameMode.md) | `requiredGameMode` | Yes | |
| [ItemWithAllMetadata](ItemWithAllMetadata.md) | `itemToRemove` | Yes | |
| `int` | `adjustHeldItemQuantity` | No | |
| [ItemWithAllMetadata](ItemWithAllMetadata.md) | `itemToAdd` | Yes | |
| `String` | `brokenItem` | Yes | |
| `double` | `adjustHeldItemDurability` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 33 |
| `VARIABLE_FIELD_COUNT` | 8 |
| `VARIABLE_BLOCK_START` | 65 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 2 null-bit bytes + 33 bytes of fixed fields + 8 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ModifyInventoryInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ModifyInventoryInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ModifyInventoryInteraction` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `ModifyInventoryInteraction` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [GameMode](GameMode.md)
- [Interaction](Interaction.md)
- [ItemWithAllMetadata](ItemWithAllMetadata.md)
- [SimpleInteraction](SimpleInteraction.md)
