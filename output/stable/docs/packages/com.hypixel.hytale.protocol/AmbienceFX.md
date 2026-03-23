---
title: "AmbienceFX"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFX"
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
public class AmbienceFX
```

Defines a complete ambience effect configuration including trigger conditions, sounds, music, ambient beds, and audio processing effects. Ambience effects are selected based on environmental conditions.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| [AmbienceFXConditions](AmbienceFXConditions.md) | `conditions` | Yes |  |
| [AmbienceFXSound](AmbienceFXSound.md)`[]` | `sounds` | Yes |  |
| [AmbienceFXMusic](AmbienceFXMusic.md) | `music` | Yes |  |
| [AmbienceFXAmbientBed](AmbienceFXAmbientBed.md) | `ambientBed` | Yes |  |
| [AmbienceFXSoundEffect](AmbienceFXSoundEffect.md) | `soundEffect` | Yes |  |
| `int` | `priority` | No |  |
| `int``[]` | `blockedAmbienceFxIndices` | Yes |  |
| `int` | `audioCategoryIndex` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 18 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 42 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 18 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AmbienceFX deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AmbienceFX` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AmbienceFX` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AmbienceFX` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AmbienceFXConditions](AmbienceFXConditions.md)
- [AmbienceFXSound](AmbienceFXSound.md)
- [AmbienceFXMusic](AmbienceFXMusic.md)
- [AmbienceFXAmbientBed](AmbienceFXAmbientBed.md)
- [AmbienceFXSoundEffect](AmbienceFXSoundEffect.md)
