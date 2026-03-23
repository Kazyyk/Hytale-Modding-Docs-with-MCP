---
title: "BsonDocumentCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs"
fqcn: "com.hypixel.hytale.codec.codecs.BsonDocumentCodec"
api_surface: false
extends: null
implements: ["Codec<BsonDocument>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "codecs"
---

**Package:** `com.hypixel.hytale.codec.codecs`

```java
@Deprecated
public class BsonDocumentCodec implements Codec<BsonDocument>
```

Codec for serializing and deserializing BsonDocument values.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `BsonDocument` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `public` | `BsonValue` | `encode(BsonDocument document, ExtraInfo extraInfo)` |
| `public` | `BsonDocument` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
