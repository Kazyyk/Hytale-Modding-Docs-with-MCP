# Vector3iArrayCodec

Type: class | Package: com.hypixel.hytale.math.codec | Implements: Codec<Vector3i>

public class Vector3iArrayCodec implements Codec<Vector3i>

Implementation of `Codec<Vector3i>`.

## Methods

- decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo) | Vector3i | public method.
- encode(@Nonnull Vector3i t, ExtraInfo extraInfo) | BsonValue | public method.
- decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo) | Vector3i | public method.
- toSchema(@Nonnull SchemaContext context) | Schema | public method.

Also in this package: FloatRangeArrayCodec, IntRangeArrayCodec, Vector2dArrayCodec, Vector3dArrayCodec

Complete API:
  public Vector3i decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(Vector3i t, ExtraInfo extraInfo)
  public Vector3i decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
