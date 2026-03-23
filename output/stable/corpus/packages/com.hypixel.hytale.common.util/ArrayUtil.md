# ArrayUtil

Type: class | Package: com.hypixel.hytale.common.util

public class ArrayUtil

Array manipulation utilities: concatenation, reversal, shuffling, contains checks, type-specific empty arrays.

Also in this package: AddressType, AudioUtil, BitSetUtil, BitUtil, CompletableFutureUtil, ExceptionUtil, FormatUtil, GCUtil, HardwareUtil, ListUtil, MapUtil, MatchType, NetworkUtil, PathUtil, PatternUtil, ProgressConsumer, RandomUtil, StringCompareUtil, StringUtil, SystemType (and 3 more)

Complete API:
  public static T[] emptyArray()
  public static Supplier<T>[] emptySupplierArray()
  public static Entry<K,V>[] emptyEntryArray()
  public static int grow(int oldSize)
  public static EndType[] copyAndMutate(StartType[] array, Function<StartType,EndType> adapter, IntFunction<EndType[]> arrayProvider)
  public static T[] combine(T[] a1, T[] a2)
  public static T[] append(T[] arr, T t)
  public static T[] remove(T[] arr, int index)
  public static boolean startsWith(byte[] array, byte[] start)
  public static boolean equals(T[] a, T[] a2, UnaryBiPredicate<T> predicate)
  public static T[][] split(T[] data, int size)
  public static byte[][] split(byte[] data, int size)
  public static void shuffleArray(int[] ar, int from, int to, Random rnd)
  public static void shuffleArray(byte[] ar, int from, int to, Random rnd)
  public static boolean contains(T[] array, T obj)
  public static boolean contains(T[] array, T obj, int start, int end)
  public static int indexOf(T[] array, T obj)
  public static int indexOf(T[] array, T obj, int start, int end)

Fields:
public static final String[] EMPTY_STRING_ARRAY
public static final double[] EMPTY_DOUBLE_ARRAY
public static final int[] EMPTY_INT_ARRAY
public static final long[] EMPTY_LONG_ARRAY
public static final boolean[] EMPTY_BOOLEAN_ARRAY
public static final Integer[] EMPTY_INTEGER_ARRAY
public static final byte[] EMPTY_BYTE_ARRAY
public static final BitSet[] EMPTY_BITSET_ARRAY
public static final float[] EMPTY_FLOAT_ARRAY
private static final Object[] EMPTY_OBJECT_ARRAY
private static final Supplier[] EMPTY_SUPPLIER_ARRAY
private static final Entry[] EMPTY_ENTRY_ARRAY
