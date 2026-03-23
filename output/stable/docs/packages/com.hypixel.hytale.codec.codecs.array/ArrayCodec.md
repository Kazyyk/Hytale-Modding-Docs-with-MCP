---
title: "ArrayCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs.array"
fqcn: "com.hypixel.hytale.codec.codecs.array.ArrayCodec"
api_surface: true
extends: ~
implements: ["Codec<T[]>", "RawJsonCodec<T[]>", "WrappedCodec<T>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "codec"
  - "codecs"
  - "array"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.codecs.array`

```java
public class ArrayCodec<T> implements Codec<T[]>, RawJsonCodec<T[]>, WrappedCodec<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Codec<T>` | `codec` |
| `private final` | `IntFunction<T[]>` | `arrayConstructor` |
| `@Nullable private final` | `Supplier<T>` | `defaultValue` |
| `private` | `List<Metadata>` | `metadata` |
| `private` | `T[]` | `emptyArray` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ArrayCodec(Codec<T> codec, IntFunction<T[]> arrayConstructor)` |
| `public` | `ArrayCodec(Codec<T> codec, IntFunction<T[]> arrayConstructor, @Nullable Supplier<T> defaultValue)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `Codec<T>` | `getChildCodec()` |
| `public` | `T[]` | `decode(@Nonnull BsonValue bsonValue, @Nonnull ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull T[] array, ExtraInfo extraInfo)` |
| `public` | `T[]` | `decodeJson(@Nonnull RawJsonReader reader, @Nonnull ExtraInfo extraInfo)` |
| `@Nonnull public` | `ArrayCodec<T>` | `metadata(Metadata metadata)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `@Nullable public` | `Supplier<T>` | `getDefaultSupplier()` |
| `@Nullable protected` | `T` | `decodeElement(@Nonnull BsonValue value, ExtraInfo extraInfo)` |
| `@Nullable protected` | `T` | `decodeJsonElement(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull public static` | `<T> ArrayCodec<T>` | `ofBuilderCodec(@Nonnull BuilderCodec<T> codec, IntFunction<T[]> arrayConstructor)` |
