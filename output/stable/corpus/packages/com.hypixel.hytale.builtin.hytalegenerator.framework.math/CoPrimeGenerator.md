# CoPrimeGenerator

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.framework.math | Extends: null

public class CoPrimeGenerator

## Fields

- Random rand
- int[] primes
- int[][] buckets
- long[] output
- int indexOfBucket
- int indexOfPrime
- int number

## Methods

- public static long[] generateCoPrimes(long seed, int bucketSize, int numberOfBuckets, long floor)
- throw new IllegalArgumentException("invalid sizes")
- public static void fillWithPrimes(@Nonnull int[] bucket)
- public static boolean isPrime(int number)

Also in this package: Area, BitConverter, Calculator, Combiner, InterpolatedCurve, Interpolation, IntersectionPolicy, Layer, MultipliedIteration, NodeFunction, Normalizer, Probability, Range, RegionGrid, SeedGenerator, Splitter, Stepinizer

Complete API:
  public static long[] generateCoPrimes(long seed, int bucketSize, int numberOfBuckets, long floor)
  public static void fillWithPrimes(int[] bucket)
  public static boolean isPrime(int number)
