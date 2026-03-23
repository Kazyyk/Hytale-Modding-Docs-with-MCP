---
title: "StringIntegerCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs"
fqcn: "com.hypixel.hytale.codec.codecs.StringIntegerCodec"
api_surface: false
extends: null
implements: ["Codec<Integer>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "codecs"
---

**Package:** `com.hypixel.hytale.codec.codecs`

```java
@Deprecated
public class StringIntegerCodec implements Codec<Integer>
```

Codec for serializing and deserializing StringInteger values.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `StringIntegerCodec` | `INSTANCE` | `new StringIntegerCodec()` |
| `private static final` | `Pattern` | `INTEGER_PATTERN` | `Pattern.compile("^[0-9]+$")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Integer` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(Integer t, ExtraInfo extraInfo)` |
| `@Nonnull public` | `Integer` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull public` | `StringSchema` | `toSchema(@Nonnull SchemaContext context)` |
