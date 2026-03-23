# Object2FloatMapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: null | Implements: Codec<Object2FloatMap<T>>, WrappedCodec<T>

public class Object2FloatMapCodec<T> implements Codec<Object2FloatMap<T>>, WrappedCodec<T>

## Fields

- private final Codec<T> keyCodec
- private final Supplier<Object2FloatMap<T>> supplier
- private final boolean unmodifiable
- BsonDocument bsonDocument
- Object2FloatMap<T> map
- T decodedKey
- ObjectIterator var4
- T key
- String encodedKey
- ObjectSchema s
- StringSchema key
- String title

## Constructors

- public Object2FloatMapCodec(Codec<T> keyCodec, Supplier<Object2FloatMap<T>> supplier, boolean unmodifiable)
- public Object2FloatMapCodec(Codec<T> keyCodec, Supplier<Object2FloatMap<T>> supplier)

## Methods

- public Codec<T> getChildCodec()
- public Object2FloatMap<T> decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- public BsonValue encode(@Nonnull Object2FloatMap<T> map, ExtraInfo extraInfo)
- public Object2FloatMap<T> decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- public Schema toSchema(@Nonnull SchemaContext context)

## Related Types

- MapCodec

Also in this package: EnumMapCodec, Float2ObjectMapCodec, Int2ObjectMapCodec, MapCodec, MergedEnumMapCodec, Object2DoubleMapCodec, Object2IntMapCodec, ObjectMapCodec, Short2ObjectMapCodec

Complete API:
  public Codec<T> getChildCodec()
  public Object2FloatMap<T> decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(Object2FloatMap<T> map, ExtraInfo extraInfo)
  public Object2FloatMap<T> decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
private final Codec<T> keyCodec
private final Supplier<Object2FloatMap<T>> supplier
private final boolean unmodifiable
