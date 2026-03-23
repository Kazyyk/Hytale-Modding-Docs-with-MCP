# Object2DoubleMapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: null | Implements: Codec<Object2DoubleMap<T>>, WrappedCodec<T>

public class Object2DoubleMapCodec<T> implements Codec<Object2DoubleMap<T>>, WrappedCodec<T>

## Fields

- private final Codec<T> keyCodec
- private final Supplier<Object2DoubleMap<T>> supplier
- private final boolean unmodifiable
- BsonDocument bsonDocument
- Object2DoubleMap<T> map
- T decodedKey
- ObjectIterator var4
- T key
- String encodedKey
- ObjectSchema s
- StringSchema key
- String title

## Constructors

- public Object2DoubleMapCodec(Codec<T> keyCodec, Supplier<Object2DoubleMap<T>> supplier, boolean unmodifiable)
- public Object2DoubleMapCodec(Codec<T> keyCodec, Supplier<Object2DoubleMap<T>> supplier)

## Methods

- public Codec<T> getChildCodec()
- public Object2DoubleMap<T> decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- public BsonValue encode(@Nonnull Object2DoubleMap<T> map, ExtraInfo extraInfo)
- public Object2DoubleMap<T> decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- public Schema toSchema(@Nonnull SchemaContext context)

## Related Types

- MapCodec
