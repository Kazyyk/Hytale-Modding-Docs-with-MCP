---
title: "Fluid"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Fluid"
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
public class Fluid
```

Complete fluid type definition including textures, visual properties, light emission, particles, draw type, and max level.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| `int` | `maxFluidLevel` | No |  |
| [BlockTextures](BlockTextures.md)`[]` | `cubeTextures` | Yes |  |
| `boolean` | `requiresAlphaBlending` | No |  |
| [Opacity](Opacity.md) | `opacity` | No |  Default: `Opacity.Solid`. |
| [ShaderType](ShaderType.md)`[]` | `shaderEffect` | Yes |  |
| [ColorLight](ColorLight.md) | `light` | Yes |  |
| [ModelParticle](ModelParticle.md)`[]` | `particles` | Yes |  |
| [FluidDrawType](FluidDrawType.md) | `drawType` | No |  Default: `FluidDrawType.None`. |
| `int` | `fluidFXIndex` | No |  |
| `int` | `blockSoundSetIndex` | No |  |
| `String` | `blockParticleSetId` | Yes |  |
| [Color](Color.md) | `particleColor` | Yes |  |
| `int``[]` | `tagIndexes` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 23 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 47 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 23 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Fluid deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Fluid` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Fluid` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Fluid` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockTextures](BlockTextures.md)
- [ColorLight](ColorLight.md)
- [FluidDrawType](FluidDrawType.md)
- [FluidFX](FluidFX.md)
