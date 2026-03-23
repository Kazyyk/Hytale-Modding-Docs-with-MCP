---
title: "FluidFX"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FluidFX"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "fluid"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class FluidFX
```

Comprehensive fluid visual effects configuration including shader, fog, color filter, particles, and movement settings.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| [ShaderType](ShaderType.md) | `shader` | No |  Default: `ShaderType.None`. |
| [FluidFog](FluidFog.md) | `fogMode` | No |  Default: `FluidFog.Color`. |
| [Color](Color.md) | `fogColor` | Yes |  |
| [NearFar](NearFar.md) | `fogDistance` | Yes |  |
| `float` | `fogDepthStart` | No |  |
| `float` | `fogDepthFalloff` | No |  |
| [Color](Color.md) | `colorFilter` | Yes |  |
| `float` | `colorSaturation` | No |  |
| `float` | `distortionAmplitude` | No |  |
| `float` | `distortionFrequency` | No |  |
| [FluidParticle](FluidParticle.md) | `particle` | Yes |  |
| [FluidFXMovementSettings](FluidFXMovementSettings.md) | `movementSettings` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 61 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 69 |
| `MAX_SIZE` | 32,768,087 |

Binary layout: 1 null-bit byte + 61 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static FluidFX deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `FluidFX` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `FluidFX` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `FluidFX` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [FluidFog](FluidFog.md)
- [FluidFXMovementSettings](FluidFXMovementSettings.md)
- [FluidParticle](FluidParticle.md)
- [Color](Color.md)
- [Fluid](Fluid.md)
