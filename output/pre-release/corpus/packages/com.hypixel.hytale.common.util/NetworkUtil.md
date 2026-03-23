# NetworkUtil

Type: class | Package: com.hypixel.hytale.common.util

public class NetworkUtil

Network utilities: IP resolution, port checking, external IP detection, HTTP request helpers.

Also in this package: AddressType, ArrayUtil, AudioUtil, BitSetUtil, BitUtil, CompletableFutureUtil, ExceptionUtil, FormatUtil, GCUtil, HardwareUtil, ListUtil, MapUtil, MatchType, PathUtil, PatternUtil, ProgressConsumer, RandomUtil, StringCompareUtil, StringUtil, SystemType (and 3 more)

Complete API:
  public static InetAddress getFirstNonLoopbackAddress()
  public static InetAddress getFirstAddressWith(NetworkUtil.AddressType include)
  public static InetAddress getFirstAddressWithout(NetworkUtil.AddressType include)
  public static InetAddress getFirstAddressWith(NetworkUtil.AddressType[] include, NetworkUtil.AddressType[] exclude)
  public static boolean addressMatchesAll(InetAddress address, NetworkUtil.AddressType types)
  public static boolean addressMatchesAny(InetAddress address)
  public static boolean addressMatchesAny(InetAddress address, NetworkUtil.AddressType types)
  public static String toSocketString(InetSocketAddress address)
  public static String getHostName()
  private static String firstLineIfExists(String path)
  private static boolean isAcceptableHostName(String name)
  private static boolean isIPv4Literal(String name)
  private static boolean isLikelyIPv6Literal(String name)

Fields:
public static Inet6Address ANY_IPV6_ADDRESS
public static Inet4Address ANY_IPV4_ADDRESS
public static Inet6Address LOOPBACK_IPV6_ADDRESS
public static Inet4Address LOOPBACK_IPV4_ADDRESS
