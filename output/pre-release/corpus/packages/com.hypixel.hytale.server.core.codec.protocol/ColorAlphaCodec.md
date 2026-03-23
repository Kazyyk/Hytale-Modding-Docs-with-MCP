# ColorAlphaCodec

Type: class | Package: com.hypixel.hytale.server.core.codec.protocol | Implements: Codec

public class ColorAlphaCodec implements Codec

## Methods

- @Nonnull public BsonValue encode(ColorAlpha colorAlpha, ExtraInfo extraInfo)
- @Nonnull public ColorAlpha decode(BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public ColorAlpha decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException
- @Nonnull @Override public Schema toSchema(SchemaContext context)

Also in this package: ColorCodec

Complete API:
  public BsonValue encode(ColorAlpha colorAlpha, ExtraInfo extraInfo)
  public ColorAlpha decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public ColorAlpha decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
