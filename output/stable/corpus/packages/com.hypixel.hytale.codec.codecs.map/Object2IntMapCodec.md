# Object2IntMapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: null | Implements: Codec<Object2IntMap<T>>, WrappedCodec<T>

public class Object2IntMapCodec<T> implements Codec<Object2IntMap<T>>, WrappedCodec<T>

## Fields

- private final Codec<T> keyCodec
- private final Supplier<Object2IntMap<T>> supplier
- private final boolean unmodifiable
- BsonDocument bsonDocument
- Object2IntMap<T> map
- T decodedKey
- ObjectIterator var4
- T key
- String encodedKey
- ObjectSchema s
- StringSchema key
- String title

## Constructors

- public Object2IntMapCodec(Codec<T> keyCodec, Supplier<Object2IntMap<T>> supplier, boolean unmodifiable)
- public Object2IntMapCodec(Codec<T> keyCodec, Supplier<Object2IntMap<T>> supplier)

## Methods

- public Codec<T> getChildCodec()
- public Object2IntMap<T> decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- public BsonValue encode(@Nonnull Object2IntMap<T> map, ExtraInfo extraInfo)
- public Object2IntMap<T> decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- public Schema toSchema(@Nonnull SchemaContext context)

## Related Types

- MapCodec
