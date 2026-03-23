# Splitter

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.math | Extends: null

public class Splitter

## Fields

- int size
- int pieceSize
- Splitter.Range[] output
- int min
- int max
- int sizeX
- int sizeZ
- Splitter.Area[] output
- Splitter.Range[] rangesX
- Splitter.Range[] rangesZ
- int o
- Splitter.Range[] ranges
- public final int minX
- public final int minZ
- public final int maxX
- public final int maxZ
- public final int min
- public final int max

## Methods

- public static Splitter.Range[] split(@Nonnull Splitter.Range range, int pieces)
- throw new IllegalArgumentException("negative number of pieces")
- public static Splitter.Area[] split(@Nonnull Splitter.Area area, int pieces)
- public static Splitter.Area[] splitX(@Nonnull Splitter.Area area, int pieces)
- public Area(int minX, int minZ, int maxX, int maxZ)
- throw new IllegalArgumentException("max smaller than min")
- public String toString()
- public Range(int min, int max)

## Inner Types

- `Splitter.Area`
- `Splitter.Range`

Also in this package: Area, BitConverter, Calculator, CoPrimeGenerator, Combiner, InterpolatedCurve, Interpolation, IntersectionPolicy, Layer, MultipliedIteration, NodeFunction, Normalizer, Probability, Range, RegionGrid, SeedGenerator, Stepinizer

Complete API:
  public static Splitter.Range[] split(Splitter.Range range, int pieces)
  public static Splitter.Area[] split(Splitter.Area area, int pieces)
  public static Splitter.Area[] splitX(Splitter.Area area, int pieces)
