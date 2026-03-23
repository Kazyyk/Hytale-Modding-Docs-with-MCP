# LongArrayCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.array | Implements: Codec<long[]>, RawJsonCodec<long[]>

public class LongArrayCodec implements Codec<long[]>, RawJsonCodec<long[]>

## Fields

- public static final long[] EMPTY_LONG_ARRAY

## Methods

- public long[] decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull long[] longs, ExtraInfo extraInfo)
- public long[] decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
