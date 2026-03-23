# Codec

Type: interface | Package: com.hypixel.hytale.codec | Extends: RawJsonCodec<T>, SchemaConvertable<T>

public interface Codec<T> extends RawJsonCodec<T>, SchemaConvertable<T>

Core serialization/deserialization interface for the Hytale codec system. Provides encode/decode for BSON and JSON formats. Includes static codec instances for all primitive types, arrays, strings, paths, durations, instants, UUIDs, and log levels.

## Fields

- static | StringCodec | STRING | String codec
- static | BooleanCodec | BOOLEAN | Boolean codec
- static | DoubleCodec | DOUBLE | Double codec
- static | FloatCodec | FLOAT | Float codec
- static | ByteCodec | BYTE | Byte codec
- static | ShortCodec | SHORT | Short codec
- static | IntegerCodec | INTEGER | Integer codec
- static | LongCodec | LONG | Long codec
- static | DoubleArrayCodec | DOUBLE_ARRAY | Double array codec
- static | FloatArrayCodec | FLOAT_ARRAY | Float array codec
- static | IntArrayCodec | INT_ARRAY | Int array codec
- static | LongArrayCodec | LONG_ARRAY | Long array codec
- static | ArrayCodec<String> | STRING_ARRAY | String array codec
- static | FunctionCodec<String, Path> | PATH | Path codec
- static | FunctionCodec<String, Instant> | INSTANT | Instant codec
- static | FunctionCodec<String, Duration> | DURATION | Duration codec
- static | FunctionCodec<Double, Duration> | DURATION_SECONDS | Duration-as-seconds codec
- static | FunctionCodec<String, Level> | LOG_LEVEL | Log level codec
- static | UUIDBinaryCodec | UUID_BINARY | UUID binary codec
- static | FunctionCodec<String, UUID> | UUID_STRING | UUID string codec

## Methods

- T decode(BsonValue bsonValue, ExtraInfo extraInfo)
- BsonValue encode(T value, ExtraInfo extraInfo)
- default T decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
- static boolean isNullBsonValue(BsonValue bsonValue)

Known implementors: ACodecMapCodec, AMapProvidedMapCodec, ArrayCodec, ArrayOrNull, BoolDoublePairCodec, BooleanCodec, BooleanOrSchema, BsonDocumentCodec, BsonFunctionCodec, BuilderCodec, ByteCodec, ColorAlphaCodec, ColorCodec, ContainedAssetCodec, DirectDecodeCodec, DoubleArrayCodec, DoubleCodec, DoubleOrSchema, EnumCodec, EnumMapCodec, Float2ObjectMapCodec, FloatArrayCodec, FloatCodec, FloatRangeArrayCodec, FunctionCodec, InetSocketAddressCodec, InheritCodec, Int2ObjectMapCodec, IntArrayCodec, IntRangeArrayCodec, IntegerCodec, IntegerOrSchema, InteractionPriorityCodec, ItemOrItems, LocalizableStringCodec, LongArrayCodec, LongCodec, MapCodec, MaybeBoolCodec, MergedEnumMapCodec, MetricResultsCodec, MetricsRegistry, Object2DoubleMapCodec, Object2FloatMapCodec, Object2IntMapCodec, ObjectMapCodec, ParamValueCodec, SetCodec, Short2ObjectMapCodec, ShortCodec, StoredCodec, StringCodec, StringIntegerCodec, StringOrBlank, UUIDBinaryCodec, ValidatableCodec, ValueCodec, Vector2dArrayCodec, Vector3dArrayCodec, Vector3iArrayCodec, WeightedMapCodec

Also in this package: DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, InheritCodec, KeyedCodec, PrimitiveCodec, RawJsonCodec, RawJsonInheritCodec, VersionedExtraInfo, WrappedCodec

Complete API:
  default T decode(BsonValue bsonValue)
  T decode(BsonValue var1, ExtraInfo var2)
  default BsonValue encode(T t)
  BsonValue encode(T var1, ExtraInfo var2)
  default T decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  static boolean isNullBsonValue(BsonValue bsonValue)

Fields:
BsonDocumentCodec BSON_DOCUMENT
StringCodec STRING
BooleanCodec BOOLEAN
DoubleCodec DOUBLE
FloatCodec FLOAT
ByteCodec BYTE
ShortCodec SHORT
IntegerCodec INTEGER
LongCodec LONG
Pattern BASE64_PATTERN
Codec<byte[]> BYTE_ARRAY
DoubleArrayCodec DOUBLE_ARRAY
FloatArrayCodec FLOAT_ARRAY
IntArrayCodec INT_ARRAY
LongArrayCodec LONG_ARRAY
ArrayCodec<String> STRING_ARRAY
FunctionCodec<String,Path> PATH
FunctionCodec<String,Instant> INSTANT
FunctionCodec<String,Duration> DURATION
FunctionCodec<Double,Duration> DURATION_SECONDS
FunctionCodec<String,Level> LOG_LEVEL
UUIDBinaryCodec UUID_BINARY
FunctionCodec<String,UUID> UUID_STRING
