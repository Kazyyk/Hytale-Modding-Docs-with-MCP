---
title: "Animation"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Animation"
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
public class Animation
```

Defines a single animation with playback parameters including speed, blending, looping, weight, and associated sound/footstep events.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `name` | Yes |  |
| `float` | `speed` | No |  |
| `float` | `blendingDuration` | No |  Default: `0.2F`. |
| `boolean` | `looping` | No |  |
| `float` | `weight` | No |  |
| `int``[]` | `footstepIntervals` | Yes |  |
| `int` | `soundEventIndex` | No |  |
| `int` | `passiveLoopCount` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 22 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 30 |
| `MAX_SIZE` | 32,768,040 |

Binary layout: 1 null-bit byte + 22 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Animation deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Animation` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Animation` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Animation` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AnimationSet](AnimationSet.md)
- [AnimationSlot](AnimationSlot.md)
