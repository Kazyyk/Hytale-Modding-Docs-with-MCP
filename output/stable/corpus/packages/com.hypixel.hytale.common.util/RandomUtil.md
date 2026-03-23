# RandomUtil

Type: class | Package: com.hypixel.hytale.common.util

public class RandomUtil

Random number utilities: weighted selection, range generation, float/double random values.

Also in this package: AddressType, ArrayUtil, AudioUtil, BitSetUtil, BitUtil, CompletableFutureUtil, ExceptionUtil, FormatUtil, GCUtil, HardwareUtil, ListUtil, MapUtil, MatchType, NetworkUtil, PathUtil, PatternUtil, ProgressConsumer, StringCompareUtil, StringUtil, SystemType (and 3 more)

Complete API:
  public static T roll(int roll, T[] data, int[] chances)
  public static int rollInt(int roll, int[] data, int[] chances)
  public static SecureRandom getSecureRandom()
  public static T selectRandom(T[] arr, Random random)
  public static T selectRandomOrNull(T[] arr, Random random)
  public static T selectRandom(List<? extends T> list)
  public static T selectRandom(List<? extends T> list, Random random)

Fields:
public static final ThreadLocal<SecureRandom> SECURE_RANDOM
