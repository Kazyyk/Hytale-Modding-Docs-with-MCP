# HardwareUtil

Type: class | Package: com.hypixel.hytale.common.util

public class HardwareUtil

Hardware information gathering: CPU model, core count, memory, OS details, Java version.

Also in this package: AddressType, ArrayUtil, AudioUtil, BitSetUtil, BitUtil, CompletableFutureUtil, ExceptionUtil, FormatUtil, GCUtil, ListUtil, MapUtil, MatchType, NetworkUtil, PathUtil, PatternUtil, ProgressConsumer, RandomUtil, StringCompareUtil, StringUtil, SystemType (and 3 more)

Complete API:
  private static String runCommand(String command)
  private static UUID parseUuidFromOutput(String output)
  private static UUID readMachineIdFile(Path path)
  public static UUID getUUID()

Fields:
private static final HytaleLogger LOGGER
private static final int PROCESS_TIMEOUT_SECONDS
private static final Pattern UUID_PATTERN
private static final Supplier<UUID> WINDOWS
private static final Supplier<UUID> MAC
private static final Supplier<UUID> LINUX
