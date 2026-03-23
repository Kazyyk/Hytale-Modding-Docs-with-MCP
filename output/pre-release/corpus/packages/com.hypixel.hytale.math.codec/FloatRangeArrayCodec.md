# FloatRangeArrayCodec

Type: class | Package: com.hypixel.hytale.math.codec | Implements: Codec<FloatRange>, ValidatableCodec<FloatRange>

public class FloatRangeArrayCodec implements Codec<FloatRange>, ValidatableCodec<FloatRange>

Codec that serializes a `FloatRange` as a two-element JSON/BSON array `[min, max]`. Validates that the minimum does not exceed the maximum. Generates a JSON Schema with `minItems: 2, maxItems: 2`, accepting numbers or the strings `"-Infinity"`, `"Infinity"`, `"NaN"`.

## Methods

- decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo) | FloatRange | Decodes a BSON array into a `FloatRange`.
- encode(@Nonnull FloatRange floatRange, ExtraInfo extraInfo) | BsonValue | Encodes a `FloatRange` as a two-element BSON array.
- decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo) | FloatRange | Decodes a `FloatRange` from raw JSON `[min, max]`.
- toSchema(@Nonnull SchemaContext context) | Schema | Generates an array schema titled "FloatRange" with two number items.
- validate(@Nonnull FloatRange floatRange, @Nonnull ExtraInfo extraInfo) | void | Validates that min <= max. Fails validation otherwise.
- validateDefaults(ExtraInfo extraInfo, Set<Codec<?>> tested) | void | No-op default validation.

Also in this package: IntRangeArrayCodec, Vector2dArrayCodec, Vector3dArrayCodec, Vector3iArrayCodec

Complete API:
  public FloatRange decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(FloatRange floatRange, ExtraInfo extraInfo)
  public FloatRange decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  public void validate(FloatRange floatRange, ExtraInfo extraInfo)
  public void validateDefaults(ExtraInfo extraInfo, Set<Codec<?>> tested)
