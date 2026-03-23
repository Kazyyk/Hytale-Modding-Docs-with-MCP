# ArrayUtil

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class ArrayUtil

Utility methods for array copying, appending, splitting lists into parts, and sorted/binary searching.

## Key Methods

- public static T[] brokenCopyOf(@Nonnull T[] a)
- public static void copy(@Nonnull T[] source, @Nonnull T[] destination)
- public static T[] append(@Nonnull T[] a, T e)
- public static List<List<T>> split(@Nonnull List<T> list, int partCount)
- public static int[] getPartSizes(int total, int partCount)
- public static int sortedSearch(@Nonnull List<T> sortedList, @Nonnull G gauge, @Nonnull BiFunction<G, T, Integer> comparator)
- public static int binarySearch(@Nonnull List<T> sortedList, @Nonnull G gauge, @Nonnull BiFunction<G, T, Integer> comparator)

Also in this package: BiOperation3i, BlockMask, EntityPlacementData, FutureUtils, GridUtils, LoggerUtil, MaterialSet, NakedOperation3i, Operation3i, PropRuntime, Registry, Retriever, ReusableList, VectorUtil, Viewport, WeightedMap

Complete API:
  public static T[] brokenCopyOf(T[] a)
  public static void copy(T[] source, T[] destination)
  public static T[] append(T[] a, T e)
  public static List<List<T>> split(List<T> list, int partCount)
  public static int[] getPartSizes(int total, int partCount)
  public static int sortedSearch(List<T> sortedList, G gauge, BiFunction<G,T,Integer> comparator)
  public static int binarySearch(List<T> sortedList, G gauge, BiFunction<G,T,Integer> comparator)
