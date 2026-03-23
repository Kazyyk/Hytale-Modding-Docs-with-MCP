# FormatUtil

Type: class | Package: com.hypixel.hytale.common.util

public class FormatUtil

Number and data size formatting utilities: bytes to human-readable, decimal formatting, duration formatting.

Also in this package: AddressType, ArrayUtil, AudioUtil, BitSetUtil, BitUtil, CompletableFutureUtil, ExceptionUtil, GCUtil, HardwareUtil, ListUtil, MapUtil, MatchType, NetworkUtil, PathUtil, PatternUtil, ProgressConsumer, RandomUtil, StringCompareUtil, StringUtil, SystemType (and 3 more)

Complete API:
  public static TimeUnit largestUnit(long value, TimeUnit unit)
  public static String simpleTimeUnitFormat(Metric metric, TimeUnit timeUnit, int rounding)
  public static String simpleTimeUnitFormat(Metric metric, TimeUnit timeUnit, TimeUnit largestUnit, int rounding)
  public static String simpleTimeUnitFormat(long min, double average, long max, TimeUnit timeUnit, TimeUnit largestUnit, int rounding)
  public static String simpleTimeUnitFormat(long value, TimeUnit timeUnit, int rounding)
  public static String simpleFormat(long min1, double average1, long max1, DoubleUnaryOperator doubleFunction, int rounding)
  public static String simpleFormat(Metric metric)
  public static String simpleFormat(Metric metric, int rounding)
  public static String simpleFormat(int rounding, double average, double range)
  public static String timeUnitToString(Metric metric, TimeUnit timeUnit)
  public static String timeUnitToString(long value, TimeUnit timeUnit)
  public static String timeUnitToString(long value, TimeUnit timeUnit, boolean paddingBetween)
  public static String nanosToString(long nanos)
  private static boolean timeToStringPart(AtomicLong time, StringBuilder sb, boolean previous, TimeUnit timeUnitFrom, TimeUnit timeUnitTo, String after, boolean paddingBefore, boolean paddingBetween)
  public static String bytesToString(long bytes)
  public static String bytesToString(long bytes, boolean si)
  public static String addNumberSuffix(int i)
  public static void formatArray(Formatter formatter, String format, Object[] args)
  public static void formatArgs(Formatter formatter, String format, Object args)

Fields:
private static final String[] NUMBER_SUFFIXES
private static final EnumMap<TimeUnit,String> timeUnitToShortString
public static final long DAY_AS_NANOS
public static final long HOUR_AS_NANOS
public static final long MINUTE_AS_NANOS
public static final long SECOND_AS_NANOS
public static final long MILLISECOND_AS_NANOS
public static final long MICOSECOND_AS_NANOS
