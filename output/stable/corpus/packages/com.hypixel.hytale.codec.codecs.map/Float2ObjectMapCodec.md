# Float2ObjectMapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: null | Implements: Codec<Float2ObjectMap<T>>, WrappedCodec<T>

public class Float2ObjectMapCodec<T> implements Codec<Float2ObjectMap<T>>, WrappedCodec<T>

## Fields

- public static final Pattern FLOAT_PATTERN
- private final Codec<T> valueCodec
- private final Supplier<Float2ObjectMap<T>> supplier
- private final boolean unmodifiable
- BsonDocument bsonDocument
- Float2ObjectMap<T> map
- String key
- BsonValue value
- float decodedKey
- ObjectIterator var4
- it.unimi.dsi.fastutil.floats.Float2ObjectMap.Entry<T> entry
- ObjectSchema s
- StringSchema name

## Constructors

- public Float2ObjectMapCodec(Codec<T> valueCodec, Supplier<Float2ObjectMap<T>> supplier, boolean unmodifiable)
- public Float2ObjectMapCodec(Codec<T> valueCodec, Supplier<Float2ObjectMap<T>> supplier)

## Methods

- public Codec<T> getChildCodec()
- public Float2ObjectMap<T> decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", value, extraInfo, var13)
- public BsonValue encode(@Nonnull Float2ObjectMap<T> map, ExtraInfo extraInfo)
- public Float2ObjectMap<T> decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", reader, extraInfo, var9)
- public Schema toSchema(@Nonnull SchemaContext context)

## Related Types

- MapCodec
- ObjectMapCodec
