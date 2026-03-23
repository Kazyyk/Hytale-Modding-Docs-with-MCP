# FloatCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<Float>, RawJsonCodec<Float>, PrimitiveCodec

public class FloatCodec implements Codec<Float>, RawJsonCodec<Float>, PrimitiveCodec

## Fields

- public static final String STRING_SCHEMA_PATTERN

## Methods

- @Nonnull public Float decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Float t, ExtraInfo extraInfo)
- @Nonnull public Float decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable Float def)
- public static float decodeFloat(@Nonnull BsonValue value)
- public static float readFloat(@Nonnull RawJsonReader reader)
