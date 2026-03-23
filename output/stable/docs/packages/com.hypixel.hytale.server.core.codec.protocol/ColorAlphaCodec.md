---
title: "ColorAlphaCodec"
kind: "class"
package: "com.hypixel.hytale.server.core.codec.protocol"
fqcn: "com.hypixel.hytale.server.core.codec.protocol.ColorAlphaCodec"
api_surface: false
extends: null
implements: ["Codec"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "codec"
  - "protocol"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.codec.protocol`

```java
public class ColorAlphaCodec implements Codec
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BsonValue` | `encode(ColorAlpha colorAlpha, ExtraInfo extraInfo)` |
| `@Nonnull public` | `ColorAlpha` | `decode(BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `ColorAlpha` | `decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException` |
| `@Nonnull @Override public` | `Schema` | `toSchema(SchemaContext context)` |
