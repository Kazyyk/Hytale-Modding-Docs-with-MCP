# DoubleCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<Double>, RawJsonCodec<Double>, PrimitiveCodec

public class DoubleCodec implements Codec<Double>, RawJsonCodec<Double>, PrimitiveCodec

## Methods

- @Nonnull public Double decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Double t, ExtraInfo extraInfo)
- @Nonnull public Double decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable Double def)
