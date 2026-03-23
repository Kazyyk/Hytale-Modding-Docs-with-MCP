# StringCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<String>, RawJsonCodec<String>

public class StringCodec implements Codec<String>, RawJsonCodec<String>

## Methods

- public String decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull String t, ExtraInfo extraInfo)
- public String decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable String def)
