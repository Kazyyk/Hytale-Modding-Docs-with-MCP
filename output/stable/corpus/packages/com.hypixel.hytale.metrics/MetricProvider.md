# MetricProvider

Type: interface | Package: com.hypixel.hytale.metrics

public interface MetricProvider

Functional interface for metric value providers. Implementations encode their metric data to `BsonValue` via the `encode(ExtraInfo)` method.

Known implementors: BlockSelection, BuilderToolsPlugin, ChunkGenerator, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, Player, PlayerRef, Universe

Also in this package: ExecutorMetric, ExecutorMetricsRegistry, InitStackThread, JVMMetrics, Metric, MetricResults, MetricResultsCodec, MetricsRegistry, ThreadMetricData

Complete API:
  MetricResults toMetricResults()
  static Function<T,MetricProvider> maybe(Function<T,R> func)
