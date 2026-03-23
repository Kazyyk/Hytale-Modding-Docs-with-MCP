# BiomeInterpolation

Type: class | Package: com.hypixel.hytale.server.worldgen.biome

public class BiomeInterpolation

## Fields

- public static final Int2IntMap EMPTY_MAP
- public static final BiomeInterpolation DEFAULT
- protected final int radius
- protected final Int2IntMap biomeRadii2

## Constructors

- protected BiomeInterpolation(int radius, Int2IntMap biomeRadii2)

## Methods

- public int getRadius()
- public int getBiomeRadius2(int biome)
- @Nonnull @Override public String toString()
- @Nonnull public static BiomeInterpolation create(int radius, @Nonnull Int2IntMap biomeRadii2)

## Inner Types

- `BiomeInterpolation.EmptyInt2IntMap`

Also in this package: Biome, BiomePatternGenerator, CustomBiome, CustomBiomeGenerator, EmptyInt2IntMap, TileBiome

Complete API:
  public int getRadius()
  public int getBiomeRadius2(int biome)
  public String toString()
  public static BiomeInterpolation create(int radius, Int2IntMap biomeRadii2)

Fields:
public static final Int2IntMap EMPTY_MAP
public static final BiomeInterpolation DEFAULT
protected final int radius
protected final Int2IntMap biomeRadii2
