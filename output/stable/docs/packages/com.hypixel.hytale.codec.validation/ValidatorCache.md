---
title: "ValidatorCache"
kind: "class"
package: "com.hypixel.hytale.codec.validation"
fqcn: "com.hypixel.hytale.codec.validation.ValidatorCache"
api_surface: true
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
public class ValidatorCache<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Validator<T>` | `validator` |
| `private` | `ArrayValidator<T>` | `arrayValidator` |
| `private` | `ArrayValidator<T[]>` | `arrayofArrayValidator` |
| `private` | `MapKeyValidator<T>` | `mapKeyValidator` |
| `private` | `MapKeyValidator<T[]>` | `mapArrayKeyValidator` |
| `private` | `MapValueValidator<T>` | `mapValueValidator` |
| `private` | `MapValueValidator<T[]>` | `mapArrayValueValidator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Validator<T>` | `getValidator()` |
| `@Nonnull public` | `ArrayValidator<T>` | `getArrayValidator()` |
| `@Nonnull public` | `ArrayValidator<T[]>` | `getArrayOfArrayValidator()` |
| `@Nonnull public` | `MapKeyValidator<T>` | `getMapKeyValidator()` |
| `@Nonnull public` | `MapKeyValidator<T[]>` | `getMapArrayKeyValidator()` |
| `@Nonnull public` | `MapValueValidator<T>` | `getMapValueValidator()` |
| `@Nonnull public` | `MapValueValidator<T[]>` | `getMapArrayValueValidator()` |
