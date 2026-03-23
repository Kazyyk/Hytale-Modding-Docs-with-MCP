---
title: "FunctionCodec"
kind: "class"
package: "com.hypixel.hytale.codec.function"
fqcn: "com.hypixel.hytale.codec.function.FunctionCodec"
api_surface: true
extends: null
implements: ["Codec"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "function"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.function`

```java
@Deprecated public class FunctionCodec<T, R> implements Codec
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Codec<T>` | `codec` |
| `private final` | `Function<T,R>` | `decode` |
| `private final` | `Function<R,T>` | `encode` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `R` | `decode(BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Override public` | `BsonValue` | `encode(R r, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `R` | `decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException` |
| `@Nonnull @Override public` | `Schema` | `toSchema(SchemaContext context)` |
