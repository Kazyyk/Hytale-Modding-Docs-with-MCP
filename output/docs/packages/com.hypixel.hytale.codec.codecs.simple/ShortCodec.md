---
title: "ShortCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.simple"
fqcn: "com.hypixel.hytale.codec.codecs.simple.ShortCodec"
api_surface: false
extends: ~
implements: ["Codec<Short>", "RawJsonCodec<Short>", "PrimitiveCodec"]
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
public class ShortCodec implements Codec<Short>, RawJsonCodec<Short>, PrimitiveCodec
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Short` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(Short t, ExtraInfo extraInfo)` |
| `@Nonnull public` | `Short` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
