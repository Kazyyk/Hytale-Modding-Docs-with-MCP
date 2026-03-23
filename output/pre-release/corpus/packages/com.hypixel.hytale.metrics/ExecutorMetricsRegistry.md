# ExecutorMetricsRegistry

Type: class | Package: com.hypixel.hytale.metrics | Extends: MetricsRegistry<T>

public class ExecutorMetricsRegistry extends MetricsRegistry<T>

A metrics registry that ensures encoding runs on the metric's own executor thread via `ExecutorMetric.isInThread()`. Guarantees thread-safe metric collection for executor-bound metrics. Type parameter `T` must implement `ExecutorMetric`.
