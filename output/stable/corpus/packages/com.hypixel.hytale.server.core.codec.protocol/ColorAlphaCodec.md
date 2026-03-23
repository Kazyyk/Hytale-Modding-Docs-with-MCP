# ColorAlphaCodec

Type: class | Package: com.hypixel.hytale.server.core.codec.protocol | Implements: Codec

public class ColorAlphaCodec implements Codec

## Methods

- @Nonnull public BsonValue encode(ColorAlpha colorAlpha, ExtraInfo extraInfo)
- @Nonnull public ColorAlpha decode(BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public ColorAlpha decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException
- @Nonnull @Override public Schema toSchema(SchemaContext context)
