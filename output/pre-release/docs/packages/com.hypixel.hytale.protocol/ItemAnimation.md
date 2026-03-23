---
title: "ItemAnimation"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemAnimation"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "item"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ItemAnimation
```

Defines animation references for an item with separate third-person, first-person, and first-person override variants.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `thirdPerson` | Yes |  |
| `String` | `thirdPersonMoving` | Yes |  |
| `String` | `thirdPersonFace` | Yes |  |
| `String` | `firstPerson` | Yes |  |
| `String` | `firstPersonOverride` | Yes |  |
| `boolean` | `keepPreviousFirstPersonAnimation` | No |  |
| `float` | `speed` | No |  |
| `float` | `blendingDuration` | No |  Default: `0.2F`. |
| `boolean` | `looping` | No |  |
| `boolean` | `clipsGeometry` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 12 |
| `VARIABLE_FIELD_COUNT` | 5 |
| `VARIABLE_BLOCK_START` | 32 |
| `MAX_SIZE` | 81,920,057 |

Binary layout: 1 null-bit byte + 12 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemAnimation deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemAnimation` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemAnimation` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemAnimation` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemBase](ItemBase.md)
