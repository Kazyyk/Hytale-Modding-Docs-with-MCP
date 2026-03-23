# IntegerCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<Integer>, RawJsonCodec<Integer>, PrimitiveCodec

public class IntegerCodec implements Codec<Integer>, RawJsonCodec<Integer>, PrimitiveCodec

## Methods

- @Nonnull public Integer decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Integer t, ExtraInfo extraInfo)
- @Nonnull public Integer decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable Integer def)
