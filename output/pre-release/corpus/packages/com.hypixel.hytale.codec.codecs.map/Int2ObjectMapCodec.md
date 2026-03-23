# Int2ObjectMapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: null | Implements: Codec<Int2ObjectMap<T>>, WrappedCodec<T>

public class Int2ObjectMapCodec<T> implements Codec<Int2ObjectMap<T>>, WrappedCodec<T>

## Fields

- private final Codec<T> valueCodec
- private final Supplier<Int2ObjectMap<T>> supplier
- private final boolean unmodifiable
- BsonDocument bsonDocument
- Int2ObjectMap<T> map
- String key
- BsonValue value
- int decodedKey
- ObjectIterator var4
- it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry<T> entry
- ObjectSchema s
- StringSchema name

## Constructors

- public Int2ObjectMapCodec(Codec<T> valueCodec, Supplier<Int2ObjectMap<T>> supplier, boolean unmodifiable)
- public Int2ObjectMapCodec(Codec<T> valueCodec, Supplier<Int2ObjectMap<T>> supplier)

## Methods

- public Codec<T> getChildCodec()
- public Int2ObjectMap<T> decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", value, extraInfo, var13)
- public BsonValue encode(@Nonnull Int2ObjectMap<T> map, ExtraInfo extraInfo)
- public Int2ObjectMap<T> decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", reader, extraInfo, var9)
- public Schema toSchema(@Nonnull SchemaContext context)

## Related Types

- MapCodec
- ObjectMapCodec
