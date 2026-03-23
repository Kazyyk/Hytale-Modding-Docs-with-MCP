---
title: "WeightedMapCodec"
kind: "class"
package: "com.hypixel.hytale.server.core.codec"
fqcn: "com.hypixel.hytale.server.core.codec.WeightedMapCodec"
api_surface: false
extends: "IWeightedElement>"
implements: ["Codec<IWeightedMap<T>>", "WrappedCodec<T>"]
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
public class WeightedMapCodec<T extends IWeightedElement> implements Codec<IWeightedMap<T>>, WrappedCodec<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Codec<T>` | `codec` |
| `private final` | `T[]` | `emptyKeys` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `Codec<T>` | `getChildCodec()` |
| `public` | `IWeightedMap<T>` | `decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull IWeightedMap<T> map, ExtraInfo extraInfo)` |
| `public` | `IWeightedMap<T>` | `decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)` |
| `@Override @Nonnull public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
