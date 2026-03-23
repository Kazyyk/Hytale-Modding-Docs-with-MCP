# WeightedMapCodec

Type: class | Package: com.hypixel.hytale.server.core.codec | Extends: IWeightedElement> | Implements: Codec<IWeightedMap<T>>, WrappedCodec<T>

public class WeightedMapCodec<T extends IWeightedElement> implements Codec<IWeightedMap<T>>, WrappedCodec<T>

## Fields

- private final Codec<T> codec
- private final T[] emptyKeys

## Methods

- @Override public Codec<T> getChildCodec()
- public IWeightedMap<T> decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull IWeightedMap<T> map, ExtraInfo extraInfo)
- public IWeightedMap<T> decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)
- @Override @Nonnull public Schema toSchema(@Nonnull SchemaContext context)

Also in this package: BoolDoublePairCodec, IntegerPair, IntegerStringPair, LayerEntryCodec, PairCodec, ProtocolCodecs, ShapeCodecs

Complete API:
  public Codec<T> getChildCodec()
  public IWeightedMap<T> decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(IWeightedMap<T> map, ExtraInfo extraInfo)
  public IWeightedMap<T> decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
private final Codec<T> codec
private final T[] emptyKeys
