# CompletableFutureUtil

Type: class | Package: com.hypixel.hytale.common.util

public class CompletableFutureUtil

Utilities for combining and transforming `CompletableFuture` instances including `allOf` variants and exception handling.

Also in this package: AddressType, ArrayUtil, AudioUtil, BitSetUtil, BitUtil, ExceptionUtil, FormatUtil, GCUtil, HardwareUtil, ListUtil, MapUtil, MatchType, NetworkUtil, PathUtil, PatternUtil, ProgressConsumer, RandomUtil, StringCompareUtil, StringUtil, SystemType (and 3 more)

Complete API:
  public static CompletableFuture<T> whenComplete(CompletableFuture<T> future, CompletableFuture<T> callee)
  public static boolean isCanceled(Throwable throwable)
  public static CompletableFuture<T> _catch(CompletableFuture<T> future)
  public static CompletableFuture<T> completionCanceled()
  public static void joinWithProgress(List<CompletableFuture<?>> list, CompletableFutureUtil.ProgressConsumer callback, int millisSleep, int millisProgress)

Fields:
public static final Function<Throwable,?> fn
