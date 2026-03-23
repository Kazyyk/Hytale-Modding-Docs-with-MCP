# MetricResults

Type: class | Package: com.hypixel.hytale.metrics

public class MetricResults

Collects and merges encoded metric results from multiple `MetricsRegistry` instances. Provides iteration over name-value pairs and merging of overlapping results.

Also in this package: ExecutorMetric, ExecutorMetricsRegistry, InitStackThread, JVMMetrics, Metric, MetricProvider, MetricResultsCodec, MetricsRegistry, ThreadMetricData

Complete API:
  protected BsonDocument getBson()

Fields:
public static final Codec<MetricResults> CODEC
public static final Codec<MetricResults[]> ARRAY_CODEC
private final BsonDocument bson
