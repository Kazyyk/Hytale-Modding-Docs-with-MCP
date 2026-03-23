# AssetBuilderCodec

Type: class | Package: com.hypixel.hytale.assetstore.codec | Extends: JsonAsset<K>> extends BuilderCodec<T> | Implements: AssetCodec<K, T>

public class AssetBuilderCodec<K, T extends JsonAsset<K>> extends BuilderCodec<T> implements AssetCodec<K, T>

## Fields

- public static final KeyedCodec<Map<String, String[]>> TAGS_CODEC
- private static final String TAG_DOCUMENTATION
- protected final KeyedCodec<K> idCodec
- protected final KeyedCodec<K> parentCodec
- protected final BiConsumer<T, K> idSetter
- protected final BiConsumer<T, AssetExtraInfo.Data> dataSetter
- protected final Function<T, AssetExtraInfo.Data> dataGetter
- T t
- ObjectSchema schema
- KeyedCodec<K> parent
- Schema parentSchema
- Class<? super T> rootClass
- LinkedHashMap<String, Schema> props
- protected final KeyedCodec<K> idCodec
- protected final BiConsumer<T, K> idSetter
- protected final BiConsumer<T, AssetExtraInfo.Data> dataSetter
- protected final Function<T, AssetExtraInfo.Data> dataGetter
- AssetExtraInfo.Data data
- AssetExtraInfo.Data parentData

## Constructors

- protected AssetBuilderCodec(@Nonnull AssetBuilderCodec.Builder<K, T> builder)

## Methods

- public KeyedCodec<K> getKeyCodec()
- public KeyedCodec<K> getParentCodec()
- public AssetExtraInfo.Data getData(T t)
- public T decodeJsonAsset(@Nonnull RawJsonReader reader, @Nonnull AssetExtraInfo<K> extraInfo)
- public T decodeAndInheritJsonAsset(@Nonnull RawJsonReader reader, @Nullable T parent, @Nonnull AssetExtraInfo<K> extraInfo)
- public ObjectSchema toSchema(@Nonnull SchemaContext context)
- public ObjectSchema toSchema(@Nonnull SchemaContext context, @Nullable T def)
- public static <K, T extends JsonAsset<K>> AssetBuilderCodec.Builder<K, T> builder(Class<T> tClass,
        Supplier<T> supplier,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `public static` | `<K, T extends JsonAsset<K>> AssetBuilderCodec.Builder<K, T>` | `builder(Class<T> tClass,
        Supplier<T> supplier,
        BuilderCodec<? super T> parentCodec,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `public static` | `<K, T extends JsonAsset<K>> AssetBuilderCodec<K, T>` | `wrap(@Nonnull BuilderCodec<T> codec,
        Codec<K> idCodec,
        BiConsumer<T, K> idSetter,
        Function<T, K> idGetter,
        BiConsumer<T, AssetExtraInfo.Data> dataSetter,
        @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `` | `return` | `builder(codec.getInnerClass()` |
| `` | `public` | `Builder(Class<T> tClass,
            Supplier<T> supplier,
            Codec<K> idCodec,
            BiConsumer<T, K> idSetter,
            Function<T, K> idGetter,
            BiConsumer<T, AssetExtraInfo.Data> dataSetter,
            @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `` | `public` | `Builder(Class<T> tClass,
            Supplier<T> supplier,
            BuilderCodec<? super T> parentCodec,
            Codec<K> idCodec,
            BiConsumer<T, K> idSetter,
            Function<T, K> idGetter,
            BiConsumer<T, AssetExtraInfo.Data> dataSetter,
            @Nonnull Function<T, AssetExtraInfo.Data> dataGetter)` |
| `` | `public AssetBuilderCodec<K, T>` | `build()` |

## Inner Types

- `AssetBuilderCodec.Builder`

## Related Types

- AssetCodec

Also in this package: AssetCodec, AssetCodecMapCodec, Builder, ContainedAssetCodec, Mode

Complete API:
  public KeyedCodec<K> getKeyCodec()
  public KeyedCodec<K> getParentCodec()
  public AssetExtraInfo.Data getData(T t)
  public T decodeJsonAsset(RawJsonReader reader, AssetExtraInfo<K> extraInfo)
  public T decodeAndInheritJsonAsset(RawJsonReader reader, T parent, AssetExtraInfo<K> extraInfo)
  public ObjectSchema toSchema(SchemaContext context)
  public ObjectSchema toSchema(SchemaContext context, T def)
  public static AssetBuilderCodec.Builder<K,T> builder(Class<T> tClass, Supplier<T> supplier, Codec<K> idCodec, BiConsumer<T,K> idSetter, Function<T,K> idGetter, BiConsumer<T,AssetExtraInfo.Data> dataSetter, Function<T,AssetExtraInfo.Data> dataGetter)
  public static AssetBuilderCodec.Builder<K,T> builder(Class<T> tClass, Supplier<T> supplier, BuilderCodec<? super T> parentCodec, Codec<K> idCodec, BiConsumer<T,K> idSetter, Function<T,K> idGetter, BiConsumer<T,AssetExtraInfo.Data> dataSetter, Function<T,AssetExtraInfo.Data> dataGetter)
  public static AssetBuilderCodec<K,T> wrap(BuilderCodec<T> codec, Codec<K> idCodec, BiConsumer<T,K> idSetter, Function<T,K> idGetter, BiConsumer<T,AssetExtraInfo.Data> dataSetter, Function<T,AssetExtraInfo.Data> dataGetter)

Fields:
public static final KeyedCodec<Map<String,String[]>> TAGS_CODEC
private static final String TAG_DOCUMENTATION
protected final KeyedCodec<K> idCodec
protected final KeyedCodec<K> parentCodec
protected final BiConsumer<T,K> idSetter
protected final BiConsumer<T,AssetExtraInfo.Data> dataSetter
protected final Function<T,AssetExtraInfo.Data> dataGetter
