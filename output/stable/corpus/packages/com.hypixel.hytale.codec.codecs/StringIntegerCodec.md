# StringIntegerCodec

Type: class | Package: com.hypixel.hytale.codec.codecs | Implements: Codec<Integer>

@Deprecated
public class StringIntegerCodec implements Codec<Integer>

Codec for serializing and deserializing StringInteger values.

## Constants

- public static final StringIntegerCodec INSTANCE
- private static final Pattern INTEGER_PATTERN

## Methods

- @Nonnull public Integer decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Integer t, ExtraInfo extraInfo)
- @Nonnull public Integer decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull public StringSchema toSchema(@Nonnull SchemaContext context)
