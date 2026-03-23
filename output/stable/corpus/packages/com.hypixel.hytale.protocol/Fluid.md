# Fluid

Type: class | Package: com.hypixel.hytale.protocol

public class Fluid

Complete fluid type definition including textures, visual properties, light emission, particles, draw type, and max level.

## Fields

- String id
- int maxFluidLevel
- BlockTextures`[] cubeTextures
- boolean requiresAlphaBlending
- Opacity opacity
- ShaderType`[] shaderEffect
- ColorLight light
- ModelParticle`[] particles
- FluidDrawType drawType
- int fluidFXIndex
- int blockSoundSetIndex
- String blockParticleSetId
- Color particleColor
- int``[] tagIndexes

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 23
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 47
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 23 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Fluid deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Fluid` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Fluid` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Fluid` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockTextures
- ColorLight
- FluidDrawType
- FluidFX
