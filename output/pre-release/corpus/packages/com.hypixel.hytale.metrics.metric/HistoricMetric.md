# HistoricMetric

Type: class | Package: com.hypixel.hytale.metrics.metric

public class HistoricMetric

Provides HistoricMetric functionality within the metric subsystem.

## Constants

- public static final HistoricMetric[] EMPTY_ARRAY

## Fields

- private final long[] periodsNanos
- @Nonnull private final AverageCollector[] periodAverages
- @Nonnull private final int[] startIndices
- private final int bufferSize
- @Nonnull private final long[] timestamps
- @Nonnull private final long[] values

## Methods

- private HistoricMetric()
- private HistoricMetric(@Nonnull HistoricMetric.Builder builder)
- public long[] getPeriodsNanos()
- public long calculateMin(int periodIndex)
- public double getAverage(int periodIndex)
- public long calculateMax(int periodIndex)
- public void clear()
- public void add(long timestampNanos, long value)
- public long[] getTimestamps(int periodIndex)
- public long[] getValues(int periodIndex)
- public long[] getAllTimestamps()
- public long[] getAllValues()
- public void setAllTimestamps(@Nonnull long[] timestamps)
- public void setAllValues(@Nonnull long[] values)
- public long getLastValue()
- @Nonnull public static HistoricMetric.Builder builder(long minimumInterval, @Nonnull TimeUnit unit)

Also in this package: AverageCollector, Builder, Metric, SynchronizedAverageCollector

Complete API:
  public long[] getPeriodsNanos()
  public long calculateMin(int periodIndex)
  public double getAverage(int periodIndex)
  public long calculateMax(int periodIndex)
  public void clear()
  public void add(long timestampNanos, long value)
  public long[] getTimestamps(int periodIndex)
  public long[] getValues(int periodIndex)
  public long[] getAllTimestamps()
  public long[] getAllValues()
  public void setAllTimestamps(long[] timestamps)
  public void setAllValues(long[] values)
  public long getLastValue()
  public static HistoricMetric.Builder builder(long minimumInterval, TimeUnit unit)

Fields:
public static final HistoricMetric[] EMPTY_ARRAY
public static final Codec<HistoricMetric> METRICS_CODEC
private final long[] periodsNanos
private final AverageCollector[] periodAverages
private final int[] startIndices
private final int bufferSize
private final long[] timestamps
private final long[] values
int nextIndex
