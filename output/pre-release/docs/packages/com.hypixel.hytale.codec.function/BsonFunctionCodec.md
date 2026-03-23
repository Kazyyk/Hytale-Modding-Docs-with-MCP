---
title: "BsonFunctionCodec"
kind: "class"
package: "com.hypixel.hytale.codec.function"
fqcn: "com.hypixel.hytale.codec.function.BsonFunctionCodec"
api_surface: false
extends: null
implements: ["Codec", "WrappedCodec"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "function"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.function`

```java
@Deprecated public class BsonFunctionCodec<T> implements Codec, WrappedCodec
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Codec<T>` | `codec` |
| `private final` | `BiFunction<T,BsonValue,T>` | `decode` |
| `private final` | `BiFunction<BsonValue,T,BsonValue>` | `encode` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `T` | `decode(BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Override public` | `BsonValue` | `encode(T r, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(SchemaContext context)` |
| `@Nonnull @Override public` | `Codec<T>` | `getChildCodec()` |
