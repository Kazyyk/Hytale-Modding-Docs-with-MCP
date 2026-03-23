# StoredCodec

Type: class | Package: com.hypixel.hytale.codec.store | Implements: Codec

public class StoredCodec<T> implements Codec

## Fields

- private final CodecKey<T> key

## Methods

- @Override public T decode(BsonValue bsonValue, ExtraInfo extraInfo)
- @Override public BsonValue encode(T t, ExtraInfo extraInfo)
- @Nullable @Override public T decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException
- @Nonnull @Override public Schema toSchema(SchemaContext context)

Also in this package: CodecKey, CodecStore

Complete API:
  public T decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(T t, ExtraInfo extraInfo)
  public T decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
private final CodecKey<T> key
