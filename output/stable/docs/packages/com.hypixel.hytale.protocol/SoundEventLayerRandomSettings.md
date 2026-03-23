---
title: "SoundEventLayerRandomSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SoundEventLayerRandomSettings"
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
public class SoundEventLayerRandomSettings
```

Protocol data structure in the Sound/Audio group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `minVolume` | No | |
| `float` | `maxVolume` | No | |
| `float` | `minPitch` | No | |
| `float` | `maxPitch` | No | |
| `float` | `maxStartOffset` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 20 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 20 |
| `MAX_SIZE` | 20 |

Binary layout: 20 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static SoundEventLayerRandomSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `SoundEventLayerRandomSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `SoundEventLayerRandomSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `SoundEventLayerRandomSettings` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
