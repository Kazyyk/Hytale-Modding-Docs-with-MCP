# WeightedMap

Type: class | Package: com.hypixel.hytale.common.map | Implements: IWeightedMap

public class WeightedMap<T> implements IWeightedMap<T>

## Constants

- public static final double EPSILON
- public static final double ONE_MINUS_EPSILON

## Fields

- public static final double EPSILON
- public static final double ONE_MINUS_EPSILON
- private final T[] keys
- private final double[] values
- private final double sum
- private final T[] emptyKeys
- private T[] keys
- private double[] values
- private int size
- protected final T[] keys
- protected final T key

## Methods

- public static <T> WeightedMap.Builder<T> builder(T[] emptyKeys)
- private WeightedMap(@Nonnull T[] keys, double[] values, double sum)
- public T get(double value)
- public T get(@Nonnull DoubleSupplier supplier)
- public T get(@Nonnull Random random)
- public T get(int x, int z, @Nonnull BiIntToDoubleFunction supplier)
- public T get(long x, long z, @Nonnull BiLongToDoubleFunction supplier)
- public T get(double x, double z, @Nonnull BiDoubleToDoubleFunction supplier)
- public <K> T get(int seed, int x, int z, @Nonnull IWeightedMap.SeedCoordinateFunction<K> supplier, K k)
- public int size()
- public boolean contains(T obj)
- public void forEach(@Nonnull Consumer<T> consumer)
- public void forEachEntry(@Nonnull ObjDoubleConsumer<T> consumer)
- public T[] internalKeys()
- public T[] toArray()
- public <K> IWeightedMap<K> resolveKeys(@Nonnull Function<T, K> mapper, @Nonnull IntFunction<K[]> arraySupplier)
- public String toString()
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
- public T get(double value)
- public T get(DoubleSupplier supplier)
- public T get(Random random)
- public T get(int x, int z, BiIntToDoubleFunction supplier)
- public T get(long x, long z, BiLongToDoubleFunction supplier)
- public T get(double x, double z, BiDoubleToDoubleFunction supplier)
- public <K> T get(int seed, int x, int z, IWeightedMap.SeedCoordinateFunction<K> supplier, K k)
- public int size()
- public boolean contains(@Nullable T obj)
- public void forEach(@Nonnull Consumer<T> consumer)
- public void forEachEntry(@Nonnull ObjDoubleConsumer<T> consumer)
- public T[] internalKeys()
- public T[] toArray()
- public <K> IWeightedMap<K> resolveKeys(@Nonnull Function<T, K> mapper, @Nonnull IntFunction<K[]> arraySupplier)
- public String toString()

Also in this package: Builder, DefaultMap, IWeightedElement, IWeightedMap, SeedCoordinateFunction, SingletonWeightedMap

Complete API:
  public static WeightedMap.Builder<T> builder(T[] emptyKeys)
  public T get(double value)
  public T get(DoubleSupplier supplier)
  public T get(Random random)
  public T get(int x, int z, BiIntToDoubleFunction supplier)
  public T get(long x, long z, BiLongToDoubleFunction supplier)
  public T get(double x, double z, BiDoubleToDoubleFunction supplier)
  public T get(int seed, int x, int z, IWeightedMap.SeedCoordinateFunction<K> supplier, K k)
  public int size()
  public boolean contains(T obj)
  public void forEach(Consumer<T> consumer)
  public void forEachEntry(ObjDoubleConsumer<T> consumer)
  public T[] internalKeys()
  public T[] toArray()
  public IWeightedMap<K> resolveKeys(Function<T,K> mapper, IntFunction<K[]> arraySupplier)
  public String toString()

Fields:
public static final double EPSILON
public static final double ONE_MINUS_EPSILON
private final Set<T> keySet
private final T[] keys
private final double[] values
private final double sum
