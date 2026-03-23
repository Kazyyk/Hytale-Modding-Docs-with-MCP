---
title: "ItemPullbackConfiguration"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemPullbackConfiguration"
api_surface: true
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
public class ItemPullbackConfiguration
```

Configuration for pullback (draw) mechanics on items like bows, including timing and animation parameters.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Vector3f](Vector3f.md) | `leftOffsetOverride` | Yes |  |
| [Vector3f](Vector3f.md) | `leftRotationOverride` | Yes |  |
| [Vector3f](Vector3f.md) | `rightOffsetOverride` | Yes |  |
| [Vector3f](Vector3f.md) | `rightRotationOverride` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 49 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 49 |
| `MAX_SIZE` | 49 |

Binary layout: 1 null-bit byte + 49 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemPullbackConfiguration deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemPullbackConfiguration` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemPullbackConfiguration` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemPullbackConfiguration` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemPlayerAnimations](ItemPlayerAnimations.md)
- [ItemBase](ItemBase.md)
