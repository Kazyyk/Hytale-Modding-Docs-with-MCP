# ByteCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.simple | Implements: Codec<Byte>, RawJsonCodec<Byte>, PrimitiveCodec

public class ByteCodec implements Codec<Byte>, RawJsonCodec<Byte>, PrimitiveCodec

## Methods

- @Nonnull public Byte decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(Byte t, ExtraInfo extraInfo)
- @Nonnull public Byte decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull public Schema toSchema(@Nonnull SchemaContext context, @Nullable Byte def)
