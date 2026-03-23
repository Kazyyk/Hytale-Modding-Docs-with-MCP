# Rng

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.rng | Extends: java.lang.Object

public class Rng

Core deterministic random number generation utilities for world generation. Uses bit manipulation and prime mixing for fast seeded hashing.

Also in this package: RngField, SeedBox

Complete API:
  public static int getRandomInt(int seed, int key)
  public static int mix(int seed, int a, int b)
  public static int mix(int seed, int a, int b, int c)
  public static long splitMixLong(long n)
  public static int splitMixInteger(int n)
  public static int rotateLeft(int bits, int distance)

Fields:
public static final int BIT_NOISE_0
public static final int BIT_NOISE_1
public static final int BIT_NOISE_2
public static final int PRIME_0
public static final int PRIME_1
