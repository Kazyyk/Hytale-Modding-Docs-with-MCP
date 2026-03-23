---
title: "BoolDoublePairCodec"
kind: "class"
package: "com.hypixel.hytale.server.core.codec"
fqcn: "com.hypixel.hytale.server.core.codec.BoolDoublePairCodec"
api_surface: false
extends: ~
implements: ["Codec<BoolDoublePair>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "codec"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.codec`

```java
public class BoolDoublePairCodec implements Codec<BoolDoublePair>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Pattern` | `PATTERN` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BoolDoublePair` | `decode(BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull BoolDoublePair pair, ExtraInfo extraInfo)` |
| `@Override @Nonnull public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
