---
title: "AmbienceFXSoundEffect"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFXSoundEffect"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "ambience"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class AmbienceFXSoundEffect
```

Defines audio processing effects (reverb and equalizer) applied to ambience sounds.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `reverbEffectIndex` | No |  |
| `int` | `equalizerEffectIndex` | No |  |
| `boolean` | `isInstant` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 9 |

Binary layout: 9 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AmbienceFXSoundEffect deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AmbienceFXSoundEffect` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AmbienceFXSoundEffect` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AmbienceFXSoundEffect` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EqualizerEffect](EqualizerEffect.md)
- [AmbienceFX](AmbienceFX.md)
