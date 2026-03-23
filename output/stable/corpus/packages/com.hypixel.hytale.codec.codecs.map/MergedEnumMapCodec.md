# MergedEnumMapCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.map | Extends: Enum<K>, V, M extends Enum<M>> | Implements: Codec<Map<K, V>>, WrappedCodec<V>

public class MergedEnumMapCodec<K extends Enum<K>, V, M extends Enum<M>> implements Codec<Map<K, V>>, WrappedCodec<V>

## Fields

- private final Class<K> clazz
- private final K[] enumConstants
- private final String[] enumKeys
- private final Class<M> mergeClazz
- private final M[] mergeEnumConstants
- private final String[] mergeEnumKeys
- private final Function<M, K[]> unmergeFunction
- private final BiFunction<V, V, V> mergeResultFunction
- private final EnumCodec.EnumStyle enumStyle
- private final Codec<V> codec
- private final Supplier<EnumMap<K, V>> supplier
- private final boolean unmodifiable
- EnumCodec.EnumStyle currentStyle
- K e
- EnumCodec.EnumStyle currentMergeStyle
- M e
- BsonDocument bsonDocument
- Map<K, V> map
- String key
- BsonValue value
- V decode
- K k
- V v
- K[] mergedEnum
- ObjectSchema schema
- StringSchema values
- Schema childSchema
- Map<String, Schema> properties
- String[] enum_
- String entry
- M m

## Constructors

- public MergedEnumMapCodec(@Nonnull Class<K> clazz, @Nonnull Class<M> mergeClass, Function<M, K[]> unmergeFunction, BiFunction<V, V, V> mergeResultFunction, Codec<V> codec)
- public MergedEnumMapCodec(@Nonnull Class<K> clazz,
        @Nonnull Class<M> mergeClass,
        Function<M, K[]> unmergeFunction,
        BiFunction<V, V, V> mergeResultFunction,
        Codec<V> codec,
        Supplier<EnumMap<K, V>> supplier)` |
| `public` | `MergedEnumMapCodec(@Nonnull Class<K> clazz,
        @Nonnull Class<M> mergeClass,
        Function<M, K[]> unmergeFunction,
        BiFunction<V, V, V> mergeResultFunction,
        Codec<V> codec,
        Supplier<EnumMap<K, V>> supplier,
        boolean unmodifiable)` |
| `public` | `MergedEnumMapCodec(@Nonnull Class<K> clazz,
        EnumCodec.EnumStyle enumStyle,
        @Nonnull Class<M> mergeClass,
        Function<M, K[]> unmergeFunction,
        BiFunction<V, V, V> mergeResultFunction,
        Codec<V> codec,
        Supplier<EnumMap<K, V>> supplier,
        boolean unmodifiable)` |

## Methods

- public Codec<V> getChildCodec()
- public Map<K, V> decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", value, extraInfo, var13)
- private void put0(@Nonnull Map<K, V> map, String key, V decode)
- public BsonValue encode(@Nonnull Map<K, V> map, ExtraInfo extraInfo)
- public Map<K, V> decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)
- throw new CodecException("Failed to decode", reader, extraInfo, var9)
- public Schema toSchema(@Nonnull SchemaContext context)
- protected K getEnum(String value)
- protected K[] getMergedEnum(String value)

## Related Types

- EnumMapCodec
- MapCodec

Also in this package: EnumMapCodec, Float2ObjectMapCodec, Int2ObjectMapCodec, MapCodec, Object2DoubleMapCodec, Object2FloatMapCodec, Object2IntMapCodec, ObjectMapCodec, Short2ObjectMapCodec

Complete API:
  public Codec<V> getChildCodec()
  public Map<K,V> decode(BsonValue bsonValue, ExtraInfo extraInfo)
  private void put0(Map<K,V> map, String key, V decode)
  public BsonValue encode(Map<K,V> map, ExtraInfo extraInfo)
  public Map<K,V> decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  protected K getEnum(String value)
  protected K[] getMergedEnum(String value)

Fields:
private final Class<K> clazz
private final K[] enumConstants
private final String[] enumKeys
private final Class<M> mergeClazz
private final M[] mergeEnumConstants
private final String[] mergeEnumKeys
private final Function<M,K[]> unmergeFunction
private final BiFunction<V,V,V> mergeResultFunction
private final EnumCodec.EnumStyle enumStyle
private final Codec<V> codec
private final Supplier<EnumMap<K,V>> supplier
private final boolean unmodifiable
