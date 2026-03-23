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
