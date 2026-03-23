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

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static Weather deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public Weather clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public int[] tagIndexes
public String stars
public Map<Integer,String> moons
public Cloud[] clouds
public Map<Float,Float> sunlightDampingMultiplier
public Map<Float,Color> sunlightColors
public Map<Float,ColorAlpha> skyTopColors
public Map<Float,ColorAlpha> skyBottomColors
public Map<Float,ColorAlpha> skySunsetColors
public Map<Float,Color> sunColors
public Map<Float,Float> sunScales
public Map<Float,ColorAlpha> sunGlowColors
public Map<Float,ColorAlpha> moonColors
public Map<Float,Float> moonScales
public Map<Float,ColorAlpha> moonGlowColors
public Map<Float,Color> fogColors
public Map<Float,Float> fogHeightFalloffs
public Map<Float,Float> fogDensities
public String screenEffect
public Map<Float,ColorAlpha> screenEffectColors
public Map<Float,Color> colorFilters
public Map<Float,Color> waterTints
public WeatherParticle particle
public NearFar fog
public FogOptions fogOptions
