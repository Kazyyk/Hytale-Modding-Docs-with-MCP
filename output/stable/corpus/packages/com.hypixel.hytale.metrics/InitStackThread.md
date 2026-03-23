# InitStackThread

Type: interface | Package: com.hypixel.hytale.metrics

public interface InitStackThread

Interface for threads that capture their initialization stack trace. Exposes `getInitStack()` returning the `StackTraceElement[]` from thread creation.

Known implementors: WorkerThread

Also in this package: ExecutorMetric, ExecutorMetricsRegistry, JVMMetrics, Metric, MetricProvider, MetricResults, MetricResultsCodec, MetricsRegistry, ThreadMetricData

Complete API:
  StackTraceElement[] getInitStack()
