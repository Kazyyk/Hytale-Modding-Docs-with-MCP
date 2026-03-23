# ListUtil

Type: class | Package: com.hypixel.hytale.common.util

public class ListUtil

List manipulation utilities: random element selection, shuffled copies, immutable list creation.

Also in this package: AddressType, ArrayUtil, AudioUtil, BitSetUtil, BitUtil, CompletableFutureUtil, ExceptionUtil, FormatUtil, GCUtil, HardwareUtil, MapUtil, MatchType, NetworkUtil, PathUtil, PatternUtil, ProgressConsumer, RandomUtil, StringCompareUtil, StringUtil, SystemType (and 3 more)

Complete API:
  public static List<List<T>> partition(List<T> list, int sectionSize)
  public static void removeIf(List<T> list, Predicate<T> predicate)
  public static void removeIf(List<T> list, BiPredicate<T,U> predicate, U obj)
  public static boolean emptyOrAllNull(List<T> list)
  public static int binarySearch(List<? extends T> l, Function<T,V> func, V key, Comparator<? super V> c)
