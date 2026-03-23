# FluidFX

Type: class | Package: com.hypixel.hytale.protocol

public class FluidFX

Comprehensive fluid visual effects configuration including shader, fog, color filter, particles, and movement settings.

## Fields

- String id
- ShaderType shader
- FluidFog fogMode
- Color fogColor
- NearFar fogDistance
- float fogDepthStart
- float fogDepthFalloff
- Color colorFilter
- float colorSaturation
- float distortionAmplitude
- float distortionFrequency
- FluidParticle particle
- FluidFXMovementSettings movementSettings

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 61
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 69
- MAX_SIZE | 32,768,087

Binary layout: 1 null-bit byte + 61 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FluidFX deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FluidFX` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FluidFX` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FluidFX` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- FluidFog
- FluidFXMovementSettings
- FluidParticle
- Color
- Fluid
