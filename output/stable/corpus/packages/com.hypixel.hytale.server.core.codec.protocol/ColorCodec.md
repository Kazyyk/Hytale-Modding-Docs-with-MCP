# ColorCodec

Type: class | Package: com.hypixel.hytale.server.core.codec.protocol | Implements: Codec

public class ColorCodec implements Codec

## Methods

- @Nonnull public BsonValue encode(Color color, ExtraInfo extraInfo)
- @Nonnull public Color decode(BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public Color decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException
- @Nonnull @Override public Schema toSchema(SchemaContext context)
