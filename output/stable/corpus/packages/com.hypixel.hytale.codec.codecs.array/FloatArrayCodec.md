# FloatArrayCodec

Type: class | Package: com.hypixel.hytale.codec.codecs.array | Implements: Codec<float[]>, RawJsonCodec<float[]>

public class FloatArrayCodec implements Codec<float[]>, RawJsonCodec<float[]>

## Fields

- public static final float[] EMPTY_FLOAT_ARRAY

## Methods

- public float[] decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull float[] floats, ExtraInfo extraInfo)
- public float[] decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
