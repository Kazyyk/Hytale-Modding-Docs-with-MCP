# FastRandom

Type: class | Package: com.hypixel.hytale.math.util | Extends: Random

public class FastRandom extends Random

Extends `Random`.

## Fields

- private long seed

## Methods

- @Override public void setSeed(long seed)
- private static long initialScramble(long seed)
- @Override protected int next(int bits)
- @Override public double nextGaussian()
- throw new UnsupportedOperationException()

Also in this package: ChunkUtil, HashUtil, Icecore, IterationElement, MathUtil, NearestBlockUtil, NumberUtil, Riven, TrigMathUtil

Complete API:
  public void setSeed(long seed)
  private static long initialScramble(long seed)
  protected int next(int bits)
  public synchronized double nextGaussian()

Fields:
private static final long multiplier
private static final long addend
private static final long mask
private long seed
