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
