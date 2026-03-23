# ByteCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<Byte>, RawJsonCodec<Byte>, PrimitiveCodec

public class ByteCodec implements Codec<Byte>, RawJsonCodec<Byte>, PrimitiveCodec

## Methods

- @Nonnull public Byte decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Byte t, ExtraInfo extraInfo)
- @Nonnull public Byte decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable Byte def)

Also in this package: BooleanCodec, DoubleCodec, FloatCodec, IntegerCodec, LongCodec, ShortCodec, StringCodec

Complete API:
  public Byte decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(Byte t, ExtraInfo extraInfo)
  public Byte decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  public Schema toSchema(SchemaContext context, Byte def)
