# AssetCodecMapCodec

Type: class | Package: com.hypixel.hytale.assetstore.codec | Extends: JsonAsset<K>> extends StringCodecMapCodec<T, AssetBuilderCodec<K, T>> | Implements: AssetCodec<K, T>

public class AssetCodecMapCodec<K, T extends JsonAsset<K>> extends StringCodecMapCodec<T, AssetBuilderCodec<K, T>> implements AssetCodec<K, T>

## Fields

- protected final KeyedCodec<K> idCodec
- protected final KeyedCodec<K> parentCodec
- protected final BiConsumer<T, K> idSetter
- protected final Function<T, K> idGetter
- protected final BiConsumer<T, AssetExtraInfo.Data> dataSetter
- protected final Function<T, AssetExtraInfo.Data> dataGetter
- AssetBuilderCodec<K, T> assetCodec
- BsonValue id
- AssetBuilderCodec<K, T> codec
- AssetBuilderCodec<K, T> defaultCodec
- String id
- JsonAsset var7
- JsonAsset var8
- Supplier<T> supplier
- T t
- Schema schema
- AssetBuilderCodec<K, T> def
- Schema idField
- Schema parentField
- AssetBuilderCodec<K, T> bc
- Schema parentSchema
- Schema.InheritSettings settings

## Constructors

- public AssetCodecMapCodec(Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        Function<T, AssetExtraInfo.Data> dataGetter)` |
| `public` | `AssetCodecMapCodec(String key,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        Function<T, AssetExtraInfo.Data> dataGetter)` |
| `public` | `AssetCodecMapCodec(Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        Function<T, AssetExtraInfo.Data> dataGetter,
        boolean allowDefault)` |
| `public` | `AssetCodecMapCodec(String key,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        Function<T, AssetExtraInfo.Data> dataGetter,
        boolean allowDefault)` |

## Methods

- public KeyedCodec<K> getKeyCodec()
- public KeyedCodec<K> getParentCodec()
- public AssetExtraInfo.Data getData(T t)
- public AssetCodecMapCodec<K, T> register(@Nonnull String id, Class<? extends T> aClass, BuilderCodec<? extends T> codec)
- public AssetCodecMapCodec<K, T> register(@Nonnull Priority priority, @Nonnull String id, Class<? extends T> aClass, BuilderCodec<? extends T> codec)
- public T decodeAndInherit(@Nonnull BsonDocument document, T parent, ExtraInfo extraInfo)
- public void decodeAndInherit(@Nonnull BsonDocument document, T t, T parent, ExtraInfo extraInfo)
- public T decodeAndInheritJson(@Nonnull RawJsonReader reader, @Nullable T parent, @Nonnull ExtraInfo extraInfo)
- public void decodeAndInheritJson(@Nonnull RawJsonReader reader, T t, @Nullable T parent, @Nonnull ExtraInfo extraInfo)
- public T decodeJsonAsset(@Nonnull RawJsonReader reader, @Nonnull AssetExtraInfo<K> extraInfo)
- public T decodeAndInheritJsonAsset(@Nonnull RawJsonReader reader, @Nullable T parent, @Nonnull AssetExtraInfo<K> extraInfo)
- throw new CodecException("This BuilderCodec is for an abstract or direct codec. To use this codec you must specify an existing object to decode into.")
- public Schema toSchema(@Nonnull SchemaContext context)
- protected void mutateChildSchema(String key, @Nonnull SchemaContext context, BuilderCodec<? extends T> c, @Nonnull ObjectSchema objectSchema)

## Related Types

- AssetBuilderCodec
- AssetCodec

Also in this package: AssetBuilderCodec, AssetCodec, Builder, ContainedAssetCodec, Mode

Complete API:
  public KeyedCodec<K> getKeyCodec()
  public KeyedCodec<K> getParentCodec()
  public AssetExtraInfo.Data getData(T t)
  public AssetCodecMapCodec<K,T> register(String id, Class<? extends T> aClass, BuilderCodec<? extends T> codec)
  public AssetCodecMapCodec<K,T> register(Priority priority, String id, Class<? extends T> aClass, BuilderCodec<? extends T> codec)
  public T decodeAndInherit(BsonDocument document, T parent, ExtraInfo extraInfo)
  public void decodeAndInherit(BsonDocument document, T t, T parent, ExtraInfo extraInfo)
  public T decodeAndInheritJson(RawJsonReader reader, T parent, ExtraInfo extraInfo)
  public void decodeAndInheritJson(RawJsonReader reader, T t, T parent, ExtraInfo extraInfo)
  public T decodeJsonAsset(RawJsonReader reader, AssetExtraInfo<K> extraInfo)
  public T decodeAndInheritJsonAsset(RawJsonReader reader, T parent, AssetExtraInfo<K> extraInfo)
  public Schema toSchema(SchemaContext context)
  protected void mutateChildSchema(String key, SchemaContext context, BuilderCodec<? extends T> c, ObjectSchema objectSchema)

Fields:
protected final KeyedCodec<K> idCodec
protected final KeyedCodec<K> parentCodec
protected final BiConsumer<T,K> idSetter
protected final Function<T,K> idGetter
protected final BiConsumer<T,AssetExtraInfo.Data> dataSetter
protected final Function<T,AssetExtraInfo.Data> dataGetter
