# KeyedCodec

Type: class | Package: com.hypixel.hytale.codec

public class KeyedCodec<T>

Wraps a `Codec` with an associated string key, used for encoding/decoding named fields in JSON/BSON documents.

## Methods

- public String getKey()
- public Codec<T> getCodec()

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, InheritCodec, PrimitiveCodec, RawJsonCodec, RawJsonInheritCodec, VersionedExtraInfo, WrappedCodec

Complete API:
  public String getKey()
  public T getNow(BsonDocument document)
  public T getNow(BsonDocument document, ExtraInfo extraInfo)
  public T getOrNull(BsonDocument document)
  public T getOrNull(BsonDocument document, ExtraInfo extraInfo)
  public Optional<T> get(BsonDocument document)
  public Optional<T> get(BsonDocument document, ExtraInfo extraInfo)
  public T getOrDefault(BsonDocument document, ExtraInfo extraInfo, T def)
  public Optional<T> getAndInherit(BsonDocument document, T parent, ExtraInfo extraInfo)
  public void put(BsonDocument document, T t)
  public void put(BsonDocument document, T t, ExtraInfo extraInfo)
  protected T decode(BsonValue bsonValue, ExtraInfo extraInfo)
  protected T decodeAndInherit(BsonValue bsonValue, T parent, ExtraInfo extraInfo)
  protected BsonValue encode(T t, ExtraInfo extraInfo)
  public Codec<T> getChildCodec()
  public boolean isRequired()
  public String toString()

Fields:
private final String key
private final Codec<T> codec
private final boolean required
