# Vector2dArrayCodec

Type: class | Package: com.hypixel.hytale.math.codec | Implements: Codec<Vector2d>

@Deprecated
public class Vector2dArrayCodec implements Codec<Vector2d>

Deprecated codec that serializes a `Vector2d` as a two-element JSON/BSON array `[x, y]`. Generates a JSON Schema with `minItems: 2, maxItems: 2`.

## Methods

- decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo) | Vector2d | Decodes a BSON array into a `Vector2d`.
- encode(@Nonnull Vector2d t, ExtraInfo extraInfo) | BsonValue | Encodes a `Vector2d` as a two-element BSON array.
- decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo) | Vector2d | Decodes a `Vector2d` from raw JSON `[x, y]`.
- toSchema(@Nonnull SchemaContext context) | Schema | Generates an array schema titled "Vector2d".

Also in this package: FloatRangeArrayCodec, IntRangeArrayCodec, Vector3dArrayCodec, Vector3iArrayCodec

Complete API:
  public Vector2d decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(Vector2d t, ExtraInfo extraInfo)
  public Vector2d decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
