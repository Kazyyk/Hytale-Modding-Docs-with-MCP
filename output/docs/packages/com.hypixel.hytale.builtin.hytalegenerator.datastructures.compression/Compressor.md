---
title: "Compressor"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.compression"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.compression.Compressor"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "datastructures"
  - "compression"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.datastructures.compression`

```java
public class Compressor
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `MIN_RUN` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Compressor.CompressedArray<T>` | `compressOnReference(T[] in)` |
| `@Nonnull public` | `T[]` | `decompress(Compressor.CompressedArray<T> compressedArray)` |

## Inner Types

- `Compressor.CompressedArray`
- `Compressor.Run`
