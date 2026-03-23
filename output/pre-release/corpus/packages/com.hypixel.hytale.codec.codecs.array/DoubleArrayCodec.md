# DoubleArrayCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.array | Implements: Codec<double[]>, RawJsonCodec<double[]>

public class DoubleArrayCodec implements Codec<double[]>, RawJsonCodec<double[]>

## Fields

- public static final double[] EMPTY_DOUBLE_ARRAY

## Methods

- public double[] decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull double[] doubles, ExtraInfo extraInfo)
- public double[] decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)

Also in this package: ArrayCodec, FloatArrayCodec, IntArrayCodec, LongArrayCodec

Complete API:
  public double[] decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(double[] doubles, ExtraInfo extraInfo)
  public double[] decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
public static final double[] EMPTY_DOUBLE_ARRAY
