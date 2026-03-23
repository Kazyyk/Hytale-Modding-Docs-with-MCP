# BooleanCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<Boolean>, RawJsonCodec<Boolean>, PrimitiveCodec

public class BooleanCodec implements Codec<Boolean>, RawJsonCodec<Boolean>, PrimitiveCodec

## Methods

- @Nonnull public Boolean decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Boolean t, ExtraInfo extraInfo)
- @Nonnull public Boolean decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable Boolean def)
