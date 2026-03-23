# JVMMetrics

Type: class | Package: com.hypixel.hytale.metrics

public class JVMMetrics

Collects JVM-level metrics including memory usage (heap, non-heap, pools), garbage collection stats, thread states, class loading counts, and CPU load. All data is encoded via BSON codecs.

Also in this package: ExecutorMetric, ExecutorMetricsRegistry, InitStackThread, Metric, MetricProvider, MetricResults, MetricResultsCodec, MetricsRegistry, ThreadMetricData

Fields:
public static final MetricsRegistry<ClassLoader> CLASS_LOADER_METRICS_REGISTRY
public static final MetricsRegistry<MemoryUsage> MEMORY_USAGE_METRICS_REGISTRY
public static final MetricsRegistry<GarbageCollectorMXBean> GARBAGE_COLLECTOR_METRICS_REGISTRY
public static final MetricsRegistry<MemoryPoolMXBean> MEMORY_POOL_METRICS_REGISTRY
public static final MetricsRegistry<Void> METRICS_REGISTRY
