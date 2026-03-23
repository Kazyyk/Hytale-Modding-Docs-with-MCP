# TickingThread

Type: class | Package: com.hypixel.hytale.server.core.util.thread | Implements: Runnable

public abstract class TickingThread implements Runnable

## Fields

- public static final int NANOS_IN_ONE_MILLI
- public static final int NANOS_IN_ONE_SECOND
- public static final int TPS
- public static long SLEEP_OFFSET
- private final String threadName
- private final boolean daemon
- private final AtomicBoolean needsShutdown
- private int tps
- private int tickStepNanos
- private HistoricMetric bufferedTickLengthMetricSet
- private Thread thread
- private CompletableFuture<Void> startedFuture
- private PluginIdentifier possibleFailureCause
- private Throwable failureException

## Methods

- @Override public void run()
- protected boolean isIdle()
- protected abstract void tick(float var1)
- protected void onStart()
- protected abstract void onShutdown()
- @Nonnull public CompletableFuture<Void> start()
- public boolean interrupt()
- public void stop()
- public void setTps(int tps)
- public int getTps()
- public int getTickStepNanos()
- public HistoricMetric getBufferedTickLengthMetricSet()
- public void clearMetrics()
- public void debugAssertInTickingThread()
- public boolean isInThread()
- public boolean isStarted()
- @Nullable public PluginIdentifier getPossibleFailureCause()
- @Nullable public Throwable getFailureException()
- @Deprecated protected void setThread(Thread thread)
- @Nullable protected Thread getThread()
