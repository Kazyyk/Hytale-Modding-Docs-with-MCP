# MapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: Map<String, V>> | Implements: Codec<Map<String, V>>, WrappedCodec<V>

public class MapCodec<V, M extends Map<String, V>> implements Codec<Map<String, V>>, WrappedCodec<V>

## Fields

- public static final MapCodec<String, Map<String, String>> STRING_HASH_MAP_CODEC
- private final Codec<V> codec
- private final Supplier<M> supplier
- private final boolean unmodifiable
- BsonDocument bsonDocument
- Map<String, V> map
- String key
- BsonValue value
- ObjectSchema schema
- Schema childSchema

## Constructors

- public MapCodec(Codec<V> codec, Supplier<M> supplier)
- public MapCodec(Codec<V> codec, Supplier<M> supplier, boolean unmodifiable)

## Methods

- public Codec<V> getChildCodec()
- public Map<String, V> decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", value, extraInfo, var13)
- public BsonValue encode(@Nonnull Map<String, V> map, ExtraInfo extraInfo)
- public Map<String, V> decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", reader, extraInfo, var9)
- public Schema toSchema(@Nonnull SchemaContext context)
