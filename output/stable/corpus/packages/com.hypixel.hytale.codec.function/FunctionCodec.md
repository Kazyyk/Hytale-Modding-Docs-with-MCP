# FunctionCodec

Type: class | Package: com.hypixel.hytale.codec.function | Implements: Codec

@Deprecated public class FunctionCodec<T, R> implements Codec

## Fields

- private final Codec<T> codec
- private final Function<T,R> decode
- private final Function<R,T> encode

## Methods

- @Nonnull @Override public R decode(BsonValue bsonValue, ExtraInfo extraInfo)
- @Override public BsonValue encode(R r, ExtraInfo extraInfo)
- @Nonnull @Override public R decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException
- @Nonnull @Override public Schema toSchema(SchemaContext context)

Also in this package: BsonFunctionCodec

Complete API:
  public R decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(R r, ExtraInfo extraInfo)
  public R decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
private final Codec<T> codec
private final Function<T,R> decode
private final Function<R,T> encode
