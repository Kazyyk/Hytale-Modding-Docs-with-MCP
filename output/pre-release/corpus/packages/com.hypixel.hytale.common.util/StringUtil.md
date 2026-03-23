# StringUtil

Type: class | Package: com.hypixel.hytale.common.util

public class StringUtil

String manipulation utilities: padding, truncation, case conversion, joining, splitting, regex helpers.

Also in this package: AddressType, ArrayUtil, AudioUtil, BitSetUtil, BitUtil, CompletableFutureUtil, ExceptionUtil, FormatUtil, GCUtil, HardwareUtil, ListUtil, MapUtil, MatchType, NetworkUtil, PathUtil, PatternUtil, ProgressConsumer, RandomUtil, StringCompareUtil, SystemType (and 3 more)

Complete API:
  public static boolean isNumericString(String str)
  public static boolean isAlphaNumericHyphenString(String str)
  public static boolean isAlphaNumericHyphenUnderscoreString(String str)
  public static boolean isCapitalized(String keyStr, char delim)
  public static String capitalize(String keyStr, char delim)
  public static V parseEnum(V[] enumConstants, String str)
  public static V parseEnum(V[] enumConstants, String str, StringUtil.MatchType matchType)
  public static String stripQuotes(String s)
  public static boolean isGlobMatching(String pattern, String text)
  public static boolean isGlobMatching(String pattern, int patternPos, String text, int textPos)
  public static boolean isGlobPattern(String text)
  public static String humanizeTime(Duration duration, boolean useSeconds)
  public static String humanizeTime(Duration length)
  public static List<T> sortByFuzzyDistance(String str, Collection<T> collection, int length)
  public static List<T> sortByFuzzyDistance(String str, Collection<T> collection)
  public static String toPaddedBinaryString(int val)
  public static String trimEnd(String str, String end)
  public static void generateGraph(StringBuilder sb, int width, int height, long minX, long maxX, double minY, double maxY, DoubleFunction<String> labelFormatFunc, int historyLength, IntToLongFunction timestampFunc, IntToDoubleFunction valueFunc)

Fields:
public static final Pattern RAW_ARGS_PATTERN
private static final char[] GRAPH_CHARS
