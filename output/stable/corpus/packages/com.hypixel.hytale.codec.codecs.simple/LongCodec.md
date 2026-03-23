# LongCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<Long>, RawJsonCodec<Long>, PrimitiveCodec

public class LongCodec implements Codec<Long>, RawJsonCodec<Long>, PrimitiveCodec

## Methods

- @Nonnull public Long decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Long t, ExtraInfo extraInfo)
- @Nonnull public Long decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable Long def)
