# WeightedMap.Builder

Type: class | Package: com.hypixel.hytale.common.map

public static class Builder<T>

## Fields

- private final T[] emptyKeys
- private T[] keys
- private double[] values
- private int size

## Methods

- private Builder(T[] emptyKeys)
- public WeightedMap.Builder<T> putAll(@Nullable IWeightedMap<T> map)
- public WeightedMap.Builder<T> putAll(@Nullable T[] arr, @Nonnull ToDoubleFunction<T> weight)
- public WeightedMap.Builder<T> put(T obj, double weight)
- public void ensureCapacity(int toAdd)
- private void resize(int newLength)
- private void insert(T key, double value)
- public int size()
- private int allocated()
- public void clear()
- public IWeightedMap<T> build()

Known subclasses: Builder

Known implementors: BuilderActionRecomputePath, BuilderBase, BuilderBodyMotionFindBase

Also in this package: DefaultMap, IWeightedElement, IWeightedMap, SeedCoordinateFunction, SingletonWeightedMap, WeightedMap

Complete API:
  public WeightedMap.Builder<T> putAll(IWeightedMap<T> map)
  public WeightedMap.Builder<T> putAll(T[] arr, ToDoubleFunction<T> weight)
  public WeightedMap.Builder<T> put(T obj, double weight)
  public void ensureCapacity(int toAdd)
  private void resize(int newLength)
  private void insert(T key, double value)
  public int size()
  private int allocated()
  public void clear()
  public IWeightedMap<T> build()

Fields:
private final T[] emptyKeys
private T[] keys
private double[] values
private int size
