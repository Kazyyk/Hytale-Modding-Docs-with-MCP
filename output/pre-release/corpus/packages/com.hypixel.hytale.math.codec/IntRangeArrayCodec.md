# IntRangeArrayCodec

Type: class | Package: com.hypixel.hytale.math.codec | Implements: Codec<IntRange>, ValidatableCodec<IntRange>

public class IntRangeArrayCodec implements Codec<IntRange>, ValidatableCodec<IntRange>

Implementation of `Codec<IntRange>, ValidatableCodec<IntRange>`.

## Methods

- decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo) | IntRange | public method.
- encode(@Nonnull IntRange t, ExtraInfo extraInfo) | BsonValue | public method.
- decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo) | IntRange | public method.
- toSchema(@Nonnull SchemaContext context) | Schema | public method.
- validate(@Nonnull IntRange range, @Nonnull ExtraInfo extraInfo) | void | public method.
- validateDefaults(ExtraInfo extraInfo, Set<Codec<?>> tested) | void | public method.
