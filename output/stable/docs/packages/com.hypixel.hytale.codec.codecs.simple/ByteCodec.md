---
title: "ByteCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.simple"
fqcn: "com.hypixel.hytale.codec.codecs.simple.ByteCodec"
api_surface: false
extends: ~
implements: ["Codec<Byte>", "RawJsonCodec<Byte>", "PrimitiveCodec"]
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
public class ByteCodec implements Codec<Byte>, RawJsonCodec<Byte>, PrimitiveCodec
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Byte` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(Byte t, ExtraInfo extraInfo)` |
| `@Nonnull public` | `Byte` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `@Nonnull public` | `Schema` | `toSchema(@Nonnull SchemaContext context, @Nullable Byte def)` |
