# SetCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.set | Implements: Codec, WrappedCodec

public class SetCodec<V, S> implements Codec, WrappedCodec

## Fields

- private final Codec<V> codec
- private final Supplier<S> supplier
- private final boolean unmodifiable

## Methods

- public Set<V> decode(BsonValue bsonValue, ExtraInfo extraInfo)
- public Set<V> decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException
- @Nonnull public BsonValue encode(Set<V> vs, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(SchemaContext context)
- @Override public Codec<V> getChildCodec()

Complete API:
  public Set<V> decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public Set<V> decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public BsonValue encode(Set<V> vs, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  public Codec<V> getChildCodec()

Fields:
private final Codec<V> codec
private final Supplier<S> supplier
private final boolean unmodifiable
