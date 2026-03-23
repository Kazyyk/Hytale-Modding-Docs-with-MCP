# NearestBlockUtil

Type: class | Package: com.hypixel.hytale.math.util

public final class NearestBlockUtil

## Methods

- throw new UnsupportedOperationException()
- @Nullable public static <T> Vector3i findNearestBlock(@Nonnull Vector3d position, @Nonnull BiPredicate<Vector3i, T> validBlock, T t)
- @Nullable public static <T> Vector3i findNearestBlock(@Nonnull NearestBlockUtil.IterationElement[] elements, @Nonnull Vector3d position, @Nonnull BiPredicate<Vector3i, T> validBlock, T t)
- @Nullable public static <T> Vector3i findNearestBlock(double x, double y, double z, @Nonnull BiPredicate<Vector3i, T> validBlock, T t)
- @Nullable public static <T> Vector3i findNearestBlock(@Nonnull NearestBlockUtil.IterationElement[] elements, double x, double y, double z, @Nonnull BiPredicate<Vector3i, T> validBlock, T t)
- public IterationElement(int ox, int oy, int oz, DoubleUnaryOperator x, DoubleUnaryOperator y, DoubleUnaryOperator z)
- public int getOffsetX()
- public int getOffsetY()
- public int getOffsetZ()
- public DoubleUnaryOperator getX()
- public DoubleUnaryOperator getY()
- public DoubleUnaryOperator getZ()

Also in this package: ChunkUtil, FastRandom, HashUtil, Icecore, IterationElement, MathUtil, NumberUtil, Riven, TrigMathUtil

Complete API:
  public static Vector3i findNearestBlock(Vector3d position, BiPredicate<Vector3i,T> validBlock, T t)
  public static Vector3i findNearestBlock(NearestBlockUtil.IterationElement[] elements, Vector3d position, BiPredicate<Vector3i,T> validBlock, T t)
  public static Vector3i findNearestBlock(double x, double y, double z, BiPredicate<Vector3i,T> validBlock, T t)
  public static Vector3i findNearestBlock(NearestBlockUtil.IterationElement[] elements, double x, double y, double z, BiPredicate<Vector3i,T> validBlock, T t)

Fields:
public static final NearestBlockUtil.IterationElement[] DEFAULT_ELEMENTS
