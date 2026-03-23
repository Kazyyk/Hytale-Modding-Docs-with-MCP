# Vector3dArrayCodec

Type: class | Package: com.hypixel.hytale.math.codec | Implements: Codec<Vector3d>

@Deprecated
public class Vector3dArrayCodec implements Codec<Vector3d>

Deprecated codec that serializes a `Vector3d` as a three-element JSON/BSON array `[x, y, z]`. Generates a JSON Schema with `minItems: 3, maxItems: 3`.

## Methods

- decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo) | Vector3d | Decodes a BSON array into a `Vector3d`.
- encode(@Nonnull Vector3d t, ExtraInfo extraInfo) | BsonValue | Encodes a `Vector3d` as a three-element BSON array.
- decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo) | Vector3d | Decodes a `Vector3d` from raw JSON `[x, y, z]`.
- toSchema(@Nonnull SchemaContext context) | Schema | Generates an array schema titled "Vector3d".

Also in this package: FloatRangeArrayCodec, IntRangeArrayCodec, Vector2dArrayCodec, Vector3iArrayCodec

Complete API:
  public Vector3d decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(Vector3d t, ExtraInfo extraInfo)
  public Vector3d decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
