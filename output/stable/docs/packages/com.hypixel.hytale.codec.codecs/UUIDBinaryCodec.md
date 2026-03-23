---
title: "UUIDBinaryCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs"
fqcn: "com.hypixel.hytale.codec.codecs.UUIDBinaryCodec"
api_surface: false
extends: null
implements: ["Codec<UUID>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "codecs"
---

**Package:** `com.hypixel.hytale.codec.codecs`

```java
public class UUIDBinaryCodec implements Codec<UUID>
```

Codec for serializing and deserializing UUIDBinary values.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `UUID` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull UUID uuid, ExtraInfo extraInfo)` |
| `@Nonnull public` | `UUID` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `public static` | `void` | `writeLongToArrayBigEndian(@Nonnull byte[] bytes, int offset, long x)` |
| `public static` | `long` | `readLongFromArrayBigEndian(@Nonnull byte[] bytes, int offset)` |
| `@Nonnull public static` | `UUID` | `uuidFromBytes(@Nonnull byte[] bytes)` |
| `@Nonnull public static` | `UUID` | `uuidFromHex(String src)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
