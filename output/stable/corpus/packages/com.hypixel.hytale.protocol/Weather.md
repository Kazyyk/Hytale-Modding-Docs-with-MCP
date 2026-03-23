# Weather

Type: class | Package: com.hypixel.hytale.protocol

public class Weather

Protocol data structure in the World/Environment group.

## Fields

- String id
- int``[] tagIndexes
- String stars
- Map<``Integer``, ``String``> moons
- Cloud`[] clouds
- Map<``Float``, ``Float``> sunlightDampingMultiplier
- Map<``Float``, `Color`> sunlightColors
- Map<``Float``, `ColorAlpha`> skyTopColors
- Map<``Float``, `ColorAlpha`> skyBottomColors
- Map<``Float``, `ColorAlpha`> skySunsetColors
- Map<``Float``, `Color`> sunColors
- Map<``Float``, ``Float``> sunScales
- Map<``Float``, `ColorAlpha`> sunGlowColors
- Map<``Float``, `ColorAlpha`> moonColors
- Map<``Float``, ``Float``> moonScales
- Map<``Float``, `ColorAlpha`> moonGlowColors
- Map<``Float``, `Color`> fogColors
- Map<``Float``, ``Float``> fogHeightFalloffs
- Map<``Float``, ``Float``> fogDensities
- String screenEffect
- Map<``Float``, `ColorAlpha`> screenEffectColors
- Map<``Float``, `Color`> colorFilters
- Map<``Float``, `Color`> waterTints
- WeatherParticle particle
- NearFar fog
- FogOptions fogOptions

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 4
- FIXED_BLOCK_SIZE | 30
- VARIABLE_FIELD_COUNT | 24
- VARIABLE_BLOCK_START | 126
- MAX_SIZE | 1,677,721,600

Binary layout: 4 null-bit bytes + 30 bytes of fixed fields + 24 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Weather deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Weather` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Weather` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Weather` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Cloud
- Color
- ColorAlpha
- FogOptions
- NearFar
- WeatherParticle
