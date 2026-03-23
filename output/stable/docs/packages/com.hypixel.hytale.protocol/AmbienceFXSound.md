---
title: "AmbienceFXSound"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFXSound"
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
public class AmbienceFXSound
```

Defines a sound event within an ambience effect, including playback mode (2D/3D), altitude positioning, frequency, and radius.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `int` | `soundEventIndex` | No |  |
| [AmbienceFXSoundPlay3D](AmbienceFXSoundPlay3D.md) | `play3D` | No |  Default: `AmbienceFXSoundPlay3D.Random`. |
| `int` | `blockSoundSetIndex` | No |  |
| [AmbienceFXAltitude](AmbienceFXAltitude.md) | `altitude` | No |  Default: `AmbienceFXAltitude.Normal`. |
| [Rangef](Rangef.md) | `frequency` | Yes |  |
| [Range](Range.md) | `radius` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 27 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 27 |
| `MAX_SIZE` | 27 |

Binary layout: 1 null-bit byte + 27 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AmbienceFXSound deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AmbienceFXSound` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AmbienceFXSound` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AmbienceFXSound` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AmbienceFXSoundPlay3D](AmbienceFXSoundPlay3D.md)
- [AmbienceFXAltitude](AmbienceFXAltitude.md)
- [AmbienceFX](AmbienceFX.md)
