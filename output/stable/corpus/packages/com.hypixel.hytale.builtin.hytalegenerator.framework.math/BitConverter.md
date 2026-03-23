# BitConverter

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.math | Extends: null

public class BitConverter

## Fields

- boolean[] output
- byte PRECISION
- boolean[] bits
- long position
- int position
- byte position
- long number
- int number
- byte number

## Methods

- public static void main(String[] args)
- public static boolean[] toBitArray(long number)
- public static boolean[] toBitArray(int number)
- public static boolean[] toBitArray(byte number)
- public static long toLong(@Nonnull boolean[] bits)
- throw new IllegalArgumentException("array must have length 64")
- public static int toInt(@Nonnull boolean[] bits)
- throw new IllegalArgumentException("array must have length 32")
- public static int toByte(@Nonnull boolean[] bits)
- throw new IllegalArgumentException("array must have length 8")

Also in this package: Area, Calculator, CoPrimeGenerator, Combiner, InterpolatedCurve, Interpolation, IntersectionPolicy, Layer, MultipliedIteration, NodeFunction, Normalizer, Probability, Range, RegionGrid, SeedGenerator, Splitter, Stepinizer

Complete API:
  public static void main(String[] args)
  public static boolean[] toBitArray(long number)
  public static boolean[] toBitArray(int number)
  public static boolean[] toBitArray(byte number)
  public static long toLong(boolean[] bits)
  public static int toInt(boolean[] bits)
  public static int toByte(boolean[] bits)
