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
