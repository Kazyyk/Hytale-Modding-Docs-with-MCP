---
title: "AnimationSet"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AnimationSet"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class AnimationSet
```

Groups related animations together under an identifier with configurable delay between sequential playbacks.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| [Animation](Animation.md)`[]` | `animations` | Yes |  |
| [Rangef](Rangef.md) | `nextAnimationDelay` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 17 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AnimationSet deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AnimationSet` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AnimationSet` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AnimationSet` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Animation](Animation.md)
