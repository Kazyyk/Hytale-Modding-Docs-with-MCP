---
title: "DoubleCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.simple"
fqcn: "com.hypixel.hytale.codec.codecs.simple.DoubleCodec"
api_surface: false
extends: ~
implements: ["Codec<Double>", "RawJsonCodec<Double>", "PrimitiveCodec"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "codec"
  - "codecs"
  - "simple"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.codecs.simple`

```java
public class DoubleCodec implements Codec<Double>, RawJsonCodec<Double>, PrimitiveCodec
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Double` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(Double t, ExtraInfo extraInfo)` |
| `@Nonnull public` | `Double` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `@Nonnull public` | `Schema` | `toSchema(@Nonnull SchemaContext context, @Nullable Double def)` |
