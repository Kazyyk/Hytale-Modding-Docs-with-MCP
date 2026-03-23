---
title: "StoredCodec"
kind: "class"
package: "com.hypixel.hytale.codec.store"
fqcn: "com.hypixel.hytale.codec.store.StoredCodec"
api_surface: false
extends: null
implements: ["Codec"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "store"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.store`

```java
public class StoredCodec<T> implements Codec
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `CodecKey<T>` | `key` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `T` | `decode(BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Override public` | `BsonValue` | `encode(T t, ExtraInfo extraInfo)` |
| `@Nullable @Override public` | `T` | `decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException` |
| `@Nonnull @Override public` | `Schema` | `toSchema(SchemaContext context)` |
