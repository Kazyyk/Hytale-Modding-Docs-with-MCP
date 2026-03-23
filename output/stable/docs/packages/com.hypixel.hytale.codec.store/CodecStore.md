---
title: "CodecStore"
kind: "class"
package: "com.hypixel.hytale.codec.store"
fqcn: "com.hypixel.hytale.codec.store.CodecStore"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "store"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.store`

```java
public class CodecStore
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecStore` | `STATIC` |
| `private final` | `CodecStore` | `parent` |
| `private final` | `Map<CodecKey<?>,Codec<?>>` | `codecs` |
| `private final` | `Map<CodecKey<?>,Supplier<Codec<?>>>` | `codecSuppliers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `Codec<T>` | `getCodec(CodecKey<T> key)` |
| `public` | `void` | `putCodec(CodecKey<T> key, Codec<T> codec)` |
| `public` | `Codec<?>` | `removeCodec(CodecKey<T> key)` |
| `public` | `void` | `putCodecSupplier(CodecKey<T> key, Supplier<Codec<T>> supplier)` |
| `public` | `Supplier<Codec<?>>` | `removeCodecSupplier(CodecKey<T> key)` |
