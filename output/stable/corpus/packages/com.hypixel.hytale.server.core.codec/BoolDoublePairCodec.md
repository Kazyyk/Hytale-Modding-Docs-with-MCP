# BoolDoublePairCodec

Type: class | Package: com.hypixel.hytale.server.core.codec | Implements: Codec<BoolDoublePair>

public class BoolDoublePairCodec implements Codec<BoolDoublePair>

## Fields

- private static final Pattern PATTERN

## Methods

- @Nonnull public BoolDoublePair decode(BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull BoolDoublePair pair, ExtraInfo extraInfo)
- @Override @Nonnull public Schema toSchema(@Nonnull SchemaContext context)

Also in this package: IntegerPair, IntegerStringPair, LayerEntryCodec, PairCodec, ProtocolCodecs, ShapeCodecs, WeightedMapCodec

Complete API:
  public BoolDoublePair decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(BoolDoublePair pair, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
private static final Pattern PATTERN
