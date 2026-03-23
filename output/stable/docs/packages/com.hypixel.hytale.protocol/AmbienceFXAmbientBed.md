---
title: "AmbienceFXAmbientBed"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AmbienceFXAmbientBed"
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
public class AmbienceFXAmbientBed
```

Defines an ambient bed (continuous background audio loop) within an ambience effect, including the audio track, volume, and transition behavior.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `track` | Yes |  |
| `float` | `volume` | No |  |
| [AmbienceTransitionSpeed](AmbienceTransitionSpeed.md) | `transitionSpeed` | No |  Default: `AmbienceTransitionSpeed.Default`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 6 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 6 |
| `MAX_SIZE` | 16,384,011 |

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static AmbienceFXAmbientBed deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `AmbienceFXAmbientBed` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `AmbienceFXAmbientBed` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `AmbienceFXAmbientBed` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [AmbienceTransitionSpeed](AmbienceTransitionSpeed.md)
- [AmbienceFX](AmbienceFX.md)
