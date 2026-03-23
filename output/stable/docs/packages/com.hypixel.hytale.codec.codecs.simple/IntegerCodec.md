---
title: "IntegerCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.simple"
fqcn: "com.hypixel.hytale.codec.codecs.simple.IntegerCodec"
api_surface: false
extends: ~
implements: ["Codec<Integer>", "RawJsonCodec<Integer>", "PrimitiveCodec"]
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
public class IntegerCodec implements Codec<Integer>, RawJsonCodec<Integer>, PrimitiveCodec
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Integer` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(Integer t, ExtraInfo extraInfo)` |
| `@Nonnull public` | `Integer` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `@Nonnull public` | `Schema` | `toSchema(@Nonnull SchemaContext context, @Nullable Integer def)` |
