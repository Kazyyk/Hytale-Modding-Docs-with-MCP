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
