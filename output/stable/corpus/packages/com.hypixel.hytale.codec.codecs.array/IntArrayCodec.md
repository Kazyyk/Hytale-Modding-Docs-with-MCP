# IntArrayCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.array | Implements: Codec<int[]>, RawJsonCodec<int[]>

public class IntArrayCodec implements Codec<int[]>, RawJsonCodec<int[]>

## Fields

- public static final int[] EMPTY_INT_ARRAY

## Methods

- public int[] decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull int[] ints, ExtraInfo extraInfo)
- public int[] decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
