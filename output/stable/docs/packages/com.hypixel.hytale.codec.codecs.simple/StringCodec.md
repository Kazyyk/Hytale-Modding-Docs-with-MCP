---
title: "StringCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.simple"
fqcn: "com.hypixel.hytale.codec.codecs.simple.StringCodec"
api_surface: false
extends: ~
implements: ["Codec<String>", "RawJsonCodec<String>"]
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
public class StringCodec implements Codec<String>, RawJsonCodec<String>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull String t, ExtraInfo extraInfo)` |
| `public` | `String` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `@Nonnull public` | `Schema` | `toSchema(@Nonnull SchemaContext context, @Nullable String def)` |
