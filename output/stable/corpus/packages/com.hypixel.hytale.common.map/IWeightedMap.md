# IWeightedMap

Type: interface | Package: com.hypixel.hytale.common.map

public interface IWeightedMap<T>

Known implementors: SingletonWeightedMap, WeightedMap

Also in this package: Builder, DefaultMap, IWeightedElement, SeedCoordinateFunction, SingletonWeightedMap, WeightedMap

Complete API:
  T get(double var1)
  T get(DoubleSupplier var1)
  T get(Random var1)
  T get(int var1, int var2, BiIntToDoubleFunction var3)
  T get(long var1, long var3, BiLongToDoubleFunction var5)
  T get(double var1, double var3, BiDoubleToDoubleFunction var5)
  T get(int var1, int var2, int var3, IWeightedMap.SeedCoordinateFunction<K> var4, K var5)
  int size()
  boolean contains(T var1)
  void forEach(Consumer<T> var1)
  void forEachEntry(ObjDoubleConsumer<T> var1)
  T[] internalKeys()
  T[] toArray()
  IWeightedMap<K> resolveKeys(Function<T,K> var1, IntFunction<K[]> var2)
