# ExecutorMetricsRegistry

Type: class | Package: com.hypixel.hytale.metrics | Extends: MetricsRegistry<T>

public class ExecutorMetricsRegistry extends MetricsRegistry<T>

A metrics registry that ensures encoding runs on the metric's own executor thread via `ExecutorMetric.isInThread()`. Guarantees thread-safe metric collection for executor-bound metrics. Type parameter `T` must implement `ExecutorMetric`.

Also in this package: ExecutorMetric, InitStackThread, JVMMetrics, Metric, MetricProvider, MetricResults, MetricResultsCodec, MetricsRegistry, ThreadMetricData

Complete API:
  public BsonValue encode(T t, ExtraInfo extraInfo)
  public ExecutorMetricsRegistry<T> register(String id, Function<T,R> func)
  public ExecutorMetricsRegistry<T> register(String id, Function<T,R> func, Codec<R> codec)
  public ExecutorMetricsRegistry<T> register(String id, MetricsRegistry<Void> metricsRegistry)
  public ExecutorMetricsRegistry<T> register(String id, Function<T,R> func, Function<R,MetricsRegistry<R>> codecFunc)
