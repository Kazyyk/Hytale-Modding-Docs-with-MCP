# EnumCodec

Type: class | Package: com.hypixel.hytale.codec.codecs | Implements: Codec<T>

public class EnumCodec<T extends Enum<T>> implements Codec<T>

Codec for serializing and deserializing Enum values.

## Fields

- @Nonnull private final Class<T> clazz
- @Nonnull private final T[] enumConstants
- @Nonnull private final String[] enumKeys
- private final EnumCodec.EnumStyle enumStyle
- @Nonnull private final EnumMap<T, String> documentation

## Methods

- public EnumCodec(@Nonnull Class<T> clazz)
- public EnumCodec(@Nonnull Class<T> clazz, EnumCodec.EnumStyle enumStyle)
- @Nonnull public EnumCodec<T> documentKey(T key, String doc)
- @Nonnull public T decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull T r, ExtraInfo extraInfo)
- @Nonnull public T decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable T def)
- @Nullable private T getEnum(String value)

Also in this package: BsonDocumentCodec, EnumStyle, InetSocketAddressCodec, StringIntegerCodec, UUIDBinaryCodec

Complete API:
  public EnumCodec<T> documentKey(T key, String doc)
  public T decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(T r, ExtraInfo extraInfo)
  public T decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  public Schema toSchema(SchemaContext context, T def)
  private T getEnum(String value)

Fields:
private final Class<T> clazz
private final T[] enumConstants
private final String[] enumKeys
private final EnumCodec.EnumStyle enumStyle
private final EnumMap<T,String> documentation
