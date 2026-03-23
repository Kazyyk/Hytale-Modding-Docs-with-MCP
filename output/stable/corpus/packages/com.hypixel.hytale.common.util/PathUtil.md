# PathUtil

Type: class | Package: com.hypixel.hytale.common.util

public class PathUtil

File path utilities: safe path resolution within directories, path normalization, traversal prevention.

Also in this package: AddressType, ArrayUtil, AudioUtil, BitSetUtil, BitUtil, CompletableFutureUtil, ExceptionUtil, FormatUtil, GCUtil, HardwareUtil, ListUtil, MapUtil, MatchType, NetworkUtil, PatternUtil, ProgressConsumer, RandomUtil, StringCompareUtil, StringUtil, SystemType (and 3 more)

Complete API:
  public static void addTrustedRoot(Path root)
  public static boolean isInTrustedRoot(Path path)
  public static Path getParent(Path path)
  public static Path relativize(Path pathA, Path pathB)
  public static Path relativizePretty(Path pathA, Path pathB)
  public static boolean isValidName(String name)
  public static Path resolvePathWithinDir(Path directory, String relativePath)
  public static Path resolveName(Path directory, String name)
  public static Path get(String path)
  public static Path get(Path path)
  public static Path getUserHome()
  public static String getFileName(URL extUrl)
  public static boolean isChildOf(Path parent, Path child)
  public static void forEachParent(Path path, Path limit, Consumer<Path> consumer)
  public static String getFileExtension(Path path)
  public static String toUnixPathString(Path path)

Fields:
private static final Pattern PATH_PATTERN
private static final Set<Path> TRUSTED_PATH_ROOTS
