# MetricsRegistry

Type: class | Package: com.hypixel.hytale.metrics

public class MetricsRegistry

Generic registry that maps string identifiers to metric provider functions. Supports nested registries, codec-based value encoding, and BSON serialization. Type parameter `T` is the metric context type.

Known subclasses: ExecutorMetricsRegistry

Also in this package: ExecutorMetric, ExecutorMetricsRegistry, InitStackThread, JVMMetrics, Metric, MetricProvider, MetricResults, MetricResultsCodec, ThreadMetricData

Complete API:
  public MetricsRegistry<T> register(String id, MetricsRegistry<Void> metricsRegistry)
  public MetricsRegistry<T> register(String id, Function<T,R> func, Codec<R> codec)
  public MetricsRegistry<T> register(String id, Function<T,R> func)
  public MetricsRegistry<T> register(String id, Function<T,R> func, Function<R,MetricsRegistry<R>> codecFunc)
  public T decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(T t, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  public MetricResults toMetricResults(T t)
  public BsonValue dumpToBson(T t)
  public Path dumpToJson(T t)
  public void dumpToJson(Path path, T t)
  public static Path createDumpPath(String ext)
  public static Path createDumpPath(Path dir, String ext)
  public static Path createDumpPath(String prefix, String ext)
  public static Path createDatePath(Path dir, String prefix, String suffix)

Fields:
private static final HytaleLogger LOGGER
public static final JsonWriterSettings JSON_SETTINGS
private static final EncoderContext ENCODER_CONTEXT
private static final BsonDocumentCodec BSON_DOCUMENT_CODEC
private final Function<T,MetricProvider> appendFunc
private final StampedLock lock
private final Map<String,MetricsRegistry.Metric<T,?>> map
