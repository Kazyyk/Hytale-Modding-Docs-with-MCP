# Short2ObjectMapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: null | Implements: Codec<Short2ObjectMap<T>>, WrappedCodec<T>

public class Short2ObjectMapCodec<T> implements Codec<Short2ObjectMap<T>>, WrappedCodec<T>

## Fields

- private final Codec<T> valueCodec
- private final Supplier<Short2ObjectMap<T>> supplier
- private final boolean unmodifiable
- BsonDocument bsonDocument
- Short2ObjectMap<T> map
- String key
- BsonValue value
- short decodedKey
- ObjectIterator var4
- it.unimi.dsi.fastutil.shorts.Short2ObjectMap.Entry<T> entry
- ObjectSchema s
- StringSchema name

## Constructors

- public Short2ObjectMapCodec(Codec<T> valueCodec, Supplier<Short2ObjectMap<T>> supplier, boolean unmodifiable)
- public Short2ObjectMapCodec(Codec<T> valueCodec, Supplier<Short2ObjectMap<T>> supplier)

## Methods

- public Codec<T> getChildCodec()
- public Short2ObjectMap<T> decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", value, extraInfo, var13)
- public BsonValue encode(@Nonnull Short2ObjectMap<T> map, ExtraInfo extraInfo)
- public Short2ObjectMap<T> decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", reader, extraInfo, var9)
- public Schema toSchema(@Nonnull SchemaContext context)

## Related Types

- MapCodec
- ObjectMapCodec
