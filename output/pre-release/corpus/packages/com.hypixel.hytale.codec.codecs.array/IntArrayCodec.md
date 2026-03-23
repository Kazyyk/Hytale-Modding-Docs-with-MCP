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

Also in this package: ArrayCodec, DoubleArrayCodec, FloatArrayCodec, LongArrayCodec

Complete API:
  public int[] decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(int[] ints, ExtraInfo extraInfo)
  public int[] decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
public static final int[] EMPTY_INT_ARRAY
