# ObjectMapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: Map<K, V>> | Implements: Codec<Map<K, V>>, WrappedCodec<V>

public class ObjectMapCodec<K, V, M extends Map<K, V>> implements Codec<Map<K, V>>, WrappedCodec<V>

## Fields

- private final Codec<V> codec
- private final Supplier<M> supplier
- private final Function<K, String> keyToString
- private final Function<String, K> stringToKey
- private final boolean unmodifiable
- BsonDocument bsonDocument
- Map<K, V> map
- String key
- BsonValue value
- K decodedKey
- ObjectSchema s

## Constructors

- public ObjectMapCodec(Codec<V> codec, Supplier<M> supplier, Function<K, String> keyToString, Function<String, K> stringToKey)
- public ObjectMapCodec(Codec<V> codec, Supplier<M> supplier, Function<K, String> keyToString, Function<String, K> stringToKey, boolean unmodifiable)

## Methods

- public Codec<V> getChildCodec()
- public Map<K, V> decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", value, extraInfo, var14)
- public BsonValue encode(@Nonnull Map<K, V> map, ExtraInfo extraInfo)
- public Map<K, V> decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", reader, extraInfo, var10)
- public Schema toSchema(@Nonnull SchemaContext context)

## Related Types

- MapCodec

Also in this package: EnumMapCodec, Float2ObjectMapCodec, Int2ObjectMapCodec, MapCodec, MergedEnumMapCodec, Object2DoubleMapCodec, Object2FloatMapCodec, Object2IntMapCodec, Short2ObjectMapCodec

Complete API:
  public Codec<V> getChildCodec()
  public Map<K,V> decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(Map<K,V> map, ExtraInfo extraInfo)
  public Map<K,V> decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
private final Codec<V> codec
private final Supplier<M> supplier
private final Function<K,String> keyToString
private final Function<String,K> stringToKey
private final boolean unmodifiable
