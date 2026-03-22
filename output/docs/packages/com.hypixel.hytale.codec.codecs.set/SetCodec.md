---
title: "SetCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.set"
fqcn: "com.hypixel.hytale.codec.codecs.set.SetCodec"
api_surface: false
extends: null
implements: ["Codec", "WrappedCodec"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "codecs"
  - "set"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.codecs.set`

```java
public class SetCodec<V, S> implements Codec, WrappedCodec
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Codec<V>` | `codec` |
| `private final` | `Supplier<S>` | `supplier` |
| `private final` | `boolean` | `unmodifiable` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Set<V>` | `decode(BsonValue bsonValue, ExtraInfo extraInfo)` |
| `public` | `Set<V>` | `decodeJson(RawJsonReader reader, ExtraInfo extraInfo) throws IOException` |
| `@Nonnull public` | `BsonValue` | `encode(Set<V> vs, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(SchemaContext context)` |
| `@Override public` | `Codec<V>` | `getChildCodec()` |
