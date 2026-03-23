# BoolDoublePairCodec

Type: class | Package: com.hypixel.hytale.server.core.codec | Implements: Codec<BoolDoublePair>

public class BoolDoublePairCodec implements Codec<BoolDoublePair>

## Fields

- private static final Pattern PATTERN

## Methods

- @Nonnull public BoolDoublePair decode(BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull BoolDoublePair pair, ExtraInfo extraInfo)
- @Override @Nonnull public Schema toSchema(@Nonnull SchemaContext context)
