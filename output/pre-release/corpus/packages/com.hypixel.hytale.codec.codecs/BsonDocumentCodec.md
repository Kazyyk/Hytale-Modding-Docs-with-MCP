# BsonDocumentCodec

Type: class | Package: com.hypixel.hytale.codec.codecs | Implements: Codec<BsonDocument>

@Deprecated
public class BsonDocumentCodec implements Codec<BsonDocument>

Codec for serializing and deserializing BsonDocument values.

## Methods

- public BsonDocument decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- public BsonValue encode(BsonDocument document, ExtraInfo extraInfo)
- public BsonDocument decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)

Also in this package: EnumCodec, EnumStyle, InetSocketAddressCodec, StringIntegerCodec, UUIDBinaryCodec

Complete API:
  public BsonDocument decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(BsonDocument document, ExtraInfo extraInfo)
  public BsonDocument decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
