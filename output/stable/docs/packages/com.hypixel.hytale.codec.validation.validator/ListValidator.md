---
title: "ListValidator"
kind: "class"
package: "com.hypixel.hytale.codec.validation.validator"
fqcn: "com.hypixel.hytale.codec.validation.validator.ListValidator"
api_surface: false
extends: null
implements:
  - "LegacyValidator"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "codec"
  - "validator"
---
**Package:** `com.hypixel.hytale.codec.validation.validator`

```java
public class ListValidator<T> implements LegacyValidator<List<T>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Validator<T>` | `validator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ListValidator(Validator<T> validator)` |
| `public` | `void` | `accept(@Nonnull List<T> ts, ValidationResults results)` |
