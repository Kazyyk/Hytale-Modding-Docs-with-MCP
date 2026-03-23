---
title: "Validators"
kind: "class"
package: "com.hypixel.hytale.codec.validation"
fqcn: "com.hypixel.hytale.codec.validation.Validators"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "codec"
  - "validation"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.validation`

```java
public class Validators
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static <T>` | `DeprecatedValidator<T>` | `deprecated()` |
| `@Nonnull public static <T>` | `Validator<T>` | `nonNull()` |
| `@Nonnull public static <T>` | `ArrayValidator<T>` | `nonNullArrayElements()` |
| `@Nonnull public static` | `Validator<String>` | `nonEmptyString()` |
| `@Nonnull public static <T>` | `Validator<T[]>` | `nonEmptyArray()` |
| `@Nonnull public static <T>` | `Validator<T[]>` | `uniqueInArray()` |
| `@Nonnull public static <T>` | `Validator<T[]>` | `arraySizeRange(int min, int max)` |
| `@Nonnull public static <T>` | `Validator<T[]>` | `arraySize(int size)` |
| `@Nonnull public static` | `Validator<int[]>` | `intArraySize(int size)` |
| `@Nonnull public static` | `Validator<double[]>` | `doubleArraySize(int size)` |
| `@Nonnull public static` | `Validator<double[]>` | `nonEmptyDoubleArray()` |
| `@Nonnull public static` | `Validator<float[]>` | `nonEmptyFloatArray()` |
| `@Nonnull public static` | `Validator<double[]>` | `monotonicSequentialDoubleArrayValidator()` |
| `@Nonnull public static` | `Validator<double[]>` | `weaklyMonotonicSequentialDoubleArrayValidator()` |
| `@Nonnull public static <T>` | `Validator<T>` | `or(Validator<T>... validators)` |
| `@Nonnull public static <T>` | `Validator<List<T>>` | `listItem(Validator<T> validator)` |
