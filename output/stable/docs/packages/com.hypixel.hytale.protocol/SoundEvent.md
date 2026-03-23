---
title: "SoundEvent"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SoundEvent"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "audio"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class SoundEvent
```

Protocol data structure in the Sound/Audio group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| `float` | `volume` | No | |
| `float` | `pitch` | No | |
| `float` | `musicDuckingVolume` | No | |
| `float` | `ambientDuckingVolume` | No | |
| `int` | `maxInstance` | No | |
| `boolean` | `preventSoundInterruption` | No | |
| `float` | `startAttenuationDistance` | No | |
| `float` | `maxDistance` | No | |
| [SoundEventLayer](SoundEventLayer.md)`[]` | `layers` | Yes | |
| `int` | `audioCategory` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 34 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 42 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 34 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static SoundEvent deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `SoundEvent` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `SoundEvent` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `SoundEvent` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [SoundEventLayer](SoundEventLayer.md)
