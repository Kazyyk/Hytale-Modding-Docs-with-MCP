# RandomExtra

Type: class | Package: com.hypixel.hytale.math.random

public final class RandomExtra

Class in the random subsystem.

## Constructors

- RandomExtra() | Creates a new RandomExtra instance.

## Methods

- randomBinomial() | double | static public method.
- randomRange(@Nonnull double[] range) | double | static public method.
- randomRange(double from, double to) | double | static public method.
- randomRange(@Nonnull float[] range) | float | static public method.
- randomRange(float from, float to) | float | static public method.
- randomRange(int bound) | int | static public method.
- randomRange(@Nonnull int[] range) | int | static public method.
- randomRange(int from, int to) | int | static public method.
- randomRange(long from, long to) | long | static public method.
- randomDuration(@Nonnull Duration from, @Nonnull Duration to) | Duration | static public method.
- randomBoolean() | boolean | static public method.
- randomElement(@Nonnull List<T> collection) | T | static public method.
- jitter(@Nonnull Vector3d vec, double maxRange) | Vector3d | static public method.
- randomWeightedElement(@Nonnull Collection<? extends T> elements, @Nonnull ToDoubleFunction<T> weight) | T | static public method.
- randomWeightedElement(@Nonnull Collection<? extends T> elements, @Nonnull ToDoubleFunction<T> weight, double sumWeights) | T | static public method.
- randomIntWeightedElement(@Nonnull Collection<? extends T> elements, @Nonnull ToIntFunction<T> weight) | T | static public method.
- randomIntWeightedElement(@Nonnull Collection<? extends T> elements, @Nonnull ToIntFunction<T> weight, int sumWeights) | T | static public method.
- randomWeightedElementFiltered(@Nonnull Collection<? extends T> elements, @Nonnull Predicate<T> filter, @Nonnull ToIntFunction<T> weight) | T | static public method.
- randomWeightedElement(@Nonnull Collection<? extends T> elements, @Nonnull Predicate<T> filter, @Nonnull ToDoubleFunction<T> weight) | T | static public method.
- reservoirSample(@Nonnull List<T> input, @Nonnull Predicate<T> matcher, int count, @Nonnull List<T> picked) | void | static public method.
- reservoirSample(E element, int count, @Nonnull T picked) | <E, T extends List<E>> void | static public method.
- pickWeightedIndex(@Nonnull double[] weights) | int | static public method.

Complete API:
  public static double randomBinomial()
  public static double randomRange(double[] range)
  public static double randomRange(double from, double to)
  public static float randomRange(float[] range)
  public static float randomRange(float from, float to)
  public static int randomRange(int bound)
  public static int randomRange(int[] range)
  public static int randomRange(int from, int to)
  public static long randomRange(long from, long to)
  public static Duration randomDuration(Duration from, Duration to)
  public static boolean randomBoolean()
  public static T randomElement(List<T> collection)
  public static Vector3d jitter(Vector3d vec, double maxRange)
  public static T randomWeightedElement(Collection<? extends T> elements, ToDoubleFunction<T> weight)
  public static T randomWeightedElement(Collection<? extends T> elements, ToDoubleFunction<T> weight, double sumWeights)
  public static T randomIntWeightedElement(Collection<? extends T> elements, ToIntFunction<T> weight)
  public static T randomIntWeightedElement(Collection<? extends T> elements, ToIntFunction<T> weight, int sumWeights)
  public static T randomWeightedElementFiltered(Collection<? extends T> elements, Predicate<T> filter, ToIntFunction<T> weight)
  public static T randomWeightedElementFiltered(Collection<? extends T> elements, Predicate<T> filter, ToIntFunction<T> weight, int sumWeights)
  public static T randomWeightedElement(Collection<? extends T> elements, Predicate<T> filter, ToDoubleFunction<T> weight)
  public static T randomWeightedElement(Collection<? extends T> elements, Predicate<T> filter, ToDoubleFunction<T> weight, double sumWeights)
  public static T randomWeightedElement(Collection<? extends T> elements, BiPredicate<T,U> filter, ToDoubleBiFunction<T,U> weight, double sumWeights, U meta)
  public static void reservoirSample(List<T> input, Predicate<T> matcher, int count, List<T> picked)
  public static void reservoirSample(S input, TriFunction<E,G,H,F> filter, int count, T picked, G g, H h)
  public static void reservoirSample(E element, int count, T picked)
  public static int pickWeightedIndex(double[] weights)
