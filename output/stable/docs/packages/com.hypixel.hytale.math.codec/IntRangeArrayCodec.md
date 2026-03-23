---
title: "IntRangeArrayCodec"
kind: "class"
package: "com.hypixel.hytale.math.codec"
fqcn: "com.hypixel.hytale.math.codec.IntRangeArrayCodec"
api_surface: false
extends: ~
implements: 
  - "Codec<IntRange>"
  - "ValidatableCodec<IntRange>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "math"
  - "codec"
---

**Package:** `com.hypixel.hytale.math.codec`

```java
public class IntRangeArrayCodec implements Codec<IntRange>, ValidatableCodec<IntRange>
```

Implementation of `Codec<IntRange>, ValidatableCodec<IntRange>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` | `IntRange` | public method. |
| `encode(@Nonnull IntRange t, ExtraInfo extraInfo)` | `BsonValue` | public method. |
| `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` | `IntRange` | public method. |
| `toSchema(@Nonnull SchemaContext context)` | `Schema` | public method. |
| `validate(@Nonnull IntRange range, @Nonnull ExtraInfo extraInfo)` | `void` | public method. |
| `validateDefaults(ExtraInfo extraInfo, Set<Codec<?>> tested)` | `void` | public method. |
