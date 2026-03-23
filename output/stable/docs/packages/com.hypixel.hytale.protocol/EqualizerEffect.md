---
title: "EqualizerEffect"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EqualizerEffect"
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
public class EqualizerEffect
```

Audio equalizer preset with 10-band gain and frequency parameters.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `float` | `lowGain` | No |  |
| `float` | `lowCutOff` | No |  |
| `float` | `lowMidGain` | No |  |
| `float` | `lowMidCenter` | No |  |
| `float` | `lowMidWidth` | No |  |
| `float` | `highMidGain` | No |  |
| `float` | `highMidCenter` | No |  |
| `float` | `highMidWidth` | No |  |
| `float` | `highGain` | No |  |
| `float` | `highCutOff` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 41 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 41 |
| `MAX_SIZE` | 16,384,046 |

Binary layout: 1 null-bit byte + 41 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static EqualizerEffect deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `EqualizerEffect` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `EqualizerEffect` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `EqualizerEffect` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AmbienceFXSoundEffect](AmbienceFXSoundEffect.md)
