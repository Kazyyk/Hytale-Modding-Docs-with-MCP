---
title: "SoundEventLayer"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SoundEventLayer"
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
public class SoundEventLayer
```

Protocol data structure in the Sound/Audio group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `volume` | No | |
| `float` | `startDelay` | No | |
| `boolean` | `looping` | No | |
| `int` | `probability` | No | |
| `float` | `probabilityRerollDelay` | No | |
| `int` | `roundRobinHistorySize` | No | |
| [SoundEventLayerRandomSettings](SoundEventLayerRandomSettings.md) | `randomSettings` | Yes | |
| `String``[]` | `files` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 42 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 42 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 42 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static SoundEventLayer deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `SoundEventLayer` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `SoundEventLayer` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `SoundEventLayer` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [SoundEventLayerRandomSettings](SoundEventLayerRandomSettings.md)
