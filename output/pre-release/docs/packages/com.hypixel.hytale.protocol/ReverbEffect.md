---
title: "ReverbEffect"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ReverbEffect"
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
public class ReverbEffect
```

Protocol data structure in the Sound/Audio group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| `float` | `dryGain` | No | |
| `float` | `modalDensity` | No | |
| `float` | `diffusion` | No | |
| `float` | `gain` | No | |
| `float` | `highFrequencyGain` | No | |
| `float` | `decayTime` | No | |
| `float` | `highFrequencyDecayRatio` | No | |
| `float` | `reflectionGain` | No | |
| `float` | `reflectionDelay` | No | |
| `float` | `lateReverbGain` | No | |
| `float` | `lateReverbDelay` | No | |
| `float` | `roomRolloffFactor` | No | |
| `float` | `airAbsorptionHighFrequencyGain` | No | |
| `boolean` | `limitDecayHighFrequency` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 54 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 54 |
| `MAX_SIZE` | 16,384,059 |

Binary layout: 1 null-bit byte + 54 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ReverbEffect deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ReverbEffect` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ReverbEffect` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ReverbEffect` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
