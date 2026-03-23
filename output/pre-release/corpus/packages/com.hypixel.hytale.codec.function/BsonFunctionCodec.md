# BsonFunctionCodec

Type: class | Package: com.hypixel.hytale.codec.function | Implements: Codec, WrappedCodec

@Deprecated public class BsonFunctionCodec<T> implements Codec, WrappedCodec

## Fields

- private final Codec<T> codec
- private final BiFunction<T,BsonValue,T> decode
- private final BiFunction<BsonValue,T,BsonValue> encode

## Methods

- @Override public T decode(BsonValue bsonValue, ExtraInfo extraInfo)
- @Override public BsonValue encode(T r, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(SchemaContext context)
- @Nonnull @Override public Codec<T> getChildCodec()

Known subclasses: DocumentContainingCodec

Also in this package: FunctionCodec

Complete API:
  public T decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(T r, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  public Codec<T> getChildCodec()

Fields:
private final Codec<T> codec
private final BiFunction<T,BsonValue,T> decode
private final BiFunction<BsonValue,T,BsonValue> encode
