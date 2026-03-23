---
title: "FloatRangeArrayCodec"
kind: "class"
package: "com.hypixel.hytale.math.codec"
fqcn: "com.hypixel.hytale.math.codec.FloatRangeArrayCodec"
api_surface: true
extends: ~
implements:
  - "Codec<FloatRange>"
  - "ValidatableCodec<FloatRange>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "codec"
  - "math"
---

**Package:** `com.hypixel.hytale.math.codec`

```java
public class FloatRangeArrayCodec implements Codec<FloatRange>, ValidatableCodec<FloatRange>
```

Codec that serializes a `FloatRange` as a two-element JSON/BSON array `[min, max]`. Validates that the minimum does not exceed the maximum. Generates a JSON Schema with `minItems: 2, maxItems: 2`, accepting numbers or the strings `"-Infinity"`, `"Infinity"`, `"NaN"`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` | `FloatRange` | Decodes a BSON array into a `FloatRange`. |
| `encode(@Nonnull FloatRange floatRange, ExtraInfo extraInfo)` | `BsonValue` | Encodes a `FloatRange` as a two-element BSON array. |
| `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` | `FloatRange` | Decodes a `FloatRange` from raw JSON `[min, max]`. |
| `toSchema(@Nonnull SchemaContext context)` | `Schema` | Generates an array schema titled "FloatRange" with two number items. |
| `validate(@Nonnull FloatRange floatRange, @Nonnull ExtraInfo extraInfo)` | `void` | Validates that min <= max. Fails validation otherwise. |
| `validateDefaults(ExtraInfo extraInfo, Set<Codec<?>> tested)` | `void` | No-op default validation. |
