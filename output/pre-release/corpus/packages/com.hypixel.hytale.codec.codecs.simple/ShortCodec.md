# ShortCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<Short>, RawJsonCodec<Short>, PrimitiveCodec

public class ShortCodec implements Codec<Short>, RawJsonCodec<Short>, PrimitiveCodec

## Methods

- @Nonnull public Short decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Short t, ExtraInfo extraInfo)
- @Nonnull public Short decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)

Also in this package: BooleanCodec, ByteCodec, DoubleCodec, FloatCodec, IntegerCodec, LongCodec, StringCodec

Complete API:
  public Short decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(Short t, ExtraInfo extraInfo)
  public Short decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
