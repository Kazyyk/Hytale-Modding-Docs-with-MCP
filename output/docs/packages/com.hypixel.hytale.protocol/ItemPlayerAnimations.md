---
title: "ItemPlayerAnimations"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemPlayerAnimations"
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
public class ItemPlayerAnimations
```

Defines player animation overrides when holding a specific item, including wiggle weights, camera settings, and pullback configuration.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `Map<``String``, `[ItemAnimation](ItemAnimation.md)`>` | `animations` | Yes |  |
| [WiggleWeights](WiggleWeights.md) | `wiggleWeights` | Yes |  |
| [CameraSettings](CameraSettings.md) | `camera` | Yes |  |
| [ItemPullbackConfiguration](ItemPullbackConfiguration.md) | `pullbackConfig` | Yes |  |
| `boolean` | `useFirstPersonOverride` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 91 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 103 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 91 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemPlayerAnimations deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemPlayerAnimations` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemPlayerAnimations` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemPlayerAnimations` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [CameraSettings](CameraSettings.md)
- [ItemPullbackConfiguration](ItemPullbackConfiguration.md)
