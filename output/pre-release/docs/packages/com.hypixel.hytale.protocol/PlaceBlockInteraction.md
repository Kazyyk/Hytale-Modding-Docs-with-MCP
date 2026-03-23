---
title: "PlaceBlockInteraction"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PlaceBlockInteraction"
api_surface: false
extends: "SimpleInteraction"
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
public class PlaceBlockInteraction extends SimpleInteraction
```

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 8).

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `blockId` | No | |
| `boolean` | `removeItemInHand` | No | |
| `boolean` | `allowDragPlacement` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 25 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 45 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 25 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static PlaceBlockInteraction deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `PlaceBlockInteraction` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `PlaceBlockInteraction` starting at the given offset.

```java
@Override
public int serialize(@Nonnull ByteBuf buf)
```

Serializes this `PlaceBlockInteraction` into the given buffer. Returns bytes written.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Interaction](Interaction.md)
- [SimpleInteraction](SimpleInteraction.md)
